// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCampaignShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallableTime")
    public String callableTime;

    @NameInMap("CaseFileKey")
    public String caseFileKey;

    @NameInMap("CaseList")
    public String caseListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExecutingUntilTimeout")
    public Boolean executingUntilTimeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxAttemptCount")
    public Long maxAttemptCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MinAttemptInterval")
    public Long minAttemptInterval;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("Simulation")
    public Boolean simulation;

    @NameInMap("SimulationParameters")
    public String simulationParameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyParameters")
    public String strategyParameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyType")
    public String strategyType;

    public static CreateCampaignShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignShrinkRequest self = new CreateCampaignShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCampaignShrinkRequest setCallableTime(String callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public String getCallableTime() {
        return this.callableTime;
    }

    public CreateCampaignShrinkRequest setCaseFileKey(String caseFileKey) {
        this.caseFileKey = caseFileKey;
        return this;
    }
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    public CreateCampaignShrinkRequest setCaseListShrink(String caseListShrink) {
        this.caseListShrink = caseListShrink;
        return this;
    }
    public String getCaseListShrink() {
        return this.caseListShrink;
    }

    public CreateCampaignShrinkRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public CreateCampaignShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCampaignShrinkRequest setExecutingUntilTimeout(Boolean executingUntilTimeout) {
        this.executingUntilTimeout = executingUntilTimeout;
        return this;
    }
    public Boolean getExecutingUntilTimeout() {
        return this.executingUntilTimeout;
    }

    public CreateCampaignShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCampaignShrinkRequest setMaxAttemptCount(Long maxAttemptCount) {
        this.maxAttemptCount = maxAttemptCount;
        return this;
    }
    public Long getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public CreateCampaignShrinkRequest setMinAttemptInterval(Long minAttemptInterval) {
        this.minAttemptInterval = minAttemptInterval;
        return this;
    }
    public Long getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    public CreateCampaignShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCampaignShrinkRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateCampaignShrinkRequest setSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }
    public Boolean getSimulation() {
        return this.simulation;
    }

    public CreateCampaignShrinkRequest setSimulationParameters(String simulationParameters) {
        this.simulationParameters = simulationParameters;
        return this;
    }
    public String getSimulationParameters() {
        return this.simulationParameters;
    }

    public CreateCampaignShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCampaignShrinkRequest setStrategyParameters(String strategyParameters) {
        this.strategyParameters = strategyParameters;
        return this;
    }
    public String getStrategyParameters() {
        return this.strategyParameters;
    }

    public CreateCampaignShrinkRequest setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

}
