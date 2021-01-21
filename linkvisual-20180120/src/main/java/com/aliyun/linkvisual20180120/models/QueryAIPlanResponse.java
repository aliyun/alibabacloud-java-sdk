// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanResponse extends TeaModel {
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
    public QueryAIPlanResponseData data;

    public static QueryAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanResponse self = new QueryAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIPlanResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIPlanResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIPlanResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIPlanResponse setData(QueryAIPlanResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAIPlanResponseData getData() {
        return this.data;
    }

    public static class QueryAIPlanResponseDataList extends TeaModel {
        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("PlanTemplateId")
        @Validation(required = true)
        public String planTemplateId;

        @NameInMap("TriggerEnum")
        @Validation(required = true)
        public Integer triggerEnum;

        @NameInMap("IntervalTiming")
        @Validation(required = true)
        public Integer intervalTiming;

        @NameInMap("PreTiming")
        @Validation(required = true)
        public Long preTiming;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static QueryAIPlanResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanResponseDataList self = new QueryAIPlanResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanResponseDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryAIPlanResponseDataList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAIPlanResponseDataList setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public QueryAIPlanResponseDataList setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public QueryAIPlanResponseDataList setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        public QueryAIPlanResponseDataList setPreTiming(Long preTiming) {
            this.preTiming = preTiming;
            return this;
        }
        public Long getPreTiming() {
            return this.preTiming;
        }

        public QueryAIPlanResponseDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryAIPlanResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryAIPlanResponseDataList> list;

        public static QueryAIPlanResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanResponseData self = new QueryAIPlanResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIPlanResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIPlanResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIPlanResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIPlanResponseData setList(java.util.List<QueryAIPlanResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIPlanResponseDataList> getList() {
            return this.list;
        }

    }

}
