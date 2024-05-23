// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeploySDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public DeploySDGResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeploySDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeploySDGResponseBody self = new DeploySDGResponseBody();
        return TeaModel.build(map, self);
    }

    public DeploySDGResponseBody setData(DeploySDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeploySDGResponseBodyData getData() {
        return this.data;
    }

    public DeploySDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeploySDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DeploySDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            DeploySDGResponseBodyDataResultFailedItems self = new DeploySDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public DeploySDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DeploySDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DeploySDGResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of failed tasks.</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>Details of failed tasks.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<DeploySDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static DeploySDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DeploySDGResponseBodyDataResult self = new DeploySDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DeploySDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DeploySDGResponseBodyDataResult setFailedItems(java.util.List<DeploySDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<DeploySDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public DeploySDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class DeploySDGResponseBodyData extends TeaModel {
        /**
         * <p>The response message. Success is returned for a successful request.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The task result.</p>
         */
        @NameInMap("Result")
        public DeploySDGResponseBodyDataResult result;

        /**
         * <p>Indicates whether all tasks are successful. Valid values:</p>
         * <br>
         * <p>*   true: All tasks are successful.</p>
         * <p>*   false: Failed tasks exist.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeploySDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeploySDGResponseBodyData self = new DeploySDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeploySDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeploySDGResponseBodyData setResult(DeploySDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DeploySDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public DeploySDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
