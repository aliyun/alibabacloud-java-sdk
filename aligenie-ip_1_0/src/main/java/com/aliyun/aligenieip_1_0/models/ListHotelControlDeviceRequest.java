// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelControlDeviceRequest extends TeaModel {
    @NameInMap("UserInfo")
    public ListHotelControlDeviceRequestUserInfo userInfo;

    public static ListHotelControlDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelControlDeviceRequest self = new ListHotelControlDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelControlDeviceRequest setUserInfo(ListHotelControlDeviceRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListHotelControlDeviceRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListHotelControlDeviceRequestUserInfo extends TeaModel {
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

        public static ListHotelControlDeviceRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHotelControlDeviceRequestUserInfo self = new ListHotelControlDeviceRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListHotelControlDeviceRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListHotelControlDeviceRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListHotelControlDeviceRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotelControlDeviceRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListHotelControlDeviceRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
