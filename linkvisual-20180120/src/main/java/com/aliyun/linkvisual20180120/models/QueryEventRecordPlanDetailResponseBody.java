// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEventRecordPlanDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventRecordPlanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDetailResponseBody self = new QueryEventRecordPlanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDetailResponseBody setData(QueryEventRecordPlanDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryEventRecordPlanDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("End")
        public Integer end;

        public static QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList self = new QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryEventRecordPlanDetailResponseBodyDataTemplateInfo extends TeaModel {
        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TimeSectionList")
        public java.util.List<QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryEventRecordPlanDetailResponseBodyDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseBodyDataTemplateInfo self = new QueryEventRecordPlanDetailResponseBodyDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo setTimeSectionList(java.util.List<QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryEventRecordPlanDetailResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PreRecordDuration")
        public Integer preRecordDuration;

        @NameInMap("RecordDuration")
        public Integer recordDuration;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateInfo")
        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo templateInfo;

        public static QueryEventRecordPlanDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseBodyData self = new QueryEventRecordPlanDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDetailResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlanDetailResponseBodyData setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlanDetailResponseBodyData setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        public QueryEventRecordPlanDetailResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDetailResponseBodyData setTemplateInfo(QueryEventRecordPlanDetailResponseBodyDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryEventRecordPlanDetailResponseBodyDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
