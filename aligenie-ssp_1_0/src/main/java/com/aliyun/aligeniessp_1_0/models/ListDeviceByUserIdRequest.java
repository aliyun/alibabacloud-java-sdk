// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListDeviceByUserIdRequestUserInfo userInfo;

    public static ListDeviceByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdRequest self = new ListDeviceByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdRequest setUserInfo(ListDeviceByUserIdRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListDeviceByUserIdRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListDeviceByUserIdRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListDeviceByUserIdRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdRequestUserInfo self = new ListDeviceByUserIdRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListDeviceByUserIdRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListDeviceByUserIdRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeviceByUserIdRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListDeviceByUserIdRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
