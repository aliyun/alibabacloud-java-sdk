// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateUserKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateUserKeyResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateUserKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserKeyResponseBody self = new CreateUserKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateUserKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateUserKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserKeyResponseBody setResult(CreateUserKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateUserKeyResponseBodyResult getResult() {
        return this.result;
    }

    public CreateUserKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateUserKeyResponseBodyResult extends TeaModel {
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

        public static CreateUserKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateUserKeyResponseBodyResult self = new CreateUserKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateUserKeyResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateUserKeyResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateUserKeyResponseBodyResult setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public CreateUserKeyResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateUserKeyResponseBodyResult setKeyScope(String keyScope) {
            this.keyScope = keyScope;
            return this;
        }
        public String getKeyScope() {
            return this.keyScope;
        }

        public CreateUserKeyResponseBodyResult setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        public CreateUserKeyResponseBodyResult setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public CreateUserKeyResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
