// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByDeviceResponse extends TeaModel {
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
    public QueryRecordPlanDeviceByDeviceResponseData data;

    public static QueryRecordPlanDeviceByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByDeviceResponse self = new QueryRecordPlanDeviceByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDeviceByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordPlanDeviceByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDeviceByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDeviceByDeviceResponse setData(QueryRecordPlanDeviceByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDeviceByDeviceResponseData getData() {
        return this.data;
    }

    public static class QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList self = new QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Default")
        @Validation(required = true)
        public Integer _default;

        @NameInMap("AllDay")
        @Validation(required = true)
        public Integer allDay;

        @NameInMap("TimeSectionList")
        @Validation(required = true)
        public java.util.List<QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo self = new QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo setTimeSectionList(java.util.List<QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryRecordPlanDeviceByDeviceResponseData extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("TemplateInfo")
        @Validation(required = true)
        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo templateInfo;

        public static QueryRecordPlanDeviceByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDeviceByDeviceResponseData self = new QueryRecordPlanDeviceByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDeviceByDeviceResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlanDeviceByDeviceResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDeviceByDeviceResponseData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDeviceByDeviceResponseData setTemplateInfo(QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryRecordPlanDeviceByDeviceResponseDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
