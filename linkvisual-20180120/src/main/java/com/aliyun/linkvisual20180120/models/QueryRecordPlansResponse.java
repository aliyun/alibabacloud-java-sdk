// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlansResponse extends TeaModel {
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
    public QueryRecordPlansResponseData data;

    public static QueryRecordPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlansResponse self = new QueryRecordPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlansResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlansResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordPlansResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlansResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlansResponse setData(QueryRecordPlansResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlansResponseData getData() {
        return this.data;
    }

    public static class QueryRecordPlansResponseDataList extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        public static QueryRecordPlansResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseDataList self = new QueryRecordPlansResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlansResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlansResponseDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryRecordPlansResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryRecordPlansResponseDataList> list;

        public static QueryRecordPlansResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseData self = new QueryRecordPlansResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryRecordPlansResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordPlansResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRecordPlansResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryRecordPlansResponseData setList(java.util.List<QueryRecordPlansResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordPlansResponseDataList> getList() {
            return this.list;
        }

    }

}
