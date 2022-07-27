// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSshKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sshKey")
    public CreateSshKeyResponseBodySshKey sshKey;

    @NameInMap("success")
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

    public CreateSshKeyResponseBody setSshKey(CreateSshKeyResponseBodySshKey sshKey) {
        this.sshKey = sshKey;
        return this;
    }
    public CreateSshKeyResponseBodySshKey getSshKey() {
        return this.sshKey;
    }

    public CreateSshKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSshKeyResponseBodySshKey extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("publicKey")
        public String publicKey;

        public static CreateSshKeyResponseBodySshKey build(java.util.Map<String, ?> map) throws Exception {
            CreateSshKeyResponseBodySshKey self = new CreateSshKeyResponseBodySshKey();
            return TeaModel.build(map, self);
        }

        public CreateSshKeyResponseBodySshKey setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateSshKeyResponseBodySshKey setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

    }

}
