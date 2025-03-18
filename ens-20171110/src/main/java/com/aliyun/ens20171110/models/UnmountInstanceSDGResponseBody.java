// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnmountInstanceSDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public UnmountInstanceSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnmountInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmountInstanceSDGResponseBody self = new UnmountInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmountInstanceSDGResponseBody setData(UnmountInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnmountInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public UnmountInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnmountInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
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

        public static UnmountInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            UnmountInstanceSDGResponseBodyDataResultFailedItems self = new UnmountInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public UnmountInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public UnmountInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UnmountInstanceSDGResponseBodyDataResult extends TeaModel {
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
        public java.util.List<UnmountInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static UnmountInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            UnmountInstanceSDGResponseBodyDataResult self = new UnmountInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public UnmountInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public UnmountInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<UnmountInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<UnmountInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public UnmountInstanceSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class UnmountInstanceSDGResponseBodyData extends TeaModel {
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
        public UnmountInstanceSDGResponseBodyDataResult result;

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

        public static UnmountInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnmountInstanceSDGResponseBodyData self = new UnmountInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnmountInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnmountInstanceSDGResponseBodyData setResult(UnmountInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public UnmountInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public UnmountInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
