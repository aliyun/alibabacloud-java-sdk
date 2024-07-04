// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteSDGResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteSDGResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86A6D421-A0C7-4C01-8648-47377CA6A2CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSDGResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSDGResponseBody self = new DeleteSDGResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSDGResponseBody setData(DeleteSDGResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSDGResponseBodyData getData() {
        return this.data;
    }

    public DeleteSDGResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteSDGResponseBodyDataResultFailedItemsItem extends TeaModel {
        @NameInMap("SdgId")
        public String sdgId;

        public static DeleteSDGResponseBodyDataResultFailedItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DeleteSDGResponseBodyDataResultFailedItemsItem self = new DeleteSDGResponseBodyDataResultFailedItemsItem();
            return TeaModel.build(map, self);
        }

        public DeleteSDGResponseBodyDataResultFailedItemsItem setSdgId(String sdgId) {
            this.sdgId = sdgId;
            return this;
        }
        public String getSdgId() {
            return this.sdgId;
        }

    }

    public static class DeleteSDGResponseBodyDataResultFailedItems extends TeaModel {
        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("Item")
        public DeleteSDGResponseBodyDataResultFailedItemsItem item;

        public static DeleteSDGResponseBodyDataResultFailedItems build(java.util.Map<String, ?> map) throws Exception {
            DeleteSDGResponseBodyDataResultFailedItems self = new DeleteSDGResponseBodyDataResultFailedItems();
            return TeaModel.build(map, self);
        }

        public DeleteSDGResponseBodyDataResultFailedItems setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public DeleteSDGResponseBodyDataResultFailedItems setItem(DeleteSDGResponseBodyDataResultFailedItemsItem item) {
            this.item = item;
            return this;
        }
        public DeleteSDGResponseBodyDataResultFailedItemsItem getItem() {
            return this.item;
        }

    }

    public static class DeleteSDGResponseBodyDataResult extends TeaModel {
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedItems")
        public java.util.List<DeleteSDGResponseBodyDataResultFailedItems> failedItems;

        @NameInMap("SuccessCount")
        public Long successCount;

        public static DeleteSDGResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteSDGResponseBodyDataResult self = new DeleteSDGResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DeleteSDGResponseBodyDataResult setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public DeleteSDGResponseBodyDataResult setFailedItems(java.util.List<DeleteSDGResponseBodyDataResultFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<DeleteSDGResponseBodyDataResultFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public DeleteSDGResponseBodyDataResult setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class DeleteSDGResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public DeleteSDGResponseBodyDataResult result;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteSDGResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSDGResponseBodyData self = new DeleteSDGResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSDGResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteSDGResponseBodyData setResult(DeleteSDGResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public DeleteSDGResponseBodyDataResult getResult() {
            return this.result;
        }

        public DeleteSDGResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
