// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateSCIMServerCredentialStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the SCIM credential.</p>
     */
    @NameInMap("SCIMServerCredential")
    public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential SCIMServerCredential;

    public static UpdateSCIMServerCredentialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSCIMServerCredentialStatusResponseBody self = new UpdateSCIMServerCredentialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSCIMServerCredentialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSCIMServerCredentialStatusResponseBody setSCIMServerCredential(UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential SCIMServerCredential) {
        this.SCIMServerCredential = SCIMServerCredential;
        return this;
    }
    public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential getSCIMServerCredential() {
        return this.SCIMServerCredential;
    }

    public static class UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential extends TeaModel {
        /**
         * <p>The time when the SCIM credential was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the SCIM credential.</p>
         */
        @NameInMap("CredentialId")
        public String credentialId;

        /**
         * <p>The type of the SCIM credential.</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The time when the SCIM credential expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The status of the SCIM credential. Valid values:</p>
         * <br>
         * <p>*   Enabled: The SCIM credential is enabled.</p>
         * <p>*   Disabled: The SCIM credential is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential build(java.util.Map<String, ?> map) throws Exception {
            UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential self = new UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential();
            return TeaModel.build(map, self);
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public UpdateSCIMServerCredentialStatusResponseBodySCIMServerCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
