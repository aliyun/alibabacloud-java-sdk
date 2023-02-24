// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByNumberRequest extends TeaModel {
    @NameInMap("Number")
    public String number;

    @NameInMap("UserInfo")
    public GetHotelContactByNumberRequestUserInfo userInfo;

    public static GetHotelContactByNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByNumberRequest self = new GetHotelContactByNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public GetHotelContactByNumberRequest setUserInfo(GetHotelContactByNumberRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelContactByNumberRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelContactByNumberRequestUserInfo extends TeaModel {
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

        public static GetHotelContactByNumberRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByNumberRequestUserInfo self = new GetHotelContactByNumberRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByNumberRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelContactByNumberRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelContactByNumberRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelContactByNumberRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelContactByNumberRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
