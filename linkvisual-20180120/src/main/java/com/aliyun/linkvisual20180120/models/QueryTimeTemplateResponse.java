// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateResponse extends TeaModel {
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
    public QueryTimeTemplateResponseData data;

    public static QueryTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateResponse self = new QueryTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimeTemplateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTimeTemplateResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTimeTemplateResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimeTemplateResponse setData(QueryTimeTemplateResponseData data) {
        this.data = data;
        return this;
    }
    public QueryTimeTemplateResponseData getData() {
        return this.data;
    }

    public static class QueryTimeTemplateResponseDataListTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryTimeTemplateResponseDataListTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseDataListTimeSectionList self = new QueryTimeTemplateResponseDataListTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseDataListTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryTimeTemplateResponseDataListTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryTimeTemplateResponseDataListTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryTimeTemplateResponseDataList extends TeaModel {
        @NameInMap("Default")
        @Validation(required = true)
        public Integer _default;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("AllDay")
        @Validation(required = true)
        public Integer allDay;

        @NameInMap("TimeSectionList")
        @Validation(required = true)
        public java.util.List<QueryTimeTemplateResponseDataListTimeSectionList> timeSectionList;

        public static QueryTimeTemplateResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseDataList self = new QueryTimeTemplateResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseDataList set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryTimeTemplateResponseDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTimeTemplateResponseDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryTimeTemplateResponseDataList setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryTimeTemplateResponseDataList setTimeSectionList(java.util.List<QueryTimeTemplateResponseDataListTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryTimeTemplateResponseDataListTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryTimeTemplateResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryTimeTemplateResponseDataList> list;

        public static QueryTimeTemplateResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseData self = new QueryTimeTemplateResponseData();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryTimeTemplateResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryTimeTemplateResponseData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryTimeTemplateResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryTimeTemplateResponseData setList(java.util.List<QueryTimeTemplateResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTimeTemplateResponseDataList> getList() {
            return this.list;
        }

    }

}
