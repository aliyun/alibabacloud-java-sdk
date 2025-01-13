// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelSceneItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public ListHotelSceneItemRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GOODS</p>
         */
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
