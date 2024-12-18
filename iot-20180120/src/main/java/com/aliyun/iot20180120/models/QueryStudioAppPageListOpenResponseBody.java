// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppPageListOpenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStudioAppPageListOpenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-12-25T16:21Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-05-08T17:18Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>49739</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsHidden")
        public Integer isHidden;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsHome")
        public Integer isHome;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsLoginPage")
        public Integer isLoginPage;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>44920</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>/page/44920</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
