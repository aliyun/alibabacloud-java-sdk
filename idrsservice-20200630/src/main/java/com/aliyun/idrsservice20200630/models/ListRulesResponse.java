// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRulesResponse extends TeaModel {
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
    public ListRulesResponseData data;

    public static ListRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponse self = new ListRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListRulesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRulesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponse setData(ListRulesResponseData data) {
        this.data = data;
        return this;
    }
    public ListRulesResponseData getData() {
        return this.data;
    }

    public static class ListRulesResponseDataItems extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListRulesResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseDataItems self = new ListRulesResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListRulesResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRulesResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRulesResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRulesResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListRulesResponseDataItems> items;

        public static ListRulesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseData self = new ListRulesResponseData();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListRulesResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListRulesResponseData setItems(java.util.List<ListRulesResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListRulesResponseDataItems> getItems() {
            return this.items;
        }

    }

}
