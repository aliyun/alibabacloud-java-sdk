// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPictureSearchAppsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchAppsResponseBody self = new QueryPictureSearchAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchAppsResponseBody setData(QueryPictureSearchAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchAppsResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchAppsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchAppsResponseBodyDataPageData extends TeaModel {
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static QueryPictureSearchAppsResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppsResponseBodyDataPageData self = new QueryPictureSearchAppsResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPictureSearchAppsResponseBodyDataPageData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryPictureSearchAppsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchAppsResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryPictureSearchAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchAppsResponseBodyData self = new QueryPictureSearchAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchAppsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchAppsResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchAppsResponseBodyData setPageData(java.util.List<QueryPictureSearchAppsResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchAppsResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchAppsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchAppsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
