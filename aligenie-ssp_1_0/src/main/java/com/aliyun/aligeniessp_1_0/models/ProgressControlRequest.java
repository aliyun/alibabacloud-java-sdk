// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ProgressControlRequest extends TeaModel {
    /**
     * <p>Device identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ProgressControlRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenProgressControlRequest")
    public ProgressControlRequestOpenProgressControlRequest openProgressControlRequest;

    /**
     * <p>User identity information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ProgressControlRequestUserInfo userInfo;

    public static ProgressControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ProgressControlRequest self = new ProgressControlRequest();
        return TeaModel.build(map, self);
    }

    public ProgressControlRequest setDeviceInfo(ProgressControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ProgressControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ProgressControlRequest setOpenProgressControlRequest(ProgressControlRequestOpenProgressControlRequest openProgressControlRequest) {
        this.openProgressControlRequest = openProgressControlRequest;
        return this;
    }
    public ProgressControlRequestOpenProgressControlRequest getOpenProgressControlRequest() {
        return this.openProgressControlRequest;
    }

    public ProgressControlRequest setUserInfo(ProgressControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ProgressControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ProgressControlRequestDeviceInfo extends TeaModel {
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
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application customer flow. <code>SKILL_ID</code>: Skill ID, used for the cloud-based flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID. Set to either deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.</p>
         * <p><code>OPEN_ID</code>: The default device identity. <code>UNION_ID</code>: The organization-dimension device identity, which is available only after an organization has been requested on the Tmall Genie Skills Application Open Platform.</p>
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

        public static ProgressControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestDeviceInfo self = new ProgressControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ProgressControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ProgressControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ProgressControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ProgressControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ProgressControlRequestOpenProgressControlRequest extends TeaModel {
        /**
         * <p>Extension information</p>
         */
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>Song progress, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        public static ProgressControlRequestOpenProgressControlRequest build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestOpenProgressControlRequest self = new ProgressControlRequestOpenProgressControlRequest();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestOpenProgressControlRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public ProgressControlRequestOpenProgressControlRequest setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class ProgressControlRequestUserInfo extends TeaModel {
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
         * <p>Encoding type. There are multiple ways to obtain the Tmall Genie user identity, and each way corresponds to a different encoding type.</p>
         * <p><code>PACKAGE_NAME</code>: APK package name, used for the Android application client path. <code>SKILL_ID</code>: Skill ID, used for the cloud-based path.</p>
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
         * <p><code>OPEN_ID</code>: The default User ID identity. <code>UNION_ID</code>: The organization-dimension User ID identity, which is available only after an organization has been requested on the Tmall Genie Skills Application Open Platform.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. Required if IdType is <code>UNION_ID</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ProgressControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestUserInfo self = new ProgressControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ProgressControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ProgressControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ProgressControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ProgressControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
