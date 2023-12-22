// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCampaignResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCampaignResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCampaignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCampaignResponseBody self = new GetCampaignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCampaignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCampaignResponseBody setData(GetCampaignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCampaignResponseBodyData getData() {
        return this.data;
    }

    public GetCampaignResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCampaignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCampaignResponseBodyData extends TeaModel {
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

        @NameInMap("CasesUncompletedAfterAttempt")
        public String casesUncompletedAfterAttempt;

        @NameInMap("CasesUncompletedAfterAttempted")
        public Long casesUncompletedAfterAttempted;

        @NameInMap("CompletionRate")
        public Float completionRate;

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

        @NameInMap("SimulationParameters")
        public String simulationParameters;

        @NameInMap("State")
        public String state;

        @NameInMap("StrategyParameters")
        public String strategyParameters;

        @NameInMap("StrategyType")
        public String strategyType;

        @NameInMap("TotalCases")
        public Long totalCases;

        public static GetCampaignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCampaignResponseBodyData self = new GetCampaignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCampaignResponseBodyData setActualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        public GetCampaignResponseBodyData setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public GetCampaignResponseBodyData setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public GetCampaignResponseBodyData setCasesAborted(Long casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }
        public Long getCasesAborted() {
            return this.casesAborted;
        }

        public GetCampaignResponseBodyData setCasesConnected(Long casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }
        public Long getCasesConnected() {
            return this.casesConnected;
        }

        public GetCampaignResponseBodyData setCasesUncompleted(Long casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }
        public Long getCasesUncompleted() {
            return this.casesUncompleted;
        }

        public GetCampaignResponseBodyData setCasesUncompletedAfterAttempt(String casesUncompletedAfterAttempt) {
            this.casesUncompletedAfterAttempt = casesUncompletedAfterAttempt;
            return this;
        }
        public String getCasesUncompletedAfterAttempt() {
            return this.casesUncompletedAfterAttempt;
        }

        public GetCampaignResponseBodyData setCasesUncompletedAfterAttempted(Long casesUncompletedAfterAttempted) {
            this.casesUncompletedAfterAttempted = casesUncompletedAfterAttempted;
            return this;
        }
        public Long getCasesUncompletedAfterAttempted() {
            return this.casesUncompletedAfterAttempted;
        }

        public GetCampaignResponseBodyData setCompletionRate(Float completionRate) {
            this.completionRate = completionRate;
            return this;
        }
        public Float getCompletionRate() {
            return this.completionRate;
        }

        public GetCampaignResponseBodyData setMaxAttemptCount(Long maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }
        public Long getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        public GetCampaignResponseBodyData setMinAttemptInterval(Long minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Long getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public GetCampaignResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCampaignResponseBodyData setPlanedEndTime(Long planedEndTime) {
            this.planedEndTime = planedEndTime;
            return this;
        }
        public Long getPlanedEndTime() {
            return this.planedEndTime;
        }

        public GetCampaignResponseBodyData setPlanedStartTime(Long planedStartTime) {
            this.planedStartTime = planedStartTime;
            return this;
        }
        public Long getPlanedStartTime() {
            return this.planedStartTime;
        }

        public GetCampaignResponseBodyData setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public GetCampaignResponseBodyData setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetCampaignResponseBodyData setSimulation(Boolean simulation) {
            this.simulation = simulation;
            return this;
        }
        public Boolean getSimulation() {
            return this.simulation;
        }

        public GetCampaignResponseBodyData setSimulationParameters(String simulationParameters) {
            this.simulationParameters = simulationParameters;
            return this;
        }
        public String getSimulationParameters() {
            return this.simulationParameters;
        }

        public GetCampaignResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetCampaignResponseBodyData setStrategyParameters(String strategyParameters) {
            this.strategyParameters = strategyParameters;
            return this;
        }
        public String getStrategyParameters() {
            return this.strategyParameters;
        }

        public GetCampaignResponseBodyData setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public GetCampaignResponseBodyData setTotalCases(Long totalCases) {
            this.totalCases = totalCases;
            return this;
        }
        public Long getTotalCases() {
            return this.totalCases;
        }

    }

}
