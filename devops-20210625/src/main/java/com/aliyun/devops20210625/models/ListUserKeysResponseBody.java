// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListUserKeysResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListUserKeysResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListUserKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserKeysResponseBody self = new ListUserKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserKeysResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserKeysResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserKeysResponseBody setResult(java.util.List<ListUserKeysResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserKeysResponseBodyResult> getResult() {
        return this.result;
    }

    public ListUserKeysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUserKeysResponseBodyResult extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("expireTime")
        public String expireTime;

        @NameInMap("fingerPrint")
        public String fingerPrint;

        @NameInMap("id")
        public Long id;

        @NameInMap("keyScope")
        public String keyScope;

        @NameInMap("lastUsedTime")
        public String lastUsedTime;

        @NameInMap("publicKey")
        public String publicKey;

        @NameInMap("title")
        public String title;

        public static ListUserKeysResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserKeysResponseBodyResult self = new ListUserKeysResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserKeysResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListUserKeysResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListUserKeysResponseBodyResult setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public ListUserKeysResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListUserKeysResponseBodyResult setKeyScope(String keyScope) {
            this.keyScope = keyScope;
            return this;
        }
        public String getKeyScope() {
            return this.keyScope;
        }

        public ListUserKeysResponseBodyResult setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListUserKeysResponseBodyResult setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListUserKeysResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
