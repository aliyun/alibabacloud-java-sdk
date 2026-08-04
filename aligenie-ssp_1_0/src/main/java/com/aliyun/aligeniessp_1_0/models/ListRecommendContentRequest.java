// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentRequest extends TeaModel {
    /**
     * <p>Device identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListRecommendContentRequestDeviceInfo deviceInfo;

    /**
     * <p>Request Parameters</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public ListRecommendContentRequestRequest request;

    /**
     * <p>User identification information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListRecommendContentRequestUserInfo userInfo;

    public static ListRecommendContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendContentRequest self = new ListRecommendContentRequest();
        return TeaModel.build(map, self);
    }

    public ListRecommendContentRequest setDeviceInfo(ListRecommendContentRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListRecommendContentRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListRecommendContentRequest setRequest(ListRecommendContentRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListRecommendContentRequestRequest getRequest() {
        return this.request;
    }

    public ListRecommendContentRequest setUserInfo(ListRecommendContentRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListRecommendContentRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListRecommendContentRequestDeviceInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type</p>
         * <p>When the encoding type is SKILL_ID, the value is the application\&quot;s Skill ID.
         * When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the device ID for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p>PACKAGE_NAME: APK package name, used for the Android application client path.
         * SKILL_ID: Skill ID, used for the cloud-based path.</p>
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
         * <p>Type of device ID</p>
         * <p>OPEN_ID: Default device ID identity.
         * UNION_ID: Organization-dimension device ID identity. This value is available only after an organization has been registered on the Tmall Genie Skill Application Open Platform.</p>
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
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListRecommendContentRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestDeviceInfo self = new ListRecommendContentRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRecommendContentRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRecommendContentRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecommendContentRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRecommendContentRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListRecommendContentRequestRequest extends TeaModel {
        /**
         * <p>Quantity of recommendations</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>Default value: song (currently, the extension field supports only song)</p>
         * 
         * <strong>example:</strong>
         * <p>song</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListRecommendContentRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestRequest self = new ListRecommendContentRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestRequest setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListRecommendContentRequestRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRecommendContentRequestUserInfo extends TeaModel {
        /**
         * <p>Value corresponding to the encoding type.</p>
         * <p>When the encoding type is SKILL_ID, the value is the Skill ID of the application.<br>When the encoding type is PACKAGE_NAME, the value is the packageName of the corresponding client app.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. There are multiple ways to obtain the user identifier for Tmall Genie, and each method corresponds to a different encoding type.</p>
         * <p>PACKAGE_NAME: APK package name, used for the Android application client path.
         * SKILL_ID: Skill ID, used for the cloud-based path.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User Identifier, set to userOpenId or userUnionId.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Type of User ID.</p>
         * <p>OPEN_ID: The default User ID identifier.<br>UNION_ID: The organization-dimension User ID identifier. This value is available only after an organization has been requested on the Tmall Genie Skills Application Open Platform.</p>
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
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListRecommendContentRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentRequestUserInfo self = new ListRecommendContentRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListRecommendContentRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListRecommendContentRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecommendContentRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListRecommendContentRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
