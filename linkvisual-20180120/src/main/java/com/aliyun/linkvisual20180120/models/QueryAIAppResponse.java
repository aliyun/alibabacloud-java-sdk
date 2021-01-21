// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryAIAppResponseData data;

    public static QueryAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIAppResponse self = new QueryAIAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIAppResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIAppResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIAppResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIAppResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIAppResponse setData(QueryAIAppResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAIAppResponseData getData() {
        return this.data;
    }

    public static class QueryAIAppResponseDataList extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

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

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static QueryAIAppResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIAppResponseDataList self = new QueryAIAppResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIAppResponseDataList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAIAppResponseDataList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryAIAppResponseDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryAIAppResponseDataList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryAIAppResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAIAppResponseDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryAIAppResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryAIAppResponseDataList> list;

        public static QueryAIAppResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIAppResponseData self = new QueryAIAppResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAIAppResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIAppResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIAppResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIAppResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIAppResponseData setList(java.util.List<QueryAIAppResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIAppResponseDataList> getList() {
            return this.list;
        }

    }

}
