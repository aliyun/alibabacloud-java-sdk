// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCampaignsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCampaignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsResponseBody self = new ListCampaignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCampaignsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCampaignsResponseBody setData(ListCampaignsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCampaignsResponseBodyData getData() {
        return this.data;
    }

    public ListCampaignsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCampaignsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCampaignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCampaignsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCampaignsResponseBodyDataList extends TeaModel {
        @NameInMap("ActualEndTime")
        public Long actualEndTime;

        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        @NameInMap("CampaignId")
        public String campaignId;

        @NameInMap("CasesAborted")
        public Long casesAborted;

        @NameInMap("CasesConnected")
        public Long casesConnected;

        @NameInMap("CasesUncompleted")
        public Long casesUncompleted;

        @NameInMap("MaxAttemptCount")
        public Long maxAttemptCount;

        @NameInMap("MinAttemptInterval")
        public Long minAttemptInterval;

        @NameInMap("Name")
        public String name;

        @NameInMap("PlanedEndTime")
        public Long planedEndTime;

        @NameInMap("PlanedStartTime")
        public Long planedStartTime;

        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("Simulation")
        public Boolean simulation;

        @NameInMap("State")
        public String state;

        @NameInMap("StrategyParameters")
        public String strategyParameters;

        @NameInMap("StrategyType")
        public String strategyType;

        @NameInMap("TotalCases")
        public Long totalCases;

        public static ListCampaignsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyDataList self = new ListCampaignsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyDataList setActualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        public ListCampaignsResponseBodyDataList setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public ListCampaignsResponseBodyDataList setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListCampaignsResponseBodyDataList setCasesAborted(Long casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }
        public Long getCasesAborted() {
            return this.casesAborted;
        }

        public ListCampaignsResponseBodyDataList setCasesConnected(Long casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }
        public Long getCasesConnected() {
            return this.casesConnected;
        }

        public ListCampaignsResponseBodyDataList setCasesUncompleted(Long casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }
        public Long getCasesUncompleted() {
            return this.casesUncompleted;
        }

        public ListCampaignsResponseBodyDataList setMaxAttemptCount(Long maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }
        public Long getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        public ListCampaignsResponseBodyDataList setMinAttemptInterval(Long minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Long getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ListCampaignsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCampaignsResponseBodyDataList setPlanedEndTime(Long planedEndTime) {
            this.planedEndTime = planedEndTime;
            return this;
        }
        public Long getPlanedEndTime() {
            return this.planedEndTime;
        }

        public ListCampaignsResponseBodyDataList setPlanedStartTime(Long planedStartTime) {
            this.planedStartTime = planedStartTime;
            return this;
        }
        public Long getPlanedStartTime() {
            return this.planedStartTime;
        }

        public ListCampaignsResponseBodyDataList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public ListCampaignsResponseBodyDataList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListCampaignsResponseBodyDataList setSimulation(Boolean simulation) {
            this.simulation = simulation;
            return this;
        }
        public Boolean getSimulation() {
            return this.simulation;
        }

        public ListCampaignsResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCampaignsResponseBodyDataList setStrategyParameters(String strategyParameters) {
            this.strategyParameters = strategyParameters;
            return this;
        }
        public String getStrategyParameters() {
            return this.strategyParameters;
        }

        public ListCampaignsResponseBodyDataList setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ListCampaignsResponseBodyDataList setTotalCases(Long totalCases) {
            this.totalCases = totalCases;
            return this;
        }
        public Long getTotalCases() {
            return this.totalCases;
        }

    }

    public static class ListCampaignsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCampaignsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCampaignsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyData self = new ListCampaignsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyData setList(java.util.List<ListCampaignsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCampaignsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCampaignsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCampaignsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCampaignsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
