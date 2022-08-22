// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemRequest extends TeaModel {
    @NameInMap("Payload")
    public ListHotelSceneItemRequestPayload payload;

    @NameInMap("UserInfo")
    public ListHotelSceneItemRequestUserInfo userInfo;

    public static ListHotelSceneItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelSceneItemRequest self = new ListHotelSceneItemRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelSceneItemRequest setPayload(ListHotelSceneItemRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListHotelSceneItemRequestPayload getPayload() {
        return this.payload;
    }

    public ListHotelSceneItemRequest setUserInfo(ListHotelSceneItemRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListHotelSceneItemRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListHotelSceneItemRequestPayload extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static ListHotelSceneItemRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemRequestPayload self = new ListHotelSceneItemRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemRequestPayload setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListHotelSceneItemRequestUserInfo extends TeaModel {
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

        public static ListHotelSceneItemRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHotelSceneItemRequestUserInfo self = new ListHotelSceneItemRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListHotelSceneItemRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListHotelSceneItemRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListHotelSceneItemRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotelSceneItemRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListHotelSceneItemRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
