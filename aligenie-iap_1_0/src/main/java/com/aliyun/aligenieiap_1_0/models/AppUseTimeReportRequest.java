// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public AppUseTimeReportRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public AppUseTimeReportRequestPayload payload;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("IsPrivilege")
        public Integer isPrivilege;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public Integer resourceType;

        @NameInMap("StepCode")
        public String stepCode;

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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

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
