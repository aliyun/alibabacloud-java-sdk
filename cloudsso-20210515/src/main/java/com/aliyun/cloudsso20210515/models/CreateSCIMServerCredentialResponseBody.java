// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateSCIMServerCredentialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D2E5180-7ACF-57FF-A56C-26A49ABEBFF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SCIM credential.</p>
     */
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
        /**
         * <p>The time when the SCIM credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-09T08:12:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SCIM credential.</p>
         * 
         * <strong>example:</strong>
         * <p>scimcred-004whl0kvfwcypbi****</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>The SCIM credential.</p>
         * <blockquote>
         * <p> The SCIM credential is returned only when it is created. After the SCIM credential is created, you cannot query it. Keep the SCIM credential confidential.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8aAJCtpbyPJ8saXeYDgyw****</p>
         */
        @NameInMap("CredentialSecret")
        public String credentialSecret;

        /**
         * <p>The type of the SCIM credential.</p>
         * 
         * <strong>example:</strong>
         * <p>BearerToken</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The time when the SCIM credential expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-09T08:12:52Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the SCIM credential. The value is fixed as Enabled, which indicates that the SCIM credential is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
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
