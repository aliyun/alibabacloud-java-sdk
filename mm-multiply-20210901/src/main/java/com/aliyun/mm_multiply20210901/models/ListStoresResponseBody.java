// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListStoresResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // errorMessage
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Message
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // StoreModels
    @NameInMap("StoreModels")
    public java.util.List<ListStoresResponseBodyStoreModels> storeModels;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static ListStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStoresResponseBody self = new ListStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStoresResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStoresResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStoresResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListStoresResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStoresResponseBody setStoreModels(java.util.List<ListStoresResponseBodyStoreModels> storeModels) {
        this.storeModels = storeModels;
        return this;
    }
    public java.util.List<ListStoresResponseBodyStoreModels> getStoreModels() {
        return this.storeModels;
    }

    public ListStoresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStoresResponseBodyStoreModels extends TeaModel {
        // StoreId
        @NameInMap("StoreId")
        public String storeId;

        // Title
        @NameInMap("Title")
        public String title;

        public static ListStoresResponseBodyStoreModels build(java.util.Map<String, ?> map) throws Exception {
            ListStoresResponseBodyStoreModels self = new ListStoresResponseBodyStoreModels();
            return TeaModel.build(map, self);
        }

        public ListStoresResponseBodyStoreModels setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public ListStoresResponseBodyStoreModels setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
