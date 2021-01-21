// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDetailResponse extends TeaModel {
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
    public QueryEventRecordPlanDetailResponseData data;

    public static QueryEventRecordPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDetailResponse self = new QueryEventRecordPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventRecordPlanDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEventRecordPlanDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEventRecordPlanDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventRecordPlanDetailResponse setData(QueryEventRecordPlanDetailResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEventRecordPlanDetailResponseData getData() {
        return this.data;
    }

    public static class QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList self = new QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryEventRecordPlanDetailResponseDataTemplateInfo extends TeaModel {
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
        public java.util.List<QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryEventRecordPlanDetailResponseDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseDataTemplateInfo self = new QueryEventRecordPlanDetailResponseDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryEventRecordPlanDetailResponseDataTemplateInfo setTimeSectionList(java.util.List<QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryEventRecordPlanDetailResponseDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryEventRecordPlanDetailResponseData extends TeaModel {
        @NameInMap("PreRecordDuration")
        @Validation(required = true)
        public Integer preRecordDuration;

        @NameInMap("RecordDuration")
        @Validation(required = true)
        public Integer recordDuration;

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
        public QueryEventRecordPlanDetailResponseDataTemplateInfo templateInfo;

        public static QueryEventRecordPlanDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventRecordPlanDetailResponseData self = new QueryEventRecordPlanDetailResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEventRecordPlanDetailResponseData setPreRecordDuration(Integer preRecordDuration) {
            this.preRecordDuration = preRecordDuration;
            return this;
        }
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        public QueryEventRecordPlanDetailResponseData setRecordDuration(Integer recordDuration) {
            this.recordDuration = recordDuration;
            return this;
        }
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        public QueryEventRecordPlanDetailResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryEventRecordPlanDetailResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEventRecordPlanDetailResponseData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEventRecordPlanDetailResponseData setTemplateInfo(QueryEventRecordPlanDetailResponseDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryEventRecordPlanDetailResponseDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
