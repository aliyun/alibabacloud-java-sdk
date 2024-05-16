// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupQueryListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageData")
    public DsgUserGroupQueryListResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DsgUserGroupQueryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupQueryListResponseBody self = new DsgUserGroupQueryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupQueryListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgUserGroupQueryListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgUserGroupQueryListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgUserGroupQueryListResponseBody setPageData(DsgUserGroupQueryListResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public DsgUserGroupQueryListResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public DsgUserGroupQueryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgUserGroupQueryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgUserGroupQueryListResponseBodyPageDataData extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<String> accounts;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        public static DsgUserGroupQueryListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryListResponseBodyPageDataData self = new DsgUserGroupQueryListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setAccounts(java.util.List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<String> getAccounts() {
            return this.accounts;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DsgUserGroupQueryListResponseBodyPageDataData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

    public static class DsgUserGroupQueryListResponseBodyPageData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DsgUserGroupQueryListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DsgUserGroupQueryListResponseBodyPageData self = new DsgUserGroupQueryListResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DsgUserGroupQueryListResponseBodyPageData setData(java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DsgUserGroupQueryListResponseBodyPageDataData> getData() {
            return this.data;
        }

        public DsgUserGroupQueryListResponseBodyPageData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DsgUserGroupQueryListResponseBodyPageData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DsgUserGroupQueryListResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
