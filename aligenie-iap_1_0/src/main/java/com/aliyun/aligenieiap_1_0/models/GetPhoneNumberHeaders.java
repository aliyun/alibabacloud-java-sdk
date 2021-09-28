// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 公共入参名称
    @NameInMap("CommonParams")
    public GetPhoneNumberHeadersCommonParams commonParams;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static GetPhoneNumberHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberHeaders self = new GetPhoneNumberHeaders();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetPhoneNumberHeaders setCommonParams(GetPhoneNumberHeadersCommonParams commonParams) {
        this.commonParams = commonParams;
        return this;
    }
    public GetPhoneNumberHeadersCommonParams getCommonParams() {
        return this.commonParams;
    }

    public GetPhoneNumberHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public GetPhoneNumberHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public static class GetPhoneNumberHeadersCommonParamsUserInfo extends TeaModel {
        // 用户openId或用户unionId
        @NameInMap("Id")
        public String id;

        // 用户Id的类型 ● OPEN_ID: 对外暴露的用户ID ● UNION_ID: 对外暴露的在组织下的用户ID
        @NameInMap("IdType")
        public String idType;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型： ● PACKAGE_NAME：apk包名 ● SKILL_ID：技能ID
        @NameInMap("EncodeType")
        public String encodeType;

        // 编码类型对应的值。 ● 编码类型是SKILL_ID时，其值为webhook服务中得到的skill ID。 ● 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetPhoneNumberHeadersCommonParamsUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberHeadersCommonParamsUserInfo self = new GetPhoneNumberHeadersCommonParamsUserInfo();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberHeadersCommonParamsUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhoneNumberHeadersCommonParamsUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetPhoneNumberHeadersCommonParamsUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetPhoneNumberHeadersCommonParamsUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetPhoneNumberHeadersCommonParamsUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class GetPhoneNumberHeadersCommonParams extends TeaModel {
        // 单个用户信息
        @NameInMap("UserInfo")
        public GetPhoneNumberHeadersCommonParamsUserInfo userInfo;

        public static GetPhoneNumberHeadersCommonParams build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberHeadersCommonParams self = new GetPhoneNumberHeadersCommonParams();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberHeadersCommonParams setUserInfo(GetPhoneNumberHeadersCommonParamsUserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public GetPhoneNumberHeadersCommonParamsUserInfo getUserInfo() {
            return this.userInfo;
        }

    }

}
