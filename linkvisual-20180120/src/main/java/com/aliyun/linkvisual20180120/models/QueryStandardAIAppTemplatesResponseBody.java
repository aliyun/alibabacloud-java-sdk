// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryStandardAIAppTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryStandardAIAppTemplatesResponseBodyData data;

    public static QueryStandardAIAppTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardAIAppTemplatesResponseBody self = new QueryStandardAIAppTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStandardAIAppTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStandardAIAppTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryStandardAIAppTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryStandardAIAppTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStandardAIAppTemplatesResponseBody setData(QueryStandardAIAppTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryStandardAIAppTemplatesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryStandardAIAppTemplatesResponseBodyDataList extends TeaModel {
        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("Version")
        public String version;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        public static QueryStandardAIAppTemplatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryStandardAIAppTemplatesResponseBodyDataList self = new QueryStandardAIAppTemplatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryStandardAIAppTemplatesResponseBodyDataList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryStandardAIAppTemplatesResponseBodyDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryStandardAIAppTemplatesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryStandardAIAppTemplatesResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryStandardAIAppTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<QueryStandardAIAppTemplatesResponseBodyDataList> list;

        public static QueryStandardAIAppTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStandardAIAppTemplatesResponseBodyData self = new QueryStandardAIAppTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStandardAIAppTemplatesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryStandardAIAppTemplatesResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryStandardAIAppTemplatesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryStandardAIAppTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryStandardAIAppTemplatesResponseBodyData setList(java.util.List<QueryStandardAIAppTemplatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryStandardAIAppTemplatesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
