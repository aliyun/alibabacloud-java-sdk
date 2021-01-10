// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryRecordPlansResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlansResponseBody self = new QueryRecordPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlansResponseBody setData(QueryRecordPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlansResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordPlansResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordPlansResponseBodyDataList extends TeaModel {
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryRecordPlansResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseBodyDataList self = new QueryRecordPlansResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlansResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlansResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryRecordPlansResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryRecordPlansResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static QueryRecordPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseBodyData self = new QueryRecordPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseBodyData setList(java.util.List<QueryRecordPlansResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordPlansResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryRecordPlansResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordPlansResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryRecordPlansResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryRecordPlansResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
