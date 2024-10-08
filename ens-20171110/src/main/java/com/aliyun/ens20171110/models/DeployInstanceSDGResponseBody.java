// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeployInstanceSDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public DeployInstanceSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeployInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceSDGResponseBody self = new DeployInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployInstanceSDGResponseBody setData(DeployInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public DeployInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeployInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <p>The error message that is returned.</p>
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

        public static DeployInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            DeployInstanceSDGResponseBodyDataResultFailedItems self = new DeployInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public DeployInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DeployInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DeployInstanceSDGResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>Details about the failed tasks.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<DeployInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static DeployInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DeployInstanceSDGResponseBodyDataResult self = new DeployInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DeployInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DeployInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<DeployInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<DeployInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public DeployInstanceSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class DeployInstanceSDGResponseBodyData extends TeaModel {
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
        public DeployInstanceSDGResponseBodyDataResult result;

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

        public static DeployInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployInstanceSDGResponseBodyData self = new DeployInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeployInstanceSDGResponseBodyData setResult(DeployInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DeployInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public DeployInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
