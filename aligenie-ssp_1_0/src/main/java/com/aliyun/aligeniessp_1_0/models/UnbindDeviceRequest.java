// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class UnbindDeviceRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public UnbindDeviceRequestDeviceInfo deviceInfo;

    /**
     * <p>List of user identifier information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public UnbindDeviceRequestUserInfo userInfo;

    public static UnbindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceRequest self = new UnbindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceRequest setDeviceInfo(UnbindDeviceRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public UnbindDeviceRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public UnbindDeviceRequest setUserInfo(UnbindDeviceRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public UnbindDeviceRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class UnbindDeviceRequestDeviceInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type, which is the Project ID of the project where the product resides. You can view it in the Tmall Genie AI platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Set this parameter to <strong>PROJECT_ID</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Device identifier. Enter the value of deviceOpenId or deviceUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of Device ID.  </p>
         * <ul>
         * <li>OPEN_ID: The default device ID identity.  </li>
         * <li>UNION_ID: The organization-dimension device ID identity. You must request an organization in advance on the Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>Organization ID. This parameter is required if IdType is set to UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static UnbindDeviceRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceRequestDeviceInfo self = new UnbindDeviceRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UnbindDeviceRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UnbindDeviceRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UnbindDeviceRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UnbindDeviceRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class UnbindDeviceRequestUserInfo extends TeaModel {
        /**
         * <p>The value corresponding to the encoding type, which is the Project ID of the project where this product resides. You can view it in the Tmall Genie AI Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>User identifier. Enter the value of userOpenId or userUnionId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of User ID:  </p>
         * <ul>
         * <li>OPEN_ID: The default user ID identity.  </li>
         * <li>UNION_ID: The organization-dimension user ID identity. You must request an organization in advance on the Open Platform.</li>
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

        public static UnbindDeviceRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceRequestUserInfo self = new UnbindDeviceRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public UnbindDeviceRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public UnbindDeviceRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UnbindDeviceRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public UnbindDeviceRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
