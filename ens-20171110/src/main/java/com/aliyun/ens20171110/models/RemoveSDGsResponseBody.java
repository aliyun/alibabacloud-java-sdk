// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveSDGsResponseBody extends TeaModel {
    @NameInMap("Data")
    public RemoveSDGsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>903819D9-D18B-5C59-8DFD-20D56FD2DAE4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSDGsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSDGsResponseBody self = new RemoveSDGsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSDGsResponseBody setData(RemoveSDGsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveSDGsResponseBodyData getData() {
        return this.data;
    }

    public RemoveSDGsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveSDGsResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sdg not found</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <strong>example:</strong>
         * <p>aic-xxxxx-0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static RemoveSDGsResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            RemoveSDGsResponseBodyDataResultFailedItems self = new RemoveSDGsResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public RemoveSDGsResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public RemoveSDGsResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class RemoveSDGsResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedItems")
        public java.util.List<RemoveSDGsResponseBodyDataResultFailedItems> failedItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static RemoveSDGsResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveSDGsResponseBodyDataResult self = new RemoveSDGsResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public RemoveSDGsResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public RemoveSDGsResponseBodyDataResult setFailedItems(java.util.List<RemoveSDGsResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<RemoveSDGsResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public RemoveSDGsResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class RemoveSDGsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public RemoveSDGsResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveSDGsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveSDGsResponseBodyData self = new RemoveSDGsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveSDGsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveSDGsResponseBodyData setResult(RemoveSDGsResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public RemoveSDGsResponseBodyDataResult getResult() {
            return this.result;
        }

        public RemoveSDGsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
