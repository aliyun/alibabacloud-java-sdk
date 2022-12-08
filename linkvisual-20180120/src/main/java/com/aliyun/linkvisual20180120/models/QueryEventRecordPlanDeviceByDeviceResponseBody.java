// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEventRecordPlanDeviceByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventRecordPlanDeviceByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByDeviceResponseBody self = new QueryEventRecordPlanDeviceByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDeviceByDeviceResponseBody setData(QueryEventRecordPlanDeviceByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDeviceByDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryEventRecordPlanDeviceByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDeviceByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDeviceByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("End")
        public Integer end;

        public static QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList self = new QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo extends TeaModel {
        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TimeSectionList")
        public java.util.List<QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo self = new QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setTimeSectionList(java.util.List<QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseBodyData extends TeaModel {
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
        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo templateInfo;

        public static QueryEventRecordPlanDeviceByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseBodyData self = new QueryEventRecordPlanDeviceByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseBodyData setTemplateInfo(QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryEventRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
