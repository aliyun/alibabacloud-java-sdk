// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStandardAIAppTemplatesResponse extends TeaModel {
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
    public QueryStandardAIAppTemplatesResponseData data;

    public static QueryStandardAIAppTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardAIAppTemplatesResponse self = new QueryStandardAIAppTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryStandardAIAppTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStandardAIAppTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStandardAIAppTemplatesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStandardAIAppTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStandardAIAppTemplatesResponse setData(QueryStandardAIAppTemplatesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryStandardAIAppTemplatesResponseData getData() {
        return this.data;
    }

    public static class QueryStandardAIAppTemplatesResponseDataList extends TeaModel {
        @NameInMap("AppTemplateId")
        @Validation(required = true)
        public String appTemplateId;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static QueryStandardAIAppTemplatesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStandardAIAppTemplatesResponseDataList self = new QueryStandardAIAppTemplatesResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryStandardAIAppTemplatesResponseDataList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryStandardAIAppTemplatesResponseDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryStandardAIAppTemplatesResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStandardAIAppTemplatesResponseDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryStandardAIAppTemplatesResponseData extends TeaModel {
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
        public java.util.List<QueryStandardAIAppTemplatesResponseDataList> list;

        public static QueryStandardAIAppTemplatesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryStandardAIAppTemplatesResponseData self = new QueryStandardAIAppTemplatesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryStandardAIAppTemplatesResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryStandardAIAppTemplatesResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryStandardAIAppTemplatesResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryStandardAIAppTemplatesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStandardAIAppTemplatesResponseData setList(java.util.List<QueryStandardAIAppTemplatesResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryStandardAIAppTemplatesResponseDataList> getList() {
            return this.list;
        }

    }

}
