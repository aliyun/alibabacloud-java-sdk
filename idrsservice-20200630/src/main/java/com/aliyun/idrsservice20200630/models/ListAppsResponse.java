// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListAppsResponse extends TeaModel {
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
    public ListAppsResponseData data;

    public static ListAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponse self = new ListAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponse setData(ListAppsResponseData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseData getData() {
        return this.data;
    }

    public static class ListAppsResponseDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("DepartmentId")
        @Validation(required = true)
        public String departmentId;

        @NameInMap("DepartmentName")
        @Validation(required = true)
        public String departmentName;

        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        public static ListAppsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseDataItems self = new ListAppsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAppsResponseDataItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public ListAppsResponseDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListAppsResponseDataItems setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListAppsResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppsResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseDataItems setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class ListAppsResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListAppsResponseDataItems> items;

        public static ListAppsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseData self = new ListAppsResponseData();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListAppsResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListAppsResponseData setItems(java.util.List<ListAppsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
