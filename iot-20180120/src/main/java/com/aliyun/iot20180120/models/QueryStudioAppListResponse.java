// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppListResponse extends TeaModel {
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
    public QueryStudioAppListResponseData data;

    public static QueryStudioAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppListResponse self = new QueryStudioAppListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStudioAppListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStudioAppListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStudioAppListResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStudioAppListResponse setData(QueryStudioAppListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryStudioAppListResponseData getData() {
        return this.data;
    }

    public static class QueryStudioAppListResponseDataListAppInfo extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("AppSecret")
        @Validation(required = true)
        public String appSecret;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("GmtRelease")
        @Validation(required = true)
        public String gmtRelease;

        public static QueryStudioAppListResponseDataListAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseDataListAppInfo self = new QueryStudioAppListResponseDataListAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseDataListAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStudioAppListResponseDataListAppInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryStudioAppListResponseDataListAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public QueryStudioAppListResponseDataListAppInfo setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public QueryStudioAppListResponseDataListAppInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryStudioAppListResponseDataListAppInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryStudioAppListResponseDataListAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryStudioAppListResponseDataListAppInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryStudioAppListResponseDataListAppInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryStudioAppListResponseDataListAppInfo setGmtRelease(String gmtRelease) {
            this.gmtRelease = gmtRelease;
            return this;
        }
        public String getGmtRelease() {
            return this.gmtRelease;
        }

    }

    public static class QueryStudioAppListResponseDataList extends TeaModel {
        @NameInMap("AppInfo")
        @Validation(required = true)
        public java.util.List<QueryStudioAppListResponseDataListAppInfo> appInfo;

        public static QueryStudioAppListResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseDataList self = new QueryStudioAppListResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseDataList setAppInfo(java.util.List<QueryStudioAppListResponseDataListAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<QueryStudioAppListResponseDataListAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

    public static class QueryStudioAppListResponseData extends TeaModel {
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
        public QueryStudioAppListResponseDataList list;

        public static QueryStudioAppListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryStudioAppListResponseData self = new QueryStudioAppListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryStudioAppListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStudioAppListResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryStudioAppListResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryStudioAppListResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryStudioAppListResponseData setList(QueryStudioAppListResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryStudioAppListResponseDataList getList() {
            return this.list;
        }

    }

}
