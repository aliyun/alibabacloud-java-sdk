// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PreloadRegionSDGResponseBody extends TeaModel {
    @NameInMap("Data")
    public PreloadRegionSDGResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreloadRegionSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadRegionSDGResponseBody self = new PreloadRegionSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadRegionSDGResponseBody setData(PreloadRegionSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreloadRegionSDGResponseBodyData getData() {
        return this.data;
    }

    public PreloadRegionSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PreloadRegionSDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-xxx</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <strong>example:</strong>
         * <p>region not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static PreloadRegionSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            PreloadRegionSDGResponseBodyDataResultFailedItems self = new PreloadRegionSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public PreloadRegionSDGResponseBodyDataResultFailedItems setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public PreloadRegionSDGResponseBodyDataResultFailedItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class PreloadRegionSDGResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedItems")
        public java.util.List<PreloadRegionSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static PreloadRegionSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            PreloadRegionSDGResponseBodyDataResult self = new PreloadRegionSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public PreloadRegionSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public PreloadRegionSDGResponseBodyDataResult setFailedItems(java.util.List<PreloadRegionSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<PreloadRegionSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public PreloadRegionSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class PreloadRegionSDGResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public PreloadRegionSDGResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static PreloadRegionSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreloadRegionSDGResponseBodyData self = new PreloadRegionSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreloadRegionSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public PreloadRegionSDGResponseBodyData setResult(PreloadRegionSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public PreloadRegionSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public PreloadRegionSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
