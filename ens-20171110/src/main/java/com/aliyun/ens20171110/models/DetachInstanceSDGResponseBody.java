// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachInstanceSDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public DetachInstanceSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceSDGResponseBody self = new DetachInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachInstanceSDGResponseBody setData(DetachInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetachInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public DetachInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg not found</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-xxxxx-0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DetachInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceSDGResponseBodyDataResultFailedItems self = new DetachInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public DetachInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DetachInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DetachInstanceSDGResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>Details about failed tasks.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<DetachInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public String successCount;

        public static DetachInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceSDGResponseBodyDataResult self = new DetachInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DetachInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DetachInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<DetachInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<DetachInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public DetachInstanceSDGResponseBodyDataResult setSuccessCount(String successCount) {
            this.successCount = successCount;
            return this;
        }
        public String getSuccessCount() {
            return this.successCount;
        }

    }

    public static class DetachInstanceSDGResponseBodyData extends TeaModel {
        /**
         * <p>The response message. Success is returned for a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The execution result of the synchronization request.</p>
         */
        @NameInMap("Result")
        public DetachInstanceSDGResponseBodyDataResult result;

        /**
         * <p>Indicates whether all tasks are successful. Valid values:</p>
         * <ul>
         * <li>true: All tasks are successful.</li>
         * <li>false: Failed tasks exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DetachInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceSDGResponseBodyData self = new DetachInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetachInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachInstanceSDGResponseBodyData setResult(DetachInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DetachInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public DetachInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
