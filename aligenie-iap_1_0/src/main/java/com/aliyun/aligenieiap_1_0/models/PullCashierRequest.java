// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PullCashierRequest extends TeaModel {
    /**
     * <p>device ID information</p>
     */
    @NameInMap("DeviceInfo")
    public PullCashierRequestDeviceInfo deviceInfo;

    /**
     * <p>Business parameters</p>
     */
    @NameInMap("Payload")
    public PullCashierRequestPayload payload;

    /**
     * <p>User identifier information</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <ul>
         * <li>When the encoding type is SKILL_ID, the value is the Skill ID of the application.</li>
         * <li>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID of Tmall Genie, and each method corresponds to a different encoding type.  </p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used in the Android application customer flow.  </li>
         * <li>SKILL_ID: Skill ID, used in the cloud-based flow.</li>
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
         * <li>OPEN_ID: The default device ID.  </li>
         * <li>UNION_ID: Organization-level device ID. This value is available only after an organization has been requested on the Tmall Genie skill application Open Platform.</li>
         * </ul>
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
        /**
         * <p>Plaintext UUID</p>
         * 
         * <strong>example:</strong>
         * <p>731D5F********DC3B</p>
         */
        @NameInMap("originUuid")
        public String originUuid;

        public static PullCashierRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            PullCashierRequestPayload self = new PullCashierRequestPayload();
            return TeaModel.build(map, self);
        }

        public PullCashierRequestPayload setOriginUuid(String originUuid) {
            this.originUuid = originUuid;
            return this;
        }
        public String getOriginUuid() {
            return this.originUuid;
        }

    }

    public static class PullCashierRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type.</p>
         * <ul>
         * <li>When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID.</li>
         * <li>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier from Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <ul>
         * <li>PACKAGE_NAME: APK package name, used for the Android application customer ingest endpoint.</li>
         * <li>SKILL_ID: Skill ID, used for the cloud-based ingest endpoint.</li>
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
         * <p>Type of the User ID.</p>
         * <ul>
         * <li>OPEN_ID: The default User ID identity.</li>
         * <li>UNION_ID: Organization-dimension User ID identity. This value is available only after an organization has been requested on the Tmall Genie Skill Application Platform.</li>
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
