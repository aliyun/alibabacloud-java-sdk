// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDepartmentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDepartmentsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDepartmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDepartmentsResponseBody self = new ListDepartmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDepartmentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDepartmentsResponseBody setData(ListDepartmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDepartmentsResponseBodyData getData() {
        return this.data;
    }

    public ListDepartmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDepartmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDepartmentsResponseBodyDataItemsAdministrators extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListDepartmentsResponseBodyDataItemsAdministrators build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseBodyDataItemsAdministrators self = new ListDepartmentsResponseBodyDataItemsAdministrators();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseBodyDataItemsAdministrators setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDepartmentsResponseBodyDataItemsAdministrators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDepartmentsResponseBodyDataItems extends TeaModel {
        @NameInMap("Administrators")
        public java.util.List<ListDepartmentsResponseBodyDataItemsAdministrators> administrators;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListDepartmentsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseBodyDataItems self = new ListDepartmentsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseBodyDataItems setAdministrators(java.util.List<ListDepartmentsResponseBodyDataItemsAdministrators> administrators) {
            this.administrators = administrators;
            return this;
        }
        public java.util.List<ListDepartmentsResponseBodyDataItemsAdministrators> getAdministrators() {
            return this.administrators;
        }

        public ListDepartmentsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDepartmentsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDepartmentsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDepartmentsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDepartmentsResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListDepartmentsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListDepartmentsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListDepartmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseBodyData self = new ListDepartmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseBodyData setItems(java.util.List<ListDepartmentsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDepartmentsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListDepartmentsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDepartmentsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
