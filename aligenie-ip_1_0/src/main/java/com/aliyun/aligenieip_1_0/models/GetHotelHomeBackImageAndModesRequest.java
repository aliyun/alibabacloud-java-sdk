// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelHomeBackImageAndModesRequest extends TeaModel {
    @NameInMap("UserInfo")
    public GetHotelHomeBackImageAndModesRequestUserInfo userInfo;

    public static GetHotelHomeBackImageAndModesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelHomeBackImageAndModesRequest self = new GetHotelHomeBackImageAndModesRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelHomeBackImageAndModesRequest setUserInfo(GetHotelHomeBackImageAndModesRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelHomeBackImageAndModesRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelHomeBackImageAndModesRequestUserInfo extends TeaModel {
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

        public static GetHotelHomeBackImageAndModesRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelHomeBackImageAndModesRequestUserInfo self = new GetHotelHomeBackImageAndModesRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelHomeBackImageAndModesRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelHomeBackImageAndModesRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelHomeBackImageAndModesRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelHomeBackImageAndModesRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelHomeBackImageAndModesRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
