// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SubmitHotelOrderRequest extends TeaModel {
    @NameInMap("Payload")
    public SubmitHotelOrderRequestPayload payload;

    @NameInMap("UserInfo")
    public SubmitHotelOrderRequestUserInfo userInfo;

    public static SubmitHotelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotelOrderRequest self = new SubmitHotelOrderRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotelOrderRequest setPayload(SubmitHotelOrderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public SubmitHotelOrderRequestPayload getPayload() {
        return this.payload;
    }

    public SubmitHotelOrderRequest setUserInfo(SubmitHotelOrderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public SubmitHotelOrderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class SubmitHotelOrderRequestPayloadItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Quantity")
        public Long quantity;

        public static SubmitHotelOrderRequestPayloadItemList build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotelOrderRequestPayloadItemList self = new SubmitHotelOrderRequestPayloadItemList();
            return TeaModel.build(map, self);
        }

        public SubmitHotelOrderRequestPayloadItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public SubmitHotelOrderRequestPayloadItemList setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

    public static class SubmitHotelOrderRequestPayload extends TeaModel {
        @NameInMap("ItemList")
        public java.util.List<SubmitHotelOrderRequestPayloadItemList> itemList;

        @NameInMap("Type")
        public String type;

        public static SubmitHotelOrderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotelOrderRequestPayload self = new SubmitHotelOrderRequestPayload();
            return TeaModel.build(map, self);
        }

        public SubmitHotelOrderRequestPayload setItemList(java.util.List<SubmitHotelOrderRequestPayloadItemList> itemList) {
            this.itemList = itemList;
            return this;
        }
        public java.util.List<SubmitHotelOrderRequestPayloadItemList> getItemList() {
            return this.itemList;
        }

        public SubmitHotelOrderRequestPayload setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitHotelOrderRequestUserInfo extends TeaModel {
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

        public static SubmitHotelOrderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitHotelOrderRequestUserInfo self = new SubmitHotelOrderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public SubmitHotelOrderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public SubmitHotelOrderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public SubmitHotelOrderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitHotelOrderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public SubmitHotelOrderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
