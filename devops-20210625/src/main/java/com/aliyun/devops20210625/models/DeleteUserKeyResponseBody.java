// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteUserKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeleteUserKeyResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteUserKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserKeyResponseBody self = new DeleteUserKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteUserKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteUserKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserKeyResponseBody setResult(DeleteUserKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteUserKeyResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteUserKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteUserKeyResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("fingerPrint")
        public String fingerPrint;

        /**
         * <strong>example:</strong>
         * <p>50998</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("keyScope")
        public String keyScope;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("lastUsedTime")
        public String lastUsedTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("publicKey")
        public String publicKey;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("shaContext")
        public String shaContext;

        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static DeleteUserKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteUserKeyResponseBodyResult self = new DeleteUserKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteUserKeyResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public DeleteUserKeyResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DeleteUserKeyResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DeleteUserKeyResponseBodyResult setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public DeleteUserKeyResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteUserKeyResponseBodyResult setKeyScope(String keyScope) {
            this.keyScope = keyScope;
            return this;
        }
        public String getKeyScope() {
            return this.keyScope;
        }

        public DeleteUserKeyResponseBodyResult setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        public DeleteUserKeyResponseBodyResult setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public DeleteUserKeyResponseBodyResult setShaContext(String shaContext) {
            this.shaContext = shaContext;
            return this;
        }
        public String getShaContext() {
            return this.shaContext;
        }

        public DeleteUserKeyResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DeleteUserKeyResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
