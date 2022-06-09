// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfo")
    public AppUseTimeReportRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public AppUseTimeReportRequestPayload payload;

    // 用户标识信息
    @NameInMap("UserInfo")
    public AppUseTimeReportRequestUserInfo userInfo;

    public static AppUseTimeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        AppUseTimeReportRequest self = new AppUseTimeReportRequest();
        return TeaModel.build(map, self);
    }

    public AppUseTimeReportRequest setDeviceInfo(AppUseTimeReportRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public AppUseTimeReportRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public AppUseTimeReportRequest setPayload(AppUseTimeReportRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public AppUseTimeReportRequestPayload getPayload() {
        return this.payload;
    }

    public AppUseTimeReportRequest setUserInfo(AppUseTimeReportRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public AppUseTimeReportRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class AppUseTimeReportRequestDeviceInfo extends TeaModel {
        // 编码类型对应的值，编码类型是SKILL_ID时，其值为应用的Skill ID； 编码类型是PACKAGE_NAME时，其值为对应客户端App的packageName。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，获取猫精的设备标识的途径有多种，不同途径对应不同的编码类型 - PACKAGE_NAME：apk包名，Android应用客户链路的编码类型 - SKILL_ID：技能ID，云端链路的编码类型
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在猫精技能应用开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static AppUseTimeReportRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            AppUseTimeReportRequestDeviceInfo self = new AppUseTimeReportRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public AppUseTimeReportRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AppUseTimeReportRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AppUseTimeReportRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AppUseTimeReportRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AppUseTimeReportRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class AppUseTimeReportRequestPayload extends TeaModel {
        // 操作
        @NameInMap("Action")
        public String action;

        // 是否会员专享权益：1-是  0-否
        @NameInMap("IsPrivilege")
        public Integer isPrivilege;

        // 资源id
        @NameInMap("ResourceId")
        public String resourceId;

        // resourceType
        @NameInMap("ResourceType")
        public Integer resourceType;

        // 步进码
        @NameInMap("StepCode")
        public String stepCode;

        // 会员类型
        @NameInMap("VipType")
        public Integer vipType;

        @NameInMap("originUuid")
        public String originUuid;

        public static AppUseTimeReportRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            AppUseTimeReportRequestPayload self = new AppUseTimeReportRequestPayload();
            return TeaModel.build(map, self);
        }

        public AppUseTimeReportRequestPayload setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public AppUseTimeReportRequestPayload setIsPrivilege(Integer isPrivilege) {
            this.isPrivilege = isPrivilege;
            return this;
        }
        public Integer getIsPrivilege() {
            return this.isPrivilege;
        }

        public AppUseTimeReportRequestPayload setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AppUseTimeReportRequestPayload setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Integer getResourceType() {
            return this.resourceType;
        }

        public AppUseTimeReportRequestPayload setStepCode(String stepCode) {
            this.stepCode = stepCode;
            return this;
        }
        public String getStepCode() {
            return this.stepCode;
        }

        public AppUseTimeReportRequestPayload setVipType(Integer vipType) {
            this.vipType = vipType;
            return this;
        }
        public Integer getVipType() {
            return this.vipType;
        }

        public AppUseTimeReportRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

    }

    public static class AppUseTimeReportRequestUserInfo extends TeaModel {
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

        public static AppUseTimeReportRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            AppUseTimeReportRequestUserInfo self = new AppUseTimeReportRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public AppUseTimeReportRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AppUseTimeReportRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AppUseTimeReportRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AppUseTimeReportRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AppUseTimeReportRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
