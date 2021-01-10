// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryEventRecordPlansResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventRecordPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlansResponseBody self = new QueryEventRecordPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlansResponseBody setData(QueryEventRecordPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlansResponseBodyData getData() {
        return this.data;
    }

    public QueryEventRecordPlansResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventRecordPlansResponseBodyDataList extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("RecordDuration")
        public Integer recordDuration;

        @NameInMap("PreRecordDuration")
        public Integer preRecordDuration;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryEventRecordPlansResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlansResponseBodyDataList self = new QueryEventRecordPlansResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlansResponseBodyDataList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public QueryEventRecordPlansResponseBodyDataList setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        public QueryEventRecordPlansResponseBodyDataList setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlansResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlansResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlansResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryEventRecordPlansResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryEventRecordPlansResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static QueryEventRecordPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlansResponseBodyData self = new QueryEventRecordPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlansResponseBodyData setList(java.util.List<QueryEventRecordPlansResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEventRecordPlansResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryEventRecordPlansResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEventRecordPlansResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryEventRecordPlansResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEventRecordPlansResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
