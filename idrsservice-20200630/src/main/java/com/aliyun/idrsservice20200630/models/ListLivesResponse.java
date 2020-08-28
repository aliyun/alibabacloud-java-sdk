// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLivesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListLivesResponseData data;

    public static ListLivesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivesResponse self = new ListLivesResponse();
        return TeaModel.build(map, self);
    }

    public ListLivesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLivesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLivesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLivesResponse setData(ListLivesResponseData data) {
        this.data = data;
        return this;
    }
    public ListLivesResponseData getData() {
        return this.data;
    }

    public static class ListLivesResponseDataItems extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public String channel;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PublicId")
        @Validation(required = true)
        public String publicId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static ListLivesResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLivesResponseDataItems self = new ListLivesResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListLivesResponseDataItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListLivesResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLivesResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLivesResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivesResponseDataItems setPublicId(String publicId) {
            this.publicId = publicId;
            return this;
        }
        public String getPublicId() {
            return this.publicId;
        }

        public ListLivesResponseDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLivesResponseDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListLivesResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListLivesResponseDataItems> items;

        public static ListLivesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListLivesResponseData self = new ListLivesResponseData();
            return TeaModel.build(map, self);
        }

        public ListLivesResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListLivesResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListLivesResponseData setItems(java.util.List<ListLivesResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLivesResponseDataItems> getItems() {
            return this.items;
        }

    }

}
