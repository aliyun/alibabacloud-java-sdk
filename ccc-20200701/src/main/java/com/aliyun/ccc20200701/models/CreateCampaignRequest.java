// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCampaignRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;beginTime&quot;:&quot;00:00:00&quot;,&quot;endTime&quot;:&quot;23:00:00&quot; }]</p>
     */
    @NameInMap("CallableTime")
    public String callableTime;

    /**
     * <strong>example:</strong>
     * <p>ccc-test/namelist.csv</p>
     */
    @NameInMap("CaseFileKey")
    public String caseFileKey;

    @NameInMap("CaseList")
    public java.util.List<CreateCampaignRequestCaseList> caseList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1f2bc75-422e-43c7-9c9d9d95633a</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634313600000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExecutingUntilTimeout")
    public Boolean executingUntilTimeout;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxAttemptCount")
    public Long maxAttemptCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAttemptInterval")
    public Long minAttemptInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-campaign</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    @NameInMap("Simulation")
    public Boolean simulation;

    @NameInMap("SimulationParameters")
    public String simulationParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634140800000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ratio&quot;:1}</p>
     */
    @NameInMap("StrategyParameters")
    public String strategyParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PACING</p>
     */
    @NameInMap("StrategyType")
    public String strategyType;

    public static CreateCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignRequest self = new CreateCampaignRequest();
        return TeaModel.build(map, self);
    }

    public CreateCampaignRequest setCallableTime(String callableTime) {
        this.callableTime = callableTime;
        return this;
    }
    public String getCallableTime() {
        return this.callableTime;
    }

    public CreateCampaignRequest setCaseFileKey(String caseFileKey) {
        this.caseFileKey = caseFileKey;
        return this;
    }
    public String getCaseFileKey() {
        return this.caseFileKey;
    }

    public CreateCampaignRequest setCaseList(java.util.List<CreateCampaignRequestCaseList> caseList) {
        this.caseList = caseList;
        return this;
    }
    public java.util.List<CreateCampaignRequestCaseList> getCaseList() {
        return this.caseList;
    }

    public CreateCampaignRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public CreateCampaignRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateCampaignRequest setExecutingUntilTimeout(Boolean executingUntilTimeout) {
        this.executingUntilTimeout = executingUntilTimeout;
        return this;
    }
    public Boolean getExecutingUntilTimeout() {
        return this.executingUntilTimeout;
    }

    public CreateCampaignRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCampaignRequest setMaxAttemptCount(Long maxAttemptCount) {
        this.maxAttemptCount = maxAttemptCount;
        return this;
    }
    public Long getMaxAttemptCount() {
        return this.maxAttemptCount;
    }

    public CreateCampaignRequest setMinAttemptInterval(Long minAttemptInterval) {
        this.minAttemptInterval = minAttemptInterval;
        return this;
    }
    public Long getMinAttemptInterval() {
        return this.minAttemptInterval;
    }

    public CreateCampaignRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCampaignRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public CreateCampaignRequest setSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }
    public Boolean getSimulation() {
        return this.simulation;
    }

    public CreateCampaignRequest setSimulationParameters(String simulationParameters) {
        this.simulationParameters = simulationParameters;
        return this;
    }
    public String getSimulationParameters() {
        return this.simulationParameters;
    }

    public CreateCampaignRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateCampaignRequest setStrategyParameters(String strategyParameters) {
        this.strategyParameters = strategyParameters;
        return this;
    }
    public String getStrategyParameters() {
        return this.strategyParameters;
    }

    public CreateCampaignRequest setStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public String getStrategyType() {
        return this.strategyType;
    }

    public static class CreateCampaignRequestCaseList extends TeaModel {
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <strong>example:</strong>
         * <p>1888888888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static CreateCampaignRequestCaseList build(java.util.Map<String, ?> map) throws Exception {
            CreateCampaignRequestCaseList self = new CreateCampaignRequestCaseList();
            return TeaModel.build(map, self);
        }

        public CreateCampaignRequestCaseList setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public CreateCampaignRequestCaseList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateCampaignRequestCaseList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
