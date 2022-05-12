// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PullCashierRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public PullCashierRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public PullCashierRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public PullCashierRequestUserInfo userInfo;

    public static PullCashierRequest build(java.util.Map<String, ?> map) throws Exception {
        PullCashierRequest self = new PullCashierRequest();
        return TeaModel.build(map, self);
    }

    public PullCashierRequest setDeviceInfo(PullCashierRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PullCashierRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PullCashierRequest setPayload(PullCashierRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public PullCashierRequestPayload getPayload() {
        return this.payload;
    }

    public PullCashierRequest setUserInfo(PullCashierRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PullCashierRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PullCashierRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型 - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PullCashierRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestDeviceInfo self = new PullCashierRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PullCashierRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PullCashierRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PullCashierRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PullCashierRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PullCashierRequestPayload extends TeaModel {
        public static PullCashierRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestPayload self = new PullCashierRequestPayload();
            return TeaModel.build(map, self);
        }

    }

    public static class PullCashierRequestUserInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的用户标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 用户标识（userOpenId或userUnionId）
        @NameInMap("Id")
        public String id;

        // 用户Id的类型  - OPEN_ID：默认的用户ID标识 - UNION_ID: 组织维度的用户ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PullCashierRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestUserInfo self = new PullCashierRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PullCashierRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PullCashierRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PullCashierRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PullCashierRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
