// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListWatermarksResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public ListWatermarksResponseBodyData data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<ListWatermarksResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 提示
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
    @NameInMap("Success")
    public Boolean success;

    public static ListWatermarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarksResponseBody self = new ListWatermarksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWatermarksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWatermarksResponseBody setData(ListWatermarksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWatermarksResponseBodyData getData() {
        return this.data;
    }

    public ListWatermarksResponseBody setErrors(java.util.List<ListWatermarksResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<ListWatermarksResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public ListWatermarksResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListWatermarksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWatermarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWatermarksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWatermarksResponseBodyDataItems extends TeaModel {
        // 创建时间
        @NameInMap("CreatedAt")
        public String createdAt;

        // 水印id
        @NameInMap("Id")
        public String id;

        // 水印名称
        @NameInMap("Name")
        public String name;

        // 水印信息
        @NameInMap("Value")
        public String value;

        public static ListWatermarksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarksResponseBodyDataItems self = new ListWatermarksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListWatermarksResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListWatermarksResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListWatermarksResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWatermarksResponseBodyDataItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListWatermarksResponseBodyData extends TeaModel {
        // 当前页面数据项
        @NameInMap("Items")
        public java.util.List<ListWatermarksResponseBodyDataItems> items;

        // 总数据项数
        @NameInMap("TotalElements")
        public Long totalElements;

        // 总页数
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListWatermarksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarksResponseBodyData self = new ListWatermarksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWatermarksResponseBodyData setItems(java.util.List<ListWatermarksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListWatermarksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListWatermarksResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListWatermarksResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

    public static class ListWatermarksResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static ListWatermarksResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            ListWatermarksResponseBodyErrors self = new ListWatermarksResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public ListWatermarksResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListWatermarksResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
