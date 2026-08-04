// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PlayAndPauseControlRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public PlayAndPauseControlRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenPlayAndPauseControlParam")
    public PlayAndPauseControlRequestOpenPlayAndPauseControlParam openPlayAndPauseControlParam;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public PlayAndPauseControlRequestUserInfo userInfo;

    public static PlayAndPauseControlRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayAndPauseControlRequest self = new PlayAndPauseControlRequest();
        return TeaModel.build(map, self);
    }

    public PlayAndPauseControlRequest setDeviceInfo(PlayAndPauseControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public PlayAndPauseControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public PlayAndPauseControlRequest setOpenPlayAndPauseControlParam(PlayAndPauseControlRequestOpenPlayAndPauseControlParam openPlayAndPauseControlParam) {
        this.openPlayAndPauseControlParam = openPlayAndPauseControlParam;
        return this;
    }
    public PlayAndPauseControlRequestOpenPlayAndPauseControlParam getOpenPlayAndPauseControlParam() {
        return this.openPlayAndPauseControlParam;
    }

    public PlayAndPauseControlRequest setUserInfo(PlayAndPauseControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public PlayAndPauseControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class PlayAndPauseControlRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>If the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. If the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device identity for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer link. <code>SKILL_ID</code>: Skill ID, used for the cloud-based link.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID, which can be set to deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.</p>
         * <p><code>OPEN_ID</code>: The default device ID identity. <code>UNION_ID</code>: The organization-dimension device ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PlayAndPauseControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            PlayAndPauseControlRequestDeviceInfo self = new PlayAndPauseControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public PlayAndPauseControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PlayAndPauseControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PlayAndPauseControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlayAndPauseControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PlayAndPauseControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class PlayAndPauseControlRequestOpenPlayAndPauseControlParam extends TeaModel {
        /**
         * <p>Playback: Play; Pause: Pause.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Play</p>
         */
        @NameInMap("OpenPlayAndPauseCommand")
        public String openPlayAndPauseCommand;

        public static PlayAndPauseControlRequestOpenPlayAndPauseControlParam build(java.util.Map<String, ?> map) throws Exception {
            PlayAndPauseControlRequestOpenPlayAndPauseControlParam self = new PlayAndPauseControlRequestOpenPlayAndPauseControlParam();
            return TeaModel.build(map, self);
        }

        public PlayAndPauseControlRequestOpenPlayAndPauseControlParam setOpenPlayAndPauseCommand(String openPlayAndPauseCommand) {
            this.openPlayAndPauseCommand = openPlayAndPauseCommand;
            return this;
        }
        public String getOpenPlayAndPauseCommand() {
            return this.openPlayAndPauseCommand;
        }

    }

    public static class PlayAndPauseControlRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <p>When the encoding type is <code>SKILL_ID</code>, the value is the application\&quot;s Skill ID. When the encoding type is <code>PACKAGE_NAME</code>, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier from Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer flow. <code>SKILL_ID</code>: Skill ID, used for the cloud-based flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier, set to either userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID.</p>
         * <p><code>OPEN_ID</code>: The default user ID identity. <code>UNION_ID</code>: The organization-dimension user ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required when IdType is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static PlayAndPauseControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            PlayAndPauseControlRequestUserInfo self = new PlayAndPauseControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public PlayAndPauseControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public PlayAndPauseControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public PlayAndPauseControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PlayAndPauseControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public PlayAndPauseControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
