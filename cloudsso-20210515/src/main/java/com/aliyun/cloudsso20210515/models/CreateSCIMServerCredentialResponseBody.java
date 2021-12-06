// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateSCIMServerCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SCIMServerCredential")
    public CreateSCIMServerCredentialResponseBodySCIMServerCredential SCIMServerCredential;

    public static CreateSCIMServerCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSCIMServerCredentialResponseBody self = new CreateSCIMServerCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSCIMServerCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSCIMServerCredentialResponseBody setSCIMServerCredential(CreateSCIMServerCredentialResponseBodySCIMServerCredential SCIMServerCredential) {
        this.SCIMServerCredential = SCIMServerCredential;
        return this;
    }
    public CreateSCIMServerCredentialResponseBodySCIMServerCredential getSCIMServerCredential() {
        return this.SCIMServerCredential;
    }

    public static class CreateSCIMServerCredentialResponseBodySCIMServerCredential extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialId")
        public String credentialId;

        @NameInMap("CredentialSecret")
        public String credentialSecret;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Status")
        public String status;

        public static CreateSCIMServerCredentialResponseBodySCIMServerCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateSCIMServerCredentialResponseBodySCIMServerCredential self = new CreateSCIMServerCredentialResponseBodySCIMServerCredential();
            return TeaModel.build(map, self);
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setCredentialSecret(String credentialSecret) {
            this.credentialSecret = credentialSecret;
            return this;
        }
        public String getCredentialSecret() {
            return this.credentialSecret;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateSCIMServerCredentialResponseBodySCIMServerCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
