// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppPageListOpenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStudioAppPageListOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStudioAppPageListOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppPageListOpenResponseBody self = new QueryStudioAppPageListOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppPageListOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppPageListOpenResponseBody setData(QueryStudioAppPageListOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppPageListOpenResponseBodyData getData() {
        return this.data;
    }

    public QueryStudioAppPageListOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppPageListOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppPageListOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStudioAppPageListOpenResponseBodyDataListPageInfo extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsHidden")
        public Integer isHidden;

        @NameInMap("IsHome")
        public Integer isHome;

        @NameInMap("IsLoginPage")
        public Integer isLoginPage;

        @NameInMap("Name")
        public String name;

        @NameInMap("PageId")
        public String pageId;

        @NameInMap("Path")
        public String path;

        public static QueryStudioAppPageListOpenResponseBodyDataListPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseBodyDataListPageInfo self = new QueryStudioAppPageListOpenResponseBodyDataListPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setIsHidden(Integer isHidden) {
            this.isHidden = isHidden;
            return this;
        }
        public Integer getIsHidden() {
            return this.isHidden;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setIsHome(Integer isHome) {
            this.isHome = isHome;
            return this;
        }
        public Integer getIsHome() {
            return this.isHome;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setIsLoginPage(Integer isLoginPage) {
            this.isLoginPage = isLoginPage;
            return this;
        }
        public Integer getIsLoginPage() {
            return this.isLoginPage;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public QueryStudioAppPageListOpenResponseBodyDataListPageInfo setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class QueryStudioAppPageListOpenResponseBodyDataList extends TeaModel {
        @NameInMap("PageInfo")
        public java.util.List<QueryStudioAppPageListOpenResponseBodyDataListPageInfo> pageInfo;

        public static QueryStudioAppPageListOpenResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseBodyDataList self = new QueryStudioAppPageListOpenResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseBodyDataList setPageInfo(java.util.List<QueryStudioAppPageListOpenResponseBodyDataListPageInfo> pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public java.util.List<QueryStudioAppPageListOpenResponseBodyDataListPageInfo> getPageInfo() {
            return this.pageInfo;
        }

    }

    public static class QueryStudioAppPageListOpenResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryStudioAppPageListOpenResponseBodyDataList list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryStudioAppPageListOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppPageListOpenResponseBodyData self = new QueryStudioAppPageListOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppPageListOpenResponseBodyData setList(QueryStudioAppPageListOpenResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppPageListOpenResponseBodyDataList getList() {
            return this.list;
        }

        public QueryStudioAppPageListOpenResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppPageListOpenResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppPageListOpenResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppPageListOpenResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
