// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppPageListOpenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryStudioAppPageListOpenResponseData data;

    public static QueryStudioAppPageListOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppPageListOpenResponse self = new QueryStudioAppPageListOpenResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppPageListOpenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppPageListOpenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStudioAppPageListOpenResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppPageListOpenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppPageListOpenResponse setData(QueryStudioAppPageListOpenResponseData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppPageListOpenResponseData getData() {
        return this.data;
    }

    public static class QueryStudioAppPageListOpenResponseDataListPageInfo extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("PageId")
        @Validation(required = true)
        public String pageId;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("IsHidden")
        @Validation(required = true)
        public Integer isHidden;

        @NameInMap("IsHome")
        @Validation(required = true)
        public Integer isHome;

        @NameInMap("IsLoginPage")
        @Validation(required = true)
        public Integer isLoginPage;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        public static QueryStudioAppPageListOpenResponseDataListPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseDataListPageInfo self = new QueryStudioAppPageListOpenResponseDataListPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setIsHidden(Integer isHidden) {
            this.isHidden = isHidden;
            return this;
        }
        public Integer getIsHidden() {
            return this.isHidden;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setIsHome(Integer isHome) {
            this.isHome = isHome;
            return this;
        }
        public Integer getIsHome() {
            return this.isHome;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setIsLoginPage(Integer isLoginPage) {
            this.isLoginPage = isLoginPage;
            return this;
        }
        public Integer getIsLoginPage() {
            return this.isLoginPage;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppPageListOpenResponseDataListPageInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class QueryStudioAppPageListOpenResponseDataList extends TeaModel {
        @NameInMap("PageInfo")
        @Validation(required = true)
        public java.util.List<QueryStudioAppPageListOpenResponseDataListPageInfo> pageInfo;

        public static QueryStudioAppPageListOpenResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseDataList self = new QueryStudioAppPageListOpenResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseDataList setPageInfo(java.util.List<QueryStudioAppPageListOpenResponseDataListPageInfo> pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public java.util.List<QueryStudioAppPageListOpenResponseDataListPageInfo> getPageInfo() {
            return this.pageInfo;
        }

    }

    public static class QueryStudioAppPageListOpenResponseData extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("List")
        @Validation(required = true)
        public QueryStudioAppPageListOpenResponseDataList list;

        public static QueryStudioAppPageListOpenResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseData self = new QueryStudioAppPageListOpenResponseData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppPageListOpenResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppPageListOpenResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppPageListOpenResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryStudioAppPageListOpenResponseData setList(QueryStudioAppPageListOpenResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppPageListOpenResponseDataList getList() {
            return this.list;
        }

    }

}
