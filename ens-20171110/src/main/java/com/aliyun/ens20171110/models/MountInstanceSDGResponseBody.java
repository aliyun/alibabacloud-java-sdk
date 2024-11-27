// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class MountInstanceSDGResponseBody extends TeaModel {
    @NameInMap("Data")
    public MountInstanceSDGResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MountInstanceSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountInstanceSDGResponseBody self = new MountInstanceSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public MountInstanceSDGResponseBody setData(MountInstanceSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MountInstanceSDGResponseBodyData getData() {
        return this.data;
    }

    public MountInstanceSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MountInstanceSDGResponseBodyDataResultFailedItems extends TeaModel {
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

        public static MountInstanceSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            MountInstanceSDGResponseBodyDataResultFailedItems self = new MountInstanceSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public MountInstanceSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public MountInstanceSDGResponseBodyDataResultFailedItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class MountInstanceSDGResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedItems")
        public java.util.List<MountInstanceSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static MountInstanceSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            MountInstanceSDGResponseBodyDataResult self = new MountInstanceSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public MountInstanceSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public MountInstanceSDGResponseBodyDataResult setFailedItems(java.util.List<MountInstanceSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<MountInstanceSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public MountInstanceSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class MountInstanceSDGResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public MountInstanceSDGResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static MountInstanceSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MountInstanceSDGResponseBodyData self = new MountInstanceSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MountInstanceSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public MountInstanceSDGResponseBodyData setResult(MountInstanceSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public MountInstanceSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public MountInstanceSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
