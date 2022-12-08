// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecordPlanDeviceByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordPlanDeviceByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByDeviceResponseBody self = new QueryRecordPlanDeviceByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDeviceByDeviceResponseBody setData(QueryRecordPlanDeviceByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDeviceByDeviceResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordPlanDeviceByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDeviceByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDeviceByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("End")
        public Integer end;

        public static QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList self = new QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo extends TeaModel {
        @NameInMap("AllDay")
        public Integer allDay;

        @NameInMap("Default")
        public Integer _default;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TimeSectionList")
        public java.util.List<QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo self = new QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo setTimeSectionList(java.util.List<QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryRecordPlanDeviceByDeviceResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateInfo")
        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo templateInfo;

        public static QueryRecordPlanDeviceByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseBodyData self = new QueryRecordPlanDeviceByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDeviceByDeviceResponseBodyData setTemplateInfo(QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryRecordPlanDeviceByDeviceResponseBodyDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
