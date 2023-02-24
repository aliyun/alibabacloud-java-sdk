// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactsRequest extends TeaModel {
    @NameInMap("UserInfo")
    public GetHotelContactsRequestUserInfo userInfo;

    public static GetHotelContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactsRequest self = new GetHotelContactsRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactsRequest setUserInfo(GetHotelContactsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelContactsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelContactsRequestUserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static GetHotelContactsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactsRequestUserInfo self = new GetHotelContactsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelContactsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelContactsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelContactsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelContactsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelContactsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
