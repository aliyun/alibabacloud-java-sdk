// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListRulesResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setData(ListRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRulesResponseBodyData getData() {
        return this.data;
    }

    public ListRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRulesResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static ListRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyDataItems self = new ListRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRulesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRulesResponseBodyDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListRulesResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListRulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListRulesResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

        public static ListRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyData self = new ListRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyData setItems(java.util.List<ListRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListRulesResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListRulesResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
