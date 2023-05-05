// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAllAppCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllAppCategoryResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAllAppCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllAppCategoryResponseBody self = new ListAllAppCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllAppCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllAppCategoryResponseBody setData(java.util.List<ListAllAppCategoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllAppCategoryResponseBodyData> getData() {
        return this.data;
    }

    public ListAllAppCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllAppCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllAppCategoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAllAppCategoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAllAppCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllAppCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAllAppCategoryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAllAppCategoryResponseBodyData extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("IconUrlInternal")
        public String iconUrlInternal;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PId")
        public Integer PId;

        @NameInMap("Rank")
        public Integer rank;

        @NameInMap("Status")
        public String status;

        public static ListAllAppCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllAppCategoryResponseBodyData self = new ListAllAppCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllAppCategoryResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAllAppCategoryResponseBodyData setIconUrlInternal(String iconUrlInternal) {
            this.iconUrlInternal = iconUrlInternal;
            return this;
        }
        public String getIconUrlInternal() {
            return this.iconUrlInternal;
        }

        public ListAllAppCategoryResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAllAppCategoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllAppCategoryResponseBodyData setPId(Integer PId) {
            this.PId = PId;
            return this;
        }
        public Integer getPId() {
            return this.PId;
        }

        public ListAllAppCategoryResponseBodyData setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public ListAllAppCategoryResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
