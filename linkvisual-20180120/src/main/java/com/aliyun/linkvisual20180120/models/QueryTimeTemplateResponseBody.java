// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryTimeTemplateResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTimeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateResponseBody self = new QueryTimeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimeTemplateResponseBody setData(QueryTimeTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTimeTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryTimeTemplateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTimeTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimeTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTimeTemplateResponseBodyDataListTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static QueryTimeTemplateResponseBodyDataListTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseBodyDataListTimeSectionList self = new QueryTimeTemplateResponseBodyDataListTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseBodyDataListTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryTimeTemplateResponseBodyDataListTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryTimeTemplateResponseBodyDataListTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryTimeTemplateResponseBodyDataList extends TeaModel {
        @NameInMap("TimeSectionList")
        public java.util.List<QueryTimeTemplateResponseBodyDataListTimeSectionList> timeSectionList;

        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryTimeTemplateResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseBodyDataList self = new QueryTimeTemplateResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseBodyDataList setTimeSectionList(java.util.List<QueryTimeTemplateResponseBodyDataListTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryTimeTemplateResponseBodyDataListTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

        public QueryTimeTemplateResponseBodyDataList setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryTimeTemplateResponseBodyDataList set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryTimeTemplateResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTimeTemplateResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryTimeTemplateResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryTimeTemplateResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("Page")
        public Integer page;

        public static QueryTimeTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateResponseBodyData self = new QueryTimeTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateResponseBodyData setList(java.util.List<QueryTimeTemplateResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTimeTemplateResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryTimeTemplateResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryTimeTemplateResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryTimeTemplateResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryTimeTemplateResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
