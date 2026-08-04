// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class InvalidateThirdPartyAppLoginStateRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public InvalidateThirdPartyAppLoginStateRequestDeviceInfo deviceInfo;

    /**
     * <p>Third-party application identity</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>com.<em>.</em>.*</p>
     */
    @NameInMap("ThirdPartyAppId")
    public String thirdPartyAppId;

    public static InvalidateThirdPartyAppLoginStateRequest build(java.util.Map<String, ?> map) throws Exception {
        InvalidateThirdPartyAppLoginStateRequest self = new InvalidateThirdPartyAppLoginStateRequest();
        return TeaModel.build(map, self);
    }

    public InvalidateThirdPartyAppLoginStateRequest setDeviceInfo(InvalidateThirdPartyAppLoginStateRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public InvalidateThirdPartyAppLoginStateRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public InvalidateThirdPartyAppLoginStateRequest setThirdPartyAppId(String thirdPartyAppId) {
        this.thirdPartyAppId = thirdPartyAppId;
        return this;
    }
    public String getThirdPartyAppId() {
        return this.thirdPartyAppId;
    }

    public static class InvalidateThirdPartyAppLoginStateRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type. When the encoding type is SKILL_ID, the value is the Skill ID of the application. When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>com.<em>.</em>.*</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the Tmall Genie device ID, and each method corresponds to a different encoding type: PACKAGE_NAME refers to the APK package name, used in the Android application customer flow; SKILL_ID refers to the skill ID, used in the cloud-based flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device ID (deviceOpenId or deviceUnionId)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ou***lk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID. OPEN_ID: the default device identity. UNION_ID: the device identity at the organization dimension, which is available only after an organization has been requested on the Maojing Skills Application Open Platform.</p>
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

        public static InvalidateThirdPartyAppLoginStateRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            InvalidateThirdPartyAppLoginStateRequestDeviceInfo self = new InvalidateThirdPartyAppLoginStateRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public InvalidateThirdPartyAppLoginStateRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public InvalidateThirdPartyAppLoginStateRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public InvalidateThirdPartyAppLoginStateRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InvalidateThirdPartyAppLoginStateRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public InvalidateThirdPartyAppLoginStateRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
