// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAppsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppsResponseBody setData(ListAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppsResponseBodyData getData() {
        return this.data;
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

    public static class ListAppsResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PackageName")
        public String packageName;

        public static ListAppsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyDataItems self = new ListAppsResponseBodyDataItems();
            return TeaModel.build(map, self);
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

        public ListAppsResponseBodyDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListAppsResponseBodyDataItems setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public ListAppsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseBodyDataItems setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class ListAppsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListAppsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

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

        public ListAppsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListAppsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
