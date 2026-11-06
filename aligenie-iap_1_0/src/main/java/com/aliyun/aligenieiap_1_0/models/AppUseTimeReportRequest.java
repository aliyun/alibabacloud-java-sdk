// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class AppUseTimeReportRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     */
    @NameInMap("DeviceInfo")
    public AppUseTimeReportRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     */
    @NameInMap("Payload")
    public AppUseTimeReportRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <ul>
         * <li>When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID.</li>
         * <li>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for Android application customer-side integration.  </li>
         * <li>SKILL_ID: Skill ID, used for cloud-side integration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to deviceOpenId or deviceUnionId.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of device ID  </p>
         * <ul>
         * <li>OPEN_ID: Default device ID.  </li>
         * <li>UNION_ID: Organization-dimension device ID, available only after an organization has been requested in the Tmall Genie Skill Application Open Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID, required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
        /**
         * <p>Action item</p>
         * <ul>
         * <li>start indicates Start</li>
         * <li>end indicates End</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Indicates whether the benefit is exclusive to members:</p>
         * <ul>
         * <li>1 indicates Yes  </li>
         * <li>0 indicates No</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsPrivilege")
        public Integer isPrivilege;

        /**
         * <p>Resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Resource type:</p>
         * <ul>
         * <li>0 indicates game</li>
         * <li>1 indicates audio</li>
         * <li>2 indicates video</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceType")
        public Integer resourceType;

        /**
         * <p>Step code. The start and end actions must be uniquely matched.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StepCode")
        public String stepCode;

        /**
         * <p>Membership type:</p>
         * <ul>
         * <li>0 indicates Cat Spirit Membership</li>
         * <li>1 indicates third-party proprietary membership</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VipType")
        public Integer vipType;

        /**
         * <p>Plaintext UUID</p>
         * 
         * <strong>example:</strong>
         * <p>731D5F********DC3B</p>
         */
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
        /**
         * <p>Value corresponding to the encoding type  </p>
         * <ul>
         * <li>When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID.  </li>
         * <li>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier from Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer flow.  </li>
         * <li>SKILL_ID: Skill ID, used for the cloud-based flow.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID  </p>
         * <ul>
         * <li>OPEN_ID: Default User ID identifier.  </li>
         * <li>UNION_ID: Organization-dimension User ID identifier. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
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
