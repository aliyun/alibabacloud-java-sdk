// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelProductRequest extends TeaModel {
    @NameInMap("UserInfo")
    public QueryHotelProductRequestUserInfo userInfo;

    public static QueryHotelProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelProductRequest self = new QueryHotelProductRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelProductRequest setUserInfo(QueryHotelProductRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public QueryHotelProductRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class QueryHotelProductRequestUserInfo extends TeaModel {
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

        public static QueryHotelProductRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelProductRequestUserInfo self = new QueryHotelProductRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public QueryHotelProductRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryHotelProductRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryHotelProductRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHotelProductRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryHotelProductRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
