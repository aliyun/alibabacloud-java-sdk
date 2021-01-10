// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAIAppResponseBodyData data;

    public static QueryAIAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAIAppResponseBody self = new QueryAIAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAIAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIAppResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIAppResponseBody setData(QueryAIAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAIAppResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAIAppResponseBodyDataList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("Version")
        public String version;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        public static QueryAIAppResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIAppResponseBodyDataList self = new QueryAIAppResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIAppResponseBodyDataList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAIAppResponseBodyDataList setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public QueryAIAppResponseBodyDataList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryAIAppResponseBodyDataList setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public QueryAIAppResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAIAppResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryAIAppResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<QueryAIAppResponseBodyDataList> list;

        public static QueryAIAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIAppResponseBodyData self = new QueryAIAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAIAppResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIAppResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIAppResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIAppResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIAppResponseBodyData setList(java.util.List<QueryAIAppResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIAppResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
