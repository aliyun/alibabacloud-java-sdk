// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppsResponse extends TeaModel {
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
    public QueryPictureSearchAppsResponseData data;

    public static QueryPictureSearchAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppsResponse self = new QueryPictureSearchAppsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAppsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchAppsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAppsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAppsResponse setData(QueryPictureSearchAppsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAppsResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchAppsResponseDataPageData extends TeaModel {
        @NameInMap("AppInstanceId")
        @Validation(required = true)
        public String appInstanceId;

        @NameInMap("AppTemplateId")
        @Validation(required = true)
        public String appTemplateId;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Level")
        @Validation(required = true)
        public Integer level;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static QueryPictureSearchAppsResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppsResponseDataPageData self = new QueryPictureSearchAppsResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppsResponseDataPageData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public QueryPictureSearchAppsResponseDataPageData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryPictureSearchAppsResponseDataPageData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryPictureSearchAppsResponseDataPageData setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryPictureSearchAppsResponseDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPictureSearchAppsResponseDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPictureSearchAppsResponseDataPageData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryPictureSearchAppsResponseDataPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryPictureSearchAppsResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<QueryPictureSearchAppsResponseDataPageData> pageData;

        public static QueryPictureSearchAppsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppsResponseData self = new QueryPictureSearchAppsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppsResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchAppsResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchAppsResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchAppsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchAppsResponseData setPageData(java.util.List<QueryPictureSearchAppsResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchAppsResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}
