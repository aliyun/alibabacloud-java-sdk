// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetIdpConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
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
         * <p>AccessKey ID</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tJVztnh6Nn***</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>AccessKey Secret</p>
         * 
         * <strong>example:</strong>
         * <p>E75ktr5jENiR3ssjC***</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="https://172.10.10.2:4321/getGroup?name=%s&pass=%s">https://172.10.10.2:4321/getGroup?name=%s&amp;pass=%s</a></p>
         */
        @NameInMap("GetGroupUrl")
        public String getGroupUrl;

        /**
         * <strong>example:</strong>
         * <p>1465</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <?xml version="1.0" encoding="utf-8"?><hr>
         */
        @NameInMap("IdpMetadata")
        public String idpMetadata;

        /**
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MfaConfigType")
        public String mfaConfigType;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        /**
         * <strong>example:</strong>
         * <p>totp</p>
         */
        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        /**
         * <strong>example:</strong>
         * <p>1482,1355</p>
         */
        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("PcLoginType")
        public String pcLoginType;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>CSAS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2024-02-26T02:02:42Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>QVhaU0RDR0JIWVV***</p>
         */
        @NameInMap("VerifyAesKey")
        public String verifyAesKey;

        /**
         * <strong>example:</strong>
         * <p>7JAr3fYtnl***</p>
         */
        @NameInMap("VerifyToken")
        public String verifyToken;

        /**
         * <strong>example:</strong>
         * <p><a href="http://172.10.10.1:1234/otp_verify">http://172.10.10.1:1234/otp_verify</a></p>
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
