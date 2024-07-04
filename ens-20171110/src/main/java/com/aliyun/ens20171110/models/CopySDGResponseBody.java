// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CopySDGResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public CopySDGResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX-XXX-XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopySDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopySDGResponseBody self = new CopySDGResponseBody();
        return TeaModel.build(map, self);
    }

    public CopySDGResponseBody setData(CopySDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CopySDGResponseBodyData getData() {
        return this.data;
    }

    public CopySDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CopySDGResponseBodyDataResultFailedItems extends TeaModel {
        /**
         * <p>The ID of the destination node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-xxx</p>
         */
        @NameInMap("DestinationRegionId")
        public String destinationRegionId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>region not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static CopySDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            CopySDGResponseBodyDataResultFailedItems self = new CopySDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public CopySDGResponseBodyDataResultFailedItems setDestinationRegionId(String destinationRegionId) {
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public CopySDGResponseBodyDataResultFailedItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class CopySDGResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of failed nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>Details of failed nodes.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<CopySDGResponseBodyDataResultFailedItems> failedItems;

        /**
         * <p>The number of successful nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static CopySDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            CopySDGResponseBodyDataResult self = new CopySDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public CopySDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public CopySDGResponseBodyDataResult setFailedItems(java.util.List<CopySDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<CopySDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public CopySDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class CopySDGResponseBodyData extends TeaModel {
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
        public CopySDGResponseBodyDataResult result;

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

        public static CopySDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CopySDGResponseBodyData self = new CopySDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CopySDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CopySDGResponseBodyData setResult(CopySDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public CopySDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public CopySDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
