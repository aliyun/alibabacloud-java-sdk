// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PreviousAndNextControlRequest extends TeaModel {
    /**
     * <p>Device ID information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public PreviousAndNextControlRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenControlPlayingListRequest")
    public PreviousAndNextControlRequestOpenControlPlayingListRequest openControlPlayingListRequest;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public PreviousAndNextControlRequestUserInfo userInfo;

    public static PreviousAndNextControlRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviousAndNextControlRequest self = new PreviousAndNextControlRequest();
        return TeaModel.build(map, self);
    }

    public PreviousAndNextControlRequest setDeviceInfo(PreviousAndNextControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PreviousAndNextControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PreviousAndNextControlRequest setOpenControlPlayingListRequest(PreviousAndNextControlRequestOpenControlPlayingListRequest openControlPlayingListRequest) {
        this.openControlPlayingListRequest = openControlPlayingListRequest;
        return this;
    }
    public PreviousAndNextControlRequestOpenControlPlayingListRequest getOpenControlPlayingListRequest() {
        return this.openControlPlayingListRequest;
    }

    public PreviousAndNextControlRequest setUserInfo(PreviousAndNextControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PreviousAndNextControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PreviousAndNextControlRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the Skill ID of the application. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for Android application customer journeys. <code>SKILL_ID</code>: Skill ID, used for cloud-based journeys.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, set to deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.</p>
         * <p><code>OPEN_ID</code>: The default device identity. <code>UNION_ID</code>: The organization-dimension device identity, which is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PreviousAndNextControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestDeviceInfo self = new PreviousAndNextControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PreviousAndNextControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PreviousAndNextControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PreviousAndNextControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PreviousAndNextControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PreviousAndNextControlRequestOpenControlPlayingListRequest extends TeaModel {
        /**
         * <p>Next track: NEXT; Previous track: PREVIOUS</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NEXT</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>Whether initiated by the device. Default is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsFromDevice")
        public Boolean isFromDevice;

        public static PreviousAndNextControlRequestOpenControlPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestOpenControlPlayingListRequest self = new PreviousAndNextControlRequestOpenControlPlayingListRequest();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public PreviousAndNextControlRequestOpenControlPlayingListRequest setIsFromDevice(Boolean isFromDevice) {
            this.isFromDevice = isFromDevice;
            return this;
        }
        public Boolean getIsFromDevice() {
            return this.isFromDevice;
        }

    }

    public static class PreviousAndNextControlRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the Skill ID of the application. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identity from Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for Android application client-side flows. <code>SKILL_ID</code>: Skill ID, used for cloud-side flows.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID.</p>
         * <p><code>OPEN_ID</code>: The default user identity. <code>UNION_ID</code>: The organization-dimension user identity, which is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
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
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PreviousAndNextControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlRequestUserInfo self = new PreviousAndNextControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PreviousAndNextControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PreviousAndNextControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PreviousAndNextControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PreviousAndNextControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
