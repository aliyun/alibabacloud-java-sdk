// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetIdpConfigResponseBodyData data;

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
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>AccessKey Secret</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Description")
        public String description;

        @NameInMap("GetGroupUrl")
        public String getGroupUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdpMetadata")
        public String idpMetadata;

        @NameInMap("MfaConfigType")
        public String mfaConfigType;

        @NameInMap("MobileLoginType")
        public String mobileLoginType;

        @NameInMap("MobileMfaConfigType")
        public String mobileMfaConfigType;

        @NameInMap("MultiIdpInfo")
        public String multiIdpInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("PcLoginType")
        public String pcLoginType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("VerifyAesKey")
        public String verifyAesKey;

        @NameInMap("VerifyToken")
        public String verifyToken;

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
