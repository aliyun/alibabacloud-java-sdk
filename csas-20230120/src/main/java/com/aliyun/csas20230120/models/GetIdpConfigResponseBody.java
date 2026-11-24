// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigResponseBody extends TeaModel {
    /**
     * <p>The identity source configuration.</p>
     */
    @NameInMap("Data")
    public GetIdpConfigResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The AccessKey ID of the IDaaS identity source.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleAccessKeyId****</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret of the IDaaS identity source.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleAccessKeySecret****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <p>The description of the identity source configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample identity source</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL used to query the organizational structure of a self-managed identity source.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://172.10.XX.XX:4321/getGroup?name=%s&pass=%s">https://172.10.XX.XX:4321/getGroup?name=%s&amp;pass=%s</a></p>
         */
        @NameInMap("GetGroupUrl")
        public String getGroupUrl;

        /**
         * <p>The ID of the identity source configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>idp-cfg68956d86e********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The metadata of the identity provider (IdP).</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" encoding="utf-8"?><hr>
         */
        @NameInMap("IdpMetadata")
        public String idpMetadata;

        /**
         * <p>The configuration type of secondary authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MfaConfigType")
        public String mfaConfigType;

        /**
         * <p>The logon type for mobile devices.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        /**
         * <p>The configuration type of secondary authentication for mobile devices.</p>
         * 
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        /**
         * <p>The IDs of multiple identity source configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1482,1355</p>
         */
        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        /**
         * <p>The name of the identity source configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample identity source</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The logon type for PCs.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PcLoginType")
        public String pcLoginType;

        /**
         * <p>The enabling status of the identity source configuration. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the identity source configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>CSAS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-26T02:02:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The encryption key used for requests to a self-managed secondary authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p>QVhaU0RDR0JIWV****</p>
         */
        @NameInMap("VerifyAesKey")
        public String verifyAesKey;

        /**
         * <p>The token used to verify the request signature of a self-managed secondary authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p>7JAr3fYtn****</p>
         */
        @NameInMap("VerifyToken")
        public String verifyToken;

        /**
         * <p>The verification URL of a self-managed secondary authentication service.</p>
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
