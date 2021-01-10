// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryRecordPlanDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordPlanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDetailResponseBody self = new QueryRecordPlanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDetailResponseBody setData(QueryRecordPlanDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordPlanDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList self = new QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryRecordPlanDetailResponseBodyDataTemplateInfo extends TeaModel {
        @NameInMap("TimeSectionList")
        public java.util.List<QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> timeSectionList;

        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryRecordPlanDetailResponseBodyDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseBodyDataTemplateInfo self = new QueryRecordPlanDetailResponseBodyDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfo setTimeSectionList(java.util.List<QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryRecordPlanDetailResponseBodyDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDetailResponseBodyDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryRecordPlanDetailResponseBodyData extends TeaModel {
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateInfo")
        public QueryRecordPlanDetailResponseBodyDataTemplateInfo templateInfo;

        @NameInMap("TemplateId")
        public String templateId;

        public static QueryRecordPlanDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseBodyData self = new QueryRecordPlanDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlanDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDetailResponseBodyData setTemplateInfo(QueryRecordPlanDetailResponseBodyDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryRecordPlanDetailResponseBodyDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

        public QueryRecordPlanDetailResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
