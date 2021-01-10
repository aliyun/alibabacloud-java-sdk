// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryTimeTemplateDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTimeTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailResponseBody self = new QueryTimeTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimeTemplateDetailResponseBody setData(QueryTimeTemplateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTimeTemplateDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTimeTemplateDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTimeTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimeTemplateDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTimeTemplateDetailResponseBodyDataTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static QueryTimeTemplateDetailResponseBodyDataTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseBodyDataTimeSectionList self = new QueryTimeTemplateDetailResponseBodyDataTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryTimeTemplateDetailResponseBodyData extends TeaModel {
        @NameInMap("TimeSectionList")
        public java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> timeSectionList;

        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryTimeTemplateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseBodyData self = new QueryTimeTemplateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseBodyData setTimeSectionList(java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

        public QueryTimeTemplateDetailResponseBodyData setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryTimeTemplateDetailResponseBodyData set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryTimeTemplateDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTimeTemplateDetailResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
