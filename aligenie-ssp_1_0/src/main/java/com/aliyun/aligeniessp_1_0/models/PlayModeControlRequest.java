// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayModeControlRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public PlayModeControlRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenPlayModeControlRequest")
    public PlayModeControlRequestOpenPlayModeControlRequest openPlayModeControlRequest;

    /**
     * <p>User Identifier information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public PlayModeControlRequestUserInfo userInfo;

    public static PlayModeControlRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayModeControlRequest self = new PlayModeControlRequest();
        return TeaModel.build(map, self);
    }

    public PlayModeControlRequest setDeviceInfo(PlayModeControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PlayModeControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PlayModeControlRequest setOpenPlayModeControlRequest(PlayModeControlRequestOpenPlayModeControlRequest openPlayModeControlRequest) {
        this.openPlayModeControlRequest = openPlayModeControlRequest;
        return this;
    }
    public PlayModeControlRequestOpenPlayModeControlRequest getOpenPlayModeControlRequest() {
        return this.openPlayModeControlRequest;
    }

    public PlayModeControlRequest setUserInfo(PlayModeControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PlayModeControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PlayModeControlRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
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
         * <p>Type of device ID</p>
         * <p><code>OPEN_ID</code>: Default device ID identity. <code>UNION_ID</code>: Organization-dimension device ID identity, available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PlayModeControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PlayModeControlRequestDeviceInfo self = new PlayModeControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PlayModeControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PlayModeControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PlayModeControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlayModeControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PlayModeControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PlayModeControlRequestOpenPlayModeControlRequest extends TeaModel {
        /**
         * <p>Playback mode</p>
         * <p>List loop: Repeat; Shuffle: Shuffle; Single track loop: RepeatOne; NAT mode: Normal;</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OpenPlayMode")
        public String openPlayMode;

        public static PlayModeControlRequestOpenPlayModeControlRequest build(java.util.Map<String, ?> map) throws Exception {
            PlayModeControlRequestOpenPlayModeControlRequest self = new PlayModeControlRequestOpenPlayModeControlRequest();
            return TeaModel.build(map, self);
        }

        public PlayModeControlRequestOpenPlayModeControlRequest setOpenPlayMode(String openPlayMode) {
            this.openPlayMode = openPlayMode;
            return this;
        }
        public String getOpenPlayMode() {
            return this.openPlayMode;
        }

    }

    public static class PlayModeControlRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the User Identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer ingest endpoint. <code>SKILL_ID</code>: Skill ID, used for the cloud-side ingest endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier, set to userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID</p>
         * <p><code>OPEN_ID</code>: The default User ID identity. <code>UNION_ID</code>: Organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PlayModeControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PlayModeControlRequestUserInfo self = new PlayModeControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PlayModeControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PlayModeControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PlayModeControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlayModeControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PlayModeControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
