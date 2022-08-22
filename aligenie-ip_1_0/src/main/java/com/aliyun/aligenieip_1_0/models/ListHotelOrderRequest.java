// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelOrderRequest extends TeaModel {
    @NameInMap("Payload")
    public ListHotelOrderRequestPayload payload;

    @NameInMap("UserInfo")
    public ListHotelOrderRequestUserInfo userInfo;

    public static ListHotelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelOrderRequest self = new ListHotelOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelOrderRequest setPayload(ListHotelOrderRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListHotelOrderRequestPayload getPayload() {
        return this.payload;
    }

    public ListHotelOrderRequest setUserInfo(ListHotelOrderRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListHotelOrderRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListHotelOrderRequestPayloadPage extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListHotelOrderRequestPayloadPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelOrderRequestPayloadPage self = new ListHotelOrderRequestPayloadPage();
            return TeaModel.build(map, self);
        }

        public ListHotelOrderRequestPayloadPage setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelOrderRequestPayloadPage setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListHotelOrderRequestPayload extends TeaModel {
        @NameInMap("Page")
        public ListHotelOrderRequestPayloadPage page;

        public static ListHotelOrderRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListHotelOrderRequestPayload self = new ListHotelOrderRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListHotelOrderRequestPayload setPage(ListHotelOrderRequestPayloadPage page) {
            this.page = page;
            return this;
        }
        public ListHotelOrderRequestPayloadPage getPage() {
            return this.page;
        }

    }

    public static class ListHotelOrderRequestUserInfo extends TeaModel {
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

        public static ListHotelOrderRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListHotelOrderRequestUserInfo self = new ListHotelOrderRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListHotelOrderRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListHotelOrderRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListHotelOrderRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHotelOrderRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListHotelOrderRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
