// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByDeviceResponse extends TeaModel {
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
    public QueryEventRecordPlanDeviceByDeviceResponseData data;

    public static QueryEventRecordPlanDeviceByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByDeviceResponse self = new QueryEventRecordPlanDeviceByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDeviceByDeviceResponse setData(QueryEventRecordPlanDeviceByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDeviceByDeviceResponseData getData() {
        return this.data;
    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList self = new QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo extends TeaModel {
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
        public java.util.List<QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo self = new QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo setTimeSectionList(java.util.List<QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryEventRecordPlanDeviceByDeviceResponseData extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("PreRecordDuration")
        @Validation(required = true)
        public Integer preRecordDuration;

        @NameInMap("RecordDuration")
        @Validation(required = true)
        public Integer recordDuration;

        @NameInMap("TemplateInfo")
        @Validation(required = true)
        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo templateInfo;

        public static QueryEventRecordPlanDeviceByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDeviceByDeviceResponseData self = new QueryEventRecordPlanDeviceByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        public QueryEventRecordPlanDeviceByDeviceResponseData setTemplateInfo(QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryEventRecordPlanDeviceByDeviceResponseDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
