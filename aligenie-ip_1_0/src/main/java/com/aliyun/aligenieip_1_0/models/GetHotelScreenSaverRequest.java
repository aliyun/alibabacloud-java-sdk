// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelScreenSaverRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetHotelScreenSaverRequestUserInfo userInfo;

    public static GetHotelScreenSaverRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelScreenSaverRequest self = new GetHotelScreenSaverRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelScreenSaverRequest setUserInfo(GetHotelScreenSaverRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelScreenSaverRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelScreenSaverRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1248494721591392955</p>
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
         * <p>mFU6VtVU+pgA8lx6rYMo7SPl11t+8b+8ALrn10MIPEdpK/HI9wELAEppYhPI1cYRDa4og8AMjAEBZKbLUwFjFA==</p>
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

        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetHotelScreenSaverRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelScreenSaverRequestUserInfo self = new GetHotelScreenSaverRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelScreenSaverRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelScreenSaverRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelScreenSaverRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelScreenSaverRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelScreenSaverRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
