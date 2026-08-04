// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigResponseBody extends TeaModel {
    /**
     * <p>Identity provider configuration.</p>
     */
    @NameInMap("Data")
    public GetIdpConfigResponseBodyData data;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdpConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdpConfigResponseBody self = new GetIdpConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdpConfigResponseBody setData(GetIdpConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdpConfigResponseBodyData getData() {
        return this.data;
    }

    public GetIdpConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdpConfigResponseBodyData extends TeaModel {
        /**
         * <p>AccessKey ID for the IDaaS identity provider.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>AccessKey for the IDaaS identity provider.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>Description of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>示例身份源</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>URL to query the organizational structure from a custom identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://172.10.XX.XX:4321/getGroup?name=%s&pass=%s">https://172.10.XX.XX:4321/getGroup?name=%s&amp;pass=%s</a></p>
         */
        @NameInMap("GetGroupUrl")
        public String getGroupUrl;

        /**
         * <p>ID of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-cfg68956d86e********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Metadata of the identity provider (IdP).</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" encoding="utf-8"?><hr>
         */
        @NameInMap("IdpMetadata")
        public String idpMetadata;

        /**
         * <p>Type of multi-factor authentication (MFA) configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MfaConfigType")
        public String mfaConfigType;

        /**
         * <p>Login type for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        /**
         * <p>Type of MFA configuration for mobile clients.</p>
         * 
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        /**
         * <p>List of IDs for multiple identity providers.</p>
         * 
         * <strong>example:</strong>
         * <p>1482,1355</p>
         */
        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        /**
         * <p>Name of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>示例身份源</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Login type for PC clients.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PcLoginType")
        public String pcLoginType;

        /**
         * <p>Status of the identity provider configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Type of the identity provider configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>CSAS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Time when the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-26T02:02:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>AES key used to encrypt requests to a custom MFA service.</p>
         * 
         * <strong>example:</strong>
         * <p>QVhaU0RDR0JIWV****</p>
         */
        @NameInMap("VerifyAesKey")
        public String verifyAesKey;

        /**
         * <p>Token used to verify signatures in requests to a custom MFA service.</p>
         * 
         * <strong>example:</strong>
         * <p>7JAr3fYtn****</p>
         */
        @NameInMap("VerifyToken")
        public String verifyToken;

        /**
         * <p>URL used to verify one-time passwords with a custom MFA service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://172.10.XX.XX:1234/otp_verify">http://172.10.XX.XX:1234/otp_verify</a></p>
         */
        @NameInMap("VerifyUrl")
        public String verifyUrl;

        public static GetIdpConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdpConfigResponseBodyData self = new GetIdpConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdpConfigResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetIdpConfigResponseBodyData setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetIdpConfigResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetIdpConfigResponseBodyData setGetGroupUrl(String getGroupUrl) {
            this.getGroupUrl = getGroupUrl;
            return this;
        }
        public String getGetGroupUrl() {
            return this.getGroupUrl;
        }

        public GetIdpConfigResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetIdpConfigResponseBodyData setIdpMetadata(String idpMetadata) {
            this.idpMetadata = idpMetadata;
            return this;
        }
        public String getIdpMetadata() {
            return this.idpMetadata;
        }

        public GetIdpConfigResponseBodyData setMfaConfigType(String mfaConfigType) {
            this.mfaConfigType = mfaConfigType;
            return this;
        }
        public String getMfaConfigType() {
            return this.mfaConfigType;
        }

        public GetIdpConfigResponseBodyData setMobileLoginType(String mobileLoginType) {
            this.mobileLoginType = mobileLoginType;
            return this;
        }
        public String getMobileLoginType() {
            return this.mobileLoginType;
        }

        public GetIdpConfigResponseBodyData setMobileMfaConfigType(String mobileMfaConfigType) {
            this.mobileMfaConfigType = mobileMfaConfigType;
            return this;
        }
        public String getMobileMfaConfigType() {
            return this.mobileMfaConfigType;
        }

        public GetIdpConfigResponseBodyData setMultiIdpInfo(String multiIdpInfo) {
            this.multiIdpInfo = multiIdpInfo;
            return this;
        }
        public String getMultiIdpInfo() {
            return this.multiIdpInfo;
        }

        public GetIdpConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIdpConfigResponseBodyData setPcLoginType(String pcLoginType) {
            this.pcLoginType = pcLoginType;
            return this;
        }
        public String getPcLoginType() {
            return this.pcLoginType;
        }

        public GetIdpConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetIdpConfigResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetIdpConfigResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetIdpConfigResponseBodyData setVerifyAesKey(String verifyAesKey) {
            this.verifyAesKey = verifyAesKey;
            return this;
        }
        public String getVerifyAesKey() {
            return this.verifyAesKey;
        }

        public GetIdpConfigResponseBodyData setVerifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }
        public String getVerifyToken() {
            return this.verifyToken;
        }

        public GetIdpConfigResponseBodyData setVerifyUrl(String verifyUrl) {
            this.verifyUrl = verifyUrl;
            return this;
        }
        public String getVerifyUrl() {
            return this.verifyUrl;
        }

    }

}
