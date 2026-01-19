// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCloudAccountRoleAccessCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("cloudAccountId")
    public String cloudAccountId;

    @NameInMap("cloudAccountRoleAccessCredential")
    public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential cloudAccountRoleAccessCredential;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::xxx:role/role-test</p>
     */
    @NameInMap("cloudAccountRoleExternalId")
    public String cloudAccountRoleExternalId;

    /**
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("cloudAccountRoleId")
    public String cloudAccountRoleId;

    /**
     * <strong>example:</strong>
     * <p>role-test</p>
     */
    @NameInMap("cloudAccountRoleName")
    public String cloudAccountRoleName;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud</p>
     */
    @NameInMap("cloudAccountVendorType")
    public String cloudAccountVendorType;

    public static ObtainCloudAccountRoleAccessCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainCloudAccountRoleAccessCredentialResponseBody self = new ObtainCloudAccountRoleAccessCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountRoleAccessCredential(ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential cloudAccountRoleAccessCredential) {
        this.cloudAccountRoleAccessCredential = cloudAccountRoleAccessCredential;
        return this;
    }
    public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential getCloudAccountRoleAccessCredential() {
        return this.cloudAccountRoleAccessCredential;
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
        this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
        return this;
    }
    public String getCloudAccountRoleExternalId() {
        return this.cloudAccountRoleExternalId;
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountRoleId(String cloudAccountRoleId) {
        this.cloudAccountRoleId = cloudAccountRoleId;
        return this;
    }
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountRoleName(String cloudAccountRoleName) {
        this.cloudAccountRoleName = cloudAccountRoleName;
        return this;
    }
    public String getCloudAccountRoleName() {
        return this.cloudAccountRoleName;
    }

    public ObtainCloudAccountRoleAccessCredentialResponseBody setCloudAccountVendorType(String cloudAccountVendorType) {
        this.cloudAccountVendorType = cloudAccountVendorType;
        return this;
    }
    public String getCloudAccountVendorType() {
        return this.cloudAccountVendorType;
    }

    public static class ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STS.NUgYrLnoC37mZZCNnAbez****</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>CVwjCkNzTMupZ8NbTCxCBRq3K16jtcWFTJAyBEv2****</p>
         */
        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>2021-10-20T04:27:09Z</p>
         */
        @NameInMap("expiration")
        public String expiration;

        /**
         * <strong>example:</strong>
         * <p>CAIShwJ1q6Ft5B2yfSjIr5bSEsj4g7BihPWGWHz****</p>
         */
        @NameInMap("securityToken")
        public String securityToken;

        public static ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken build(java.util.Map<String, ?> map) throws Exception {
            ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken self = new ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken();
            return TeaModel.build(map, self);
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1767196800</p>
         */
        @NameInMap("accessCredentialExpiresAt")
        public Long accessCredentialExpiresAt;

        @NameInMap("alibabaCloudStsToken")
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken alibabaCloudStsToken;

        public static ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential build(java.util.Map<String, ?> map) throws Exception {
            ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential self = new ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential();
            return TeaModel.build(map, self);
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential setAccessCredentialExpiresAt(Long accessCredentialExpiresAt) {
            this.accessCredentialExpiresAt = accessCredentialExpiresAt;
            return this;
        }
        public Long getAccessCredentialExpiresAt() {
            return this.accessCredentialExpiresAt;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential setAlibabaCloudStsToken(ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken alibabaCloudStsToken) {
            this.alibabaCloudStsToken = alibabaCloudStsToken;
            return this;
        }
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken getAlibabaCloudStsToken() {
            return this.alibabaCloudStsToken;
        }

    }

}
