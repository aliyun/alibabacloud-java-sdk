// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCampaignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCampaignResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>6CCEF32F-8614-535F-A1D9-D85B8C0DC4F0</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("ActualEndTime")
        public Long actualEndTime;

        /**
         * <strong>example:</strong>
         * <p>1634000460000</p>
         */
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        /**
         * <strong>example:</strong>
         * <p>6badb397-a8b5-40b6-21019d382a09</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesAborted")
        public Long casesAborted;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("CasesConnected")
        public Long casesConnected;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesUncompleted")
        public Long casesUncompleted;

        @NameInMap("CasesUncompletedAfterAttempt")
        public String casesUncompletedAfterAttempt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CasesUncompletedAfterAttempted")
        public Long casesUncompletedAfterAttempted;

        @NameInMap("CompletionRate")
        public Float completionRate;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxAttemptCount")
        public Long maxAttemptCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinAttemptInterval")
        public Long minAttemptInterval;

        /**
         * <strong>example:</strong>
         * <p>test-campaign</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        @NameInMap("PlanedEndTime")
        public Long planedEndTime;

        /**
         * <strong>example:</strong>
         * <p>1633968000000</p>
         */
        @NameInMap("PlanedStartTime")
        public Long planedStartTime;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Simulation")
        public Boolean simulation;

        @NameInMap("SimulationParameters")
        public String simulationParameters;

        /**
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>{&quot;ratio&quot;:1}</p>
         */
        @NameInMap("StrategyParameters")
        public String strategyParameters;

        /**
         * <strong>example:</strong>
         * <p>PACING</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public GetCampaignResponseBodyData setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
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
