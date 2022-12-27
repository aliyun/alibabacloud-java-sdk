// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateDeployKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateDeployKeyResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateDeployKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployKeyResponseBody self = new CreateDeployKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeployKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDeployKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeployKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeployKeyResponseBody setResult(CreateDeployKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDeployKeyResponseBodyResult getResult() {
        return this.result;
    }

    public CreateDeployKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeployKeyResponseBodyResult extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("fingerprint")
        public String fingerprint;

        @NameInMap("id")
        public Long id;

        @NameInMap("key")
        public String key;

        @NameInMap("title")
        public String title;

        public static CreateDeployKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDeployKeyResponseBodyResult self = new CreateDeployKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDeployKeyResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateDeployKeyResponseBodyResult setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public CreateDeployKeyResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateDeployKeyResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDeployKeyResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
