// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberRequest extends TeaModel {
    // 用户信息
    @NameInMap("UserInfo")
    public GetPhoneNumberRequestUserInfo userInfo;

    public static GetPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberRequest self = new GetPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberRequest setUserInfo(GetPhoneNumberRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetPhoneNumberRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetPhoneNumberRequestUserInfo extends TeaModel {
        // 编码类型对应的值。 ● 编码类型是SKILL_ID时，其值为webhook服务中得到的skill ID。 ● 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型： ● PACKAGE_NAME：apk包名 ● SKILL_ID：技能ID
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户openId或用户unionId
        @NameInMap("Id")
        public String id;

        // 用户Id的类型 ● OPEN_ID: 对外暴露的用户ID ● UNION_ID: 对外暴露的在组织下的用户ID
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetPhoneNumberRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberRequestUserInfo self = new GetPhoneNumberRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetPhoneNumberRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetPhoneNumberRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhoneNumberRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetPhoneNumberRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
