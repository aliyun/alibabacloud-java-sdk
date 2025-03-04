// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStudioAppListResponseBodyData data;

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

    public static QueryStudioAppListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppListResponseBody self = new QueryStudioAppListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppListResponseBody setData(QueryStudioAppListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppListResponseBodyData getData() {
        return this.data;
    }

    public QueryStudioAppListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStudioAppListResponseBodyDataListAppInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a123********</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>322******</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>a605*******</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2020-12-25 16:20:53</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-04-10 15:06:23</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>2021-04-15 19:11:32</p>
         */
        @NameInMap("GmtRelease")
        public String gmtRelease;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>a123********</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>webApp</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryStudioAppListResponseBodyDataListAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseBodyDataListAppInfo self = new QueryStudioAppListResponseBodyDataListAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setGmtRelease(String gmtRelease) {
            this.gmtRelease = gmtRelease;
            return this;
        }
        public String getGmtRelease() {
            return this.gmtRelease;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryStudioAppListResponseBodyDataListAppInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryStudioAppListResponseBodyDataList extends TeaModel {
        @NameInMap("AppInfo")
        public java.util.List<QueryStudioAppListResponseBodyDataListAppInfo> appInfo;

        public static QueryStudioAppListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseBodyDataList self = new QueryStudioAppListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseBodyDataList setAppInfo(java.util.List<QueryStudioAppListResponseBodyDataListAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<QueryStudioAppListResponseBodyDataListAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

    public static class QueryStudioAppListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryStudioAppListResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalPage")
        public Integer totalPage;

        public static QueryStudioAppListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseBodyData self = new QueryStudioAppListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseBodyData setList(QueryStudioAppListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppListResponseBodyDataList getList() {
            return this.list;
        }

        public QueryStudioAppListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppListResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
