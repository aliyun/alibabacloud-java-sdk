// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTenantAppCategoryResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTenantAppCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppCategoryResponseBody self = new ListTenantAppCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantAppCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantAppCategoryResponseBody setData(java.util.List<ListTenantAppCategoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTenantAppCategoryResponseBodyData> getData() {
        return this.data;
    }

    public ListTenantAppCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantAppCategoryResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantAppCategoryResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTenantAppCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantAppCategoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTenantAppCategoryResponseBodyData extends TeaModel {
        @NameInMap("ClientCateEnName")
        public String clientCateEnName;

        @NameInMap("ClientCateName")
        public String clientCateName;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("IconUrlInternal")
        public String iconUrlInternal;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PId")
        public Long PId;

        @NameInMap("Rank")
        public Long rank;

        public static ListTenantAppCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTenantAppCategoryResponseBodyData self = new ListTenantAppCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTenantAppCategoryResponseBodyData setClientCateEnName(String clientCateEnName) {
            this.clientCateEnName = clientCateEnName;
            return this;
        }
        public String getClientCateEnName() {
            return this.clientCateEnName;
        }

        public ListTenantAppCategoryResponseBodyData setClientCateName(String clientCateName) {
            this.clientCateName = clientCateName;
            return this;
        }
        public String getClientCateName() {
            return this.clientCateName;
        }

        public ListTenantAppCategoryResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListTenantAppCategoryResponseBodyData setIconUrlInternal(String iconUrlInternal) {
            this.iconUrlInternal = iconUrlInternal;
            return this;
        }
        public String getIconUrlInternal() {
            return this.iconUrlInternal;
        }

        public ListTenantAppCategoryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTenantAppCategoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTenantAppCategoryResponseBodyData setPId(Long PId) {
            this.PId = PId;
            return this;
        }
        public Long getPId() {
            return this.PId;
        }

        public ListTenantAppCategoryResponseBodyData setRank(Long rank) {
            this.rank = rank;
            return this;
        }
        public Long getRank() {
            return this.rank;
        }

    }

}
