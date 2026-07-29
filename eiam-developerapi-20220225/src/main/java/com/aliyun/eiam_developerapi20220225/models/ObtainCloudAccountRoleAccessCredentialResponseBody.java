// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCloudAccountRoleAccessCredentialResponseBody extends TeaModel {
    /**
     * <p>The cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("cloudAccountId")
    public String cloudAccountId;

    /**
     * <p>The temporary access credentials for assuming the cloud account role.</p>
     */
    @NameInMap("cloudAccountRoleAccessCredential")
    public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential cloudAccountRoleAccessCredential;

    /**
     * <p>The business identifier of the cloud account role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxx:role/role-test</p>
     */
    @NameInMap("cloudAccountRoleExternalId")
    public String cloudAccountRoleExternalId;

    /**
     * <p>The cloud account role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>carole_01kmek49aqxxxx</p>
     */
    @NameInMap("cloudAccountRoleId")
    public String cloudAccountRoleId;

    /**
     * <p>The cloud account role name.</p>
     * 
     * <strong>example:</strong>
     * <p>role-test</p>
     */
    @NameInMap("cloudAccountRoleName")
    public String cloudAccountRoleName;

    /**
     * <p>The cloud account type. Valid values:</p>
     * <ul>
     * <li>alibaba_cloud: Alibaba Cloud.</li>
     * </ul>
     * 
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
         * <p>The access key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NUgYrLnoC37mZZCNnAbez****</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <p>The access key secret.</p>
         * 
         * <strong>example:</strong>
         * <p>CVwjCkNzTMupZ8NbTCxCBRq3K16jtcWFTJAyBEv2****</p>
         */
        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The expiration time of the token (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T04:27:09Z</p>
         */
        @NameInMap("expiration")
        public String expiration;

        /**
         * <p>The security token.</p>
         * 
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

    public static class ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken extends TeaModel {
        /**
         * <p>The access key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ASIAYBGN7XJKRFOM****</p>
         */
        @NameInMap("accessKeyId")
        public String accessKeyId;

        /**
         * <p>The expiration time of the STS Token (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-20T04:27:09Z</p>
         */
        @NameInMap("expiration")
        public String expiration;

        /**
         * <p>The secret access key.</p>
         * 
         * <strong>example:</strong>
         * <p>CVwjCkNzTMupZ8NbTCxCBRq3K16jtcWFTJAyBEv2****</p>
         */
        @NameInMap("secretAccessKey")
        public String secretAccessKey;

        /**
         * <p>The session token of the temporary credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>FwoDYXdzEJzfSjIr5bSEsj4g7BihPWGWHz****</p>
         */
        @NameInMap("sessionToken")
        public String sessionToken;

        public static ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken build(java.util.Map<String, ?> map) throws Exception {
            ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken self = new ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken();
            return TeaModel.build(map, self);
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public String getSecretAccessKey() {
            return this.secretAccessKey;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken setSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }
        public String getSessionToken() {
            return this.sessionToken;
        }

    }

    public static class ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken extends TeaModel {
        @NameInMap("expiration")
        public String expiration;

        @NameInMap("tmpSecretId")
        public String tmpSecretId;

        @NameInMap("tmpSecretKey")
        public String tmpSecretKey;

        @NameInMap("token")
        public String token;

        public static ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken build(java.util.Map<String, ?> map) throws Exception {
            ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken self = new ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken();
            return TeaModel.build(map, self);
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken setTmpSecretId(String tmpSecretId) {
            this.tmpSecretId = tmpSecretId;
            return this;
        }
        public String getTmpSecretId() {
            return this.tmpSecretId;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken setTmpSecretKey(String tmpSecretKey) {
            this.tmpSecretKey = tmpSecretKey;
            return this;
        }
        public String getTmpSecretKey() {
            return this.tmpSecretKey;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential extends TeaModel {
        /**
         * <p>The expiration time of the temporary access credentials for the cloud account role, in UNIX timestamp format and in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1767196800</p>
         */
        @NameInMap("accessCredentialExpiresAt")
        public Long accessCredentialExpiresAt;

        /**
         * <p>The temporary identity credentials (STS Token) for assuming an Alibaba Cloud RAM role.</p>
         * <blockquote>
         * <p>This field is returned only when the cloud account type associated with the cloud account role is Alibaba Cloud (alibaba_cloud).</p>
         * </blockquote>
         */
        @NameInMap("alibabaCloudStsToken")
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAlibabaCloudStsToken alibabaCloudStsToken;

        /**
         * <p>The STS Token representing an AWS role.</p>
         */
        @NameInMap("awsStsToken")
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken awsStsToken;

        @NameInMap("tencentCloudStsToken")
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken tencentCloudStsToken;

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

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential setAwsStsToken(ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken awsStsToken) {
            this.awsStsToken = awsStsToken;
            return this;
        }
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialAwsStsToken getAwsStsToken() {
            return this.awsStsToken;
        }

        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredential setTencentCloudStsToken(ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken tencentCloudStsToken) {
            this.tencentCloudStsToken = tencentCloudStsToken;
            return this;
        }
        public ObtainCloudAccountRoleAccessCredentialResponseBodyCloudAccountRoleAccessCredentialTencentCloudStsToken getTencentCloudStsToken() {
            return this.tencentCloudStsToken;
        }

    }

}
