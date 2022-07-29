// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class QueryMusicTypeRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public QueryMusicTypeRequestDeviceInfo deviceInfo;

    @NameInMap("Payload")
    public QueryMusicTypeRequestPayload payload;

    @NameInMap("UserInfo")
    public QueryMusicTypeRequestUserInfo userInfo;

    public static QueryMusicTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMusicTypeRequest self = new QueryMusicTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMusicTypeRequest setDeviceInfo(QueryMusicTypeRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public QueryMusicTypeRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public QueryMusicTypeRequest setPayload(QueryMusicTypeRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public QueryMusicTypeRequestPayload getPayload() {
        return this.payload;
    }

    public QueryMusicTypeRequest setUserInfo(QueryMusicTypeRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public QueryMusicTypeRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class QueryMusicTypeRequestDeviceInfo extends TeaModel {
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

        public static QueryMusicTypeRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestDeviceInfo self = new QueryMusicTypeRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public QueryMusicTypeRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryMusicTypeRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryMusicTypeRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMusicTypeRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMusicTypeRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class QueryMusicTypeRequestPayload extends TeaModel {
        public static QueryMusicTypeRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestPayload self = new QueryMusicTypeRequestPayload();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMusicTypeRequestUserInfo extends TeaModel {
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

        public static QueryMusicTypeRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMusicTypeRequestUserInfo self = new QueryMusicTypeRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public QueryMusicTypeRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public QueryMusicTypeRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public QueryMusicTypeRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMusicTypeRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryMusicTypeRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
