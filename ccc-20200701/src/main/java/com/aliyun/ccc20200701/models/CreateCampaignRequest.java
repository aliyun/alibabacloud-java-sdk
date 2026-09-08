// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCampaignRequest extends TeaModel {
    /**
     * <p>The callable time window for the predictive outbound dialing activity, formatted as a JSON object containing two properties: beginTime and endTime. Example: [{&quot;beginTime&quot;:&quot;00:00:00&quot;,&quot;endTime&quot;:&quot;23:00:00&quot;}].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;beginTime&quot;:&quot;00:00:00&quot;,&quot;endTime&quot;:&quot;23:00:00&quot; }]</p>
     */
    @NameInMap("CallableTime")
    public String callableTime;

    /**
     * <p>Predictive outbound dialing contact file, specified as the key of an OSS object. Obtain this key by calling the GetCaseFileUploadUrl API.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test/namelist.csv</p>
     */
    @NameInMap("CaseFileKey")
    public String caseFileKey;

    /**
     * <p>List of predictive outbound dialing contacts. This parameter cannot be used together with CaseFileKey (import from file). You must choose either file import or list import.</p>
     */
    @NameInMap("CaseList")
    public java.util.List<CreateCampaignRequestCaseList> caseList;

    /**
     * <p>The contact flow ID associated with the predictive outbound dialing activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c1f2bc75-422e-43c7-9c9d9d95633a</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>The end time of the predictive outbound calling activity, formatted as a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634313600000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Whether to keep the activity in the executing state until it expires. The default value is false. If false, the activity automatically transitions to the completed state after all contacts have been called. If true, the activity remains in the executing state even after all contacts have been called, allowing you to append additional contacts and continue dialing until the activity expires or is manually stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExecutingUntilTimeout")
    public Boolean executingUntilTimeout;

    /**
     * <p>Flash SMS parameters</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;applicationId&quot;:&quot;08e6b63a-<strong><strong>-</strong></strong>-****-689a288cdbb5&quot;,&quot;templateId&quot;:&quot;325&quot;}</p>
     */
    @NameInMap("FlashSmsParameters")
    public String flashSmsParameters;

    /**
     * <p>Phone number collection ID</p>
     * 
     * <strong>example:</strong>
     * <p>0d368091-2c70-4d26-979a-6997ddc9c34f</p>
     */
    @NameInMap("InstGroupId")
    public String instGroupId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of attempts for the predictive outbound calling activity. This specifies how many times a number can be redialed if the initial call fails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxAttemptCount")
    public Long maxAttemptCount;

    /**
     * <p>The minimum redial interval for the predictive outbound calling activity, which specifies the minimum time interval between redial attempts after a failed call, in minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAttemptInterval")
    public Long minAttemptInterval;

    /**
     * <p>Name of the predictive outbound dialing activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-campaign</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>List of caller numbers</p>
     */
    @NameInMap("NumberList")
    public java.util.List<String> numberList;

    /**
     * <p>The skill group ID associated with the predictive outbound dialing activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>Indicates whether this is a simulation activity used for testing. Regular customers do not need to concern themselves with this.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Simulation")
    public Boolean simulation;

    /**
     * <p>Simulation parameters used for testing. Regular customers do not need to concern themselves with this.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("SimulationParameters")
    public String simulationParameters;

    /**
     * <p>The start time of the predictive outbound dialing activity, in Unix timestamp format with millisecond precision.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634140800000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Strategy parameters for the predictive outbound dialing activity. For PID strategy, an example format is: {&quot;abandonRate&quot;:&quot;5&quot;,&quot;historicalConnectedRate&quot;:&quot;35&quot;}. For PACING strategy, an example format is: {&quot;ratio&quot;:1}. abandonRate represents the desired abandonment rate, historicalConnectedRate represents the historical reference connection rate, and ratio represents the fixed dialing ratio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ratio&quot;:1}</p>
     */
    @NameInMap("StrategyParameters")
    public String strategyParameters;

    /**
     * <p>The strategy pattern for the predictive outbound calling activity.</p>
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

    public CreateCampaignRequest setFlashSmsParameters(String flashSmsParameters) {
        this.flashSmsParameters = flashSmsParameters;
        return this;
    }
    public String getFlashSmsParameters() {
        return this.flashSmsParameters;
    }

    public CreateCampaignRequest setInstGroupId(String instGroupId) {
        this.instGroupId = instGroupId;
        return this;
    }
    public String getInstGroupId() {
        return this.instGroupId;
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

    public CreateCampaignRequest setNumberList(java.util.List<String> numberList) {
        this.numberList = numberList;
        return this;
    }
    public java.util.List<String> getNumberList() {
        return this.numberList;
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
        /**
         * <p>Customer-defined custom variables in JSON object format. The object can contain up to 10 properties, each with a name and value defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;customer&quot;,&quot;客户标签&quot;:&quot;tag&quot;}</p>
         */
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <p>Contact phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1888888888</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Business ID, an identifier from the Customer\&quot;s Operational System, used in integration scenarios.</p>
         * 
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
