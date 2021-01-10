// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAIPlanResponseBodyData data;

    public static QueryAIPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanResponseBody self = new QueryAIPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIPlanResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIPlanResponseBody setData(QueryAIPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAIPlanResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAIPlanResponseBodyDataList extends TeaModel {
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PlanTemplateId")
        public String planTemplateId;

        @NameInMap("TriggerEnum")
        public Integer triggerEnum;

        @NameInMap("IntervalTiming")
        public Integer intervalTiming;

        @NameInMap("PreTiming")
        public Long preTiming;

        @NameInMap("Description")
        public String description;

        public static QueryAIPlanResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanResponseBodyDataList self = new QueryAIPlanResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryAIPlanResponseBodyDataList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryAIPlanResponseBodyDataList setPlanTemplateId(String planTemplateId) {
            this.planTemplateId = planTemplateId;
            return this;
        }
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        public QueryAIPlanResponseBodyDataList setTriggerEnum(Integer triggerEnum) {
            this.triggerEnum = triggerEnum;
            return this;
        }
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public QueryAIPlanResponseBodyDataList setIntervalTiming(Integer intervalTiming) {
            this.intervalTiming = intervalTiming;
            return this;
        }
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        public QueryAIPlanResponseBodyDataList setPreTiming(Long preTiming) {
            this.preTiming = preTiming;
            return this;
        }
        public Long getPreTiming() {
            return this.preTiming;
        }

        public QueryAIPlanResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryAIPlanResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<QueryAIPlanResponseBodyDataList> list;

        public static QueryAIPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIPlanResponseBodyData self = new QueryAIPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAIPlanResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryAIPlanResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryAIPlanResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAIPlanResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAIPlanResponseBodyData setList(java.util.List<QueryAIPlanResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAIPlanResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
