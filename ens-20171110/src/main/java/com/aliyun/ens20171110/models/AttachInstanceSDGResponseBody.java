// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public AttachInstanceSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceSDGResponseBody self = new AttachInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstanceSDGResponseBody setData(AttachInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AttachInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public AttachInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
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

        public static AttachInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceSDGResponseBodyDataResultFailedItems self = new AttachInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public AttachInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public AttachInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class AttachInstanceSDGResponseBodyDataResult extends TeaModel {
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
        public java.util.List<AttachInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static AttachInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceSDGResponseBodyDataResult self = new AttachInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public AttachInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public AttachInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<AttachInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<AttachInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public AttachInstanceSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class AttachInstanceSDGResponseBodyData extends TeaModel {
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
        public AttachInstanceSDGResponseBodyDataResult result;

        /**
         * <p>Indicates whether all tasks are successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: All tasks are successful.</li>
         * <li><strong>false</strong>: Failed tasks exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AttachInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceSDGResponseBodyData self = new AttachInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AttachInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachInstanceSDGResponseBodyData setResult(AttachInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public AttachInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public AttachInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
