// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlansResponse extends TeaModel {
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
    public QueryEventRecordPlansResponseData data;

    public static QueryEventRecordPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlansResponse self = new QueryEventRecordPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlansResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlansResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEventRecordPlansResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlansResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlansResponse setData(QueryEventRecordPlansResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlansResponseData getData() {
        return this.data;
    }

    public static class QueryEventRecordPlansResponseDataList extends TeaModel {
        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("PreRecordDuration")
        @Validation(required = true)
        public Integer preRecordDuration;

        @NameInMap("RecordDuration")
        @Validation(required = true)
        public Integer recordDuration;

        public static QueryEventRecordPlansResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlansResponseDataList self = new QueryEventRecordPlansResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlansResponseDataList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryEventRecordPlansResponseDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlansResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlansResponseDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlansResponseDataList setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlansResponseDataList setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

    }

    public static class QueryEventRecordPlansResponseData extends TeaModel {
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
        public java.util.List<QueryEventRecordPlansResponseDataList> list;

        public static QueryEventRecordPlansResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlansResponseData self = new QueryEventRecordPlansResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlansResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEventRecordPlansResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEventRecordPlansResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryEventRecordPlansResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryEventRecordPlansResponseData setList(java.util.List<QueryEventRecordPlansResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEventRecordPlansResponseDataList> getList() {
            return this.list;
        }

    }

}
