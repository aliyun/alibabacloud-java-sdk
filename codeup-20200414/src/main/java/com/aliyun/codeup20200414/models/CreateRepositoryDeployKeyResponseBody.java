// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryDeployKeyResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public CreateRepositoryDeployKeyResponseBodyResult result;

    public static CreateRepositoryDeployKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryDeployKeyResponseBody self = new CreateRepositoryDeployKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryDeployKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRepositoryDeployKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepositoryDeployKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateRepositoryDeployKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateRepositoryDeployKeyResponseBody setResult(CreateRepositoryDeployKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRepositoryDeployKeyResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRepositoryDeployKeyResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Key")
        public String key;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("FingerPrint")
        public String fingerPrint;

        public static CreateRepositoryDeployKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRepositoryDeployKeyResponseBodyResult self = new CreateRepositoryDeployKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRepositoryDeployKeyResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateRepositoryDeployKeyResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRepositoryDeployKeyResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateRepositoryDeployKeyResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateRepositoryDeployKeyResponseBodyResult setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

    }

}
