// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveInstanceSDGResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public RemoveInstanceSDGResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceSDGResponseBody self = new RemoveInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceSDGResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RemoveInstanceSDGResponseBody setData(RemoveInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public RemoveInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
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

        public static RemoveInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            RemoveInstanceSDGResponseBodyDataResultFailedItems self = new RemoveInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public RemoveInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public RemoveInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class RemoveInstanceSDGResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedItems")
        public java.util.List<RemoveInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static RemoveInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            RemoveInstanceSDGResponseBodyDataResult self = new RemoveInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public RemoveInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public RemoveInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<RemoveInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<RemoveInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public RemoveInstanceSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class RemoveInstanceSDGResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public RemoveInstanceSDGResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveInstanceSDGResponseBodyData self = new RemoveInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveInstanceSDGResponseBodyData setResult(RemoveInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public RemoveInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public RemoveInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
