// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnloadRegionSDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public UnloadRegionSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnloadRegionSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnloadRegionSDGResponseBody self = new UnloadRegionSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public UnloadRegionSDGResponseBody setData(UnloadRegionSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnloadRegionSDGResponseBodyData getData() {
        return this.data;
    }

    public UnloadRegionSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnloadRegionSDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <p>The ID of the destination node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-xxx</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The error message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>region not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static UnloadRegionSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            UnloadRegionSDGResponseBodyDataResultFailedItems self = new UnloadRegionSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public UnloadRegionSDGResponseBodyDataResultFailedItems setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public UnloadRegionSDGResponseBodyDataResultFailedItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class UnloadRegionSDGResponseBodyDataResult extends TeaModel {
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
        public java.util.List<UnloadRegionSDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static UnloadRegionSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            UnloadRegionSDGResponseBodyDataResult self = new UnloadRegionSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public UnloadRegionSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public UnloadRegionSDGResponseBodyDataResult setFailedItems(java.util.List<UnloadRegionSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<UnloadRegionSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public UnloadRegionSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class UnloadRegionSDGResponseBodyData extends TeaModel {
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
        public UnloadRegionSDGResponseBodyDataResult result;

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

        public static UnloadRegionSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnloadRegionSDGResponseBodyData self = new UnloadRegionSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnloadRegionSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnloadRegionSDGResponseBodyData setResult(UnloadRegionSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public UnloadRegionSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public UnloadRegionSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
