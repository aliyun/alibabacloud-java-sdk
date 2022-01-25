// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLivesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLivesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivesResponseBody self = new ListLivesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLivesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLivesResponseBody setData(ListLivesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLivesResponseBodyData getData() {
        return this.data;
    }

    public ListLivesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLivesResponseBodyDataItems extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PublicId")
        public String publicId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        public static ListLivesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLivesResponseBodyDataItems self = new ListLivesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLivesResponseBodyDataItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListLivesResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLivesResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLivesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivesResponseBodyDataItems setPublicId(String publicId) {
            this.publicId = publicId;
            return this;
        }
        public String getPublicId() {
            return this.publicId;
        }

        public ListLivesResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLivesResponseBodyDataItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListLivesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLivesResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListLivesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLivesResponseBodyData self = new ListLivesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLivesResponseBodyData setItems(java.util.List<ListLivesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLivesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListLivesResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListLivesResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
