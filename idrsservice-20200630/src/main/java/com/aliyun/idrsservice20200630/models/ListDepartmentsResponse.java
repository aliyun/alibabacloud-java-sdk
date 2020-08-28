// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDepartmentsResponse extends TeaModel {
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
    public ListDepartmentsResponseData data;

    public static ListDepartmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDepartmentsResponse self = new ListDepartmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDepartmentsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDepartmentsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDepartmentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDepartmentsResponse setData(ListDepartmentsResponseData data) {
        this.data = data;
        return this;
    }
    public ListDepartmentsResponseData getData() {
        return this.data;
    }

    public static class ListDepartmentsResponseDataItemsAdministrators extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static ListDepartmentsResponseDataItemsAdministrators build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseDataItemsAdministrators self = new ListDepartmentsResponseDataItemsAdministrators();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseDataItemsAdministrators setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDepartmentsResponseDataItemsAdministrators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListDepartmentsResponseDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        @NameInMap("Administrators")
        @Validation(required = true)
        public java.util.List<ListDepartmentsResponseDataItemsAdministrators> administrators;

        public static ListDepartmentsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseDataItems self = new ListDepartmentsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDepartmentsResponseDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDepartmentsResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDepartmentsResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDepartmentsResponseDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListDepartmentsResponseDataItems setAdministrators(java.util.List<ListDepartmentsResponseDataItemsAdministrators> administrators) {
            this.administrators = administrators;
            return this;
        }
        public java.util.List<ListDepartmentsResponseDataItemsAdministrators> getAdministrators() {
            return this.administrators;
        }

    }

    public static class ListDepartmentsResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListDepartmentsResponseDataItems> items;

        public static ListDepartmentsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDepartmentsResponseData self = new ListDepartmentsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDepartmentsResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDepartmentsResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListDepartmentsResponseData setItems(java.util.List<ListDepartmentsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDepartmentsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
