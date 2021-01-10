// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLivesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListLivesResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListLivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLivesResponseBody self = new ListLivesResponseBody();
        return TeaModel.build(map, self);
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

    public ListLivesResponseBody setData(ListLivesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLivesResponseBodyData getData() {
        return this.data;
    }

    public ListLivesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListLivesResponseBodyDataItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("PublicId")
        public String publicId;

        public static ListLivesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLivesResponseBodyDataItems self = new ListLivesResponseBodyDataItems();
            return TeaModel.build(map, self);
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

        public ListLivesResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLivesResponseBodyDataItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListLivesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLivesResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLivesResponseBodyDataItems setPublicId(String publicId) {
            this.publicId = publicId;
            return this;
        }
        public String getPublicId() {
            return this.publicId;
        }

    }

    public static class ListLivesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLivesResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

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

        public ListLivesResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListLivesResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
