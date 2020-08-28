// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDetailResponse extends TeaModel {
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
    public QueryRecordPlanDetailResponseData data;

    public static QueryRecordPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDetailResponse self = new QueryRecordPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlanDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRecordPlanDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlanDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlanDetailResponse setData(QueryRecordPlanDetailResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlanDetailResponseData getData() {
        return this.data;
    }

    public static class QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList extends TeaModel {
        @NameInMap("DayOfWeek")
        @Validation(required = true)
        public Integer dayOfWeek;

        @NameInMap("Begin")
        @Validation(required = true)
        public Integer begin;

        @NameInMap("End")
        @Validation(required = true)
        public Integer end;

        public static QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList self = new QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryRecordPlanDetailResponseDataTemplateInfo extends TeaModel {
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
        public java.util.List<QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList> timeSectionList;

        public static QueryRecordPlanDetailResponseDataTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseDataTemplateInfo self = new QueryRecordPlanDetailResponseDataTemplateInfo();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseDataTemplateInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfo set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfo setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryRecordPlanDetailResponseDataTemplateInfo setTimeSectionList(java.util.List<QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryRecordPlanDetailResponseDataTemplateInfoTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

    public static class QueryRecordPlanDetailResponseData extends TeaModel {
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
        public QueryRecordPlanDetailResponseDataTemplateInfo templateInfo;

        public static QueryRecordPlanDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlanDetailResponseData self = new QueryRecordPlanDetailResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlanDetailResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlanDetailResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlanDetailResponseData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryRecordPlanDetailResponseData setTemplateInfo(QueryRecordPlanDetailResponseDataTemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }
        public QueryRecordPlanDetailResponseDataTemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

    }

}
