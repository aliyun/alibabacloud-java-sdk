// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateSshKeyResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateSshKeyResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateSshKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSshKeyResponseBody self = new CreateSshKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSshKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateSshKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateSshKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSshKeyResponseBody setResult(CreateSshKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateSshKeyResponseBodyResult getResult() {
        return this.result;
    }

    public CreateSshKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSshKeyResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("FingerPrint")
        public String fingerPrint;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyScope")
        public String keyScope;

        @NameInMap("Title")
        public String title;

        public static CreateSshKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateSshKeyResponseBodyResult self = new CreateSshKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateSshKeyResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateSshKeyResponseBodyResult setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public CreateSshKeyResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSshKeyResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSshKeyResponseBodyResult setKeyScope(String keyScope) {
            this.keyScope = keyScope;
            return this;
        }
        public String getKeyScope() {
            return this.keyScope;
        }

        public CreateSshKeyResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
