// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListAppsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setData(ListAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseBodyData getData() {
        return this.data;
    }

    public ListAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListAppsResponseBodyDataItems extends TeaModel {
        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListAppsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataItems self = new ListAppsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListAppsResponseBodyDataItems setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListAppsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListAppsResponseBodyDataItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public ListAppsResponseBodyDataItems setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListAppsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListAppsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListAppsResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

        public static ListAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyData self = new ListAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyData setItems(java.util.List<ListAppsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListAppsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListAppsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
