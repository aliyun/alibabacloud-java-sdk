// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSampleUtterancesRequest extends TeaModel {
    @NameInMap("UserInfo")
    public GetHotelSampleUtterancesRequestUserInfo userInfo;

    public static GetHotelSampleUtterancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSampleUtterancesRequest self = new GetHotelSampleUtterancesRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelSampleUtterancesRequest setUserInfo(GetHotelSampleUtterancesRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelSampleUtterancesRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelSampleUtterancesRequestUserInfo extends TeaModel {
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

        public static GetHotelSampleUtterancesRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelSampleUtterancesRequestUserInfo self = new GetHotelSampleUtterancesRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelSampleUtterancesRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelSampleUtterancesRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelSampleUtterancesRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelSampleUtterancesRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelSampleUtterancesRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
