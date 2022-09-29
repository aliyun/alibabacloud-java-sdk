// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeRequest extends TeaModel {
    @NameInMap("UserInfo")
    public GetHotelNoticeRequestUserInfo userInfo;

    public static GetHotelNoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeRequest self = new GetHotelNoticeRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeRequest setUserInfo(GetHotelNoticeRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelNoticeRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelNoticeRequestUserInfo extends TeaModel {
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

        public static GetHotelNoticeRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelNoticeRequestUserInfo self = new GetHotelNoticeRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelNoticeRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelNoticeRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelNoticeRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelNoticeRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelNoticeRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
