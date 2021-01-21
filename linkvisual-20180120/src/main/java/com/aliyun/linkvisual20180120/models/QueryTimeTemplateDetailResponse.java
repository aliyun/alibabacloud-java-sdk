// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailResponse extends TeaModel {
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
    public QueryTimeTemplateDetailResponseData data;

    public static QueryTimeTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailResponse self = new QueryTimeTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimeTemplateDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTimeTemplateDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTimeTemplateDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimeTemplateDetailResponse setData(QueryTimeTemplateDetailResponseData data) {
        this.data = data;
        return this;
    }
    public QueryTimeTemplateDetailResponseData getData() {
        return this.data;
    }

    public static class QueryTimeTemplateDetailResponseDataTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryTimeTemplateDetailResponseDataTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseDataTimeSectionList self = new QueryTimeTemplateDetailResponseDataTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseDataTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryTimeTemplateDetailResponseDataTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryTimeTemplateDetailResponseDataTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryTimeTemplateDetailResponseData extends TeaModel {
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
        public java.util.List<QueryTimeTemplateDetailResponseDataTimeSectionList> timeSectionList;

        public static QueryTimeTemplateDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseData self = new QueryTimeTemplateDetailResponseData();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseData set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryTimeTemplateDetailResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTimeTemplateDetailResponseData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryTimeTemplateDetailResponseData setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryTimeTemplateDetailResponseData setTimeSectionList(java.util.List<QueryTimeTemplateDetailResponseDataTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryTimeTemplateDetailResponseDataTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

}
