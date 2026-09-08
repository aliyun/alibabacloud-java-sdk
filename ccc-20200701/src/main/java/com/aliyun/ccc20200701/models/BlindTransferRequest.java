// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferRequest extends TeaModel {
    /**
     * <p>The queue priority when transferring to a skill group. Valid values are 0–9, where 0 is the highest priority and 9 is the lowest.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CallPriority")
    public Integer callPriority;

    /**
     * <p>Variables passed to the contact flow. This field is optional. The variables configured here can be retrieved and used in the IVR flow. The format is a JSON string representing a set of key-value pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;王先生&quot;,&quot;time&quot;:&quot;19点20分&quot;,&quot;address&quot;:&quot;某某中心&quot;}</p>
     */
    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>ACC-YUNBS-1.0.10-****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

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
     * <p>The call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The queuing overflow threshold when the transfer target is a skill group queue. The default value is 0, which means no overflow occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("QueuingOverflowThreshold")
    public Long queuingOverflowThreshold;

    /**
     * <p>The queuing timeout duration in seconds when the transfer target is a skill group queue.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("QueuingTimeoutSeconds")
    public Long queuingTimeoutSeconds;

    /**
     * <p>The call routing type. Valid values are Automatic or Manual. If this parameter is empty, the system defaults to Automatic routing, which is also the current default behavior of the system. When Manual routing is selected, you must invoke APIs such as ClaimCall to assign the call to a specific agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Manual</p>
     */
    @NameInMap("RoutingType")
    public String routingType;

    /**
     * <p>Skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ee914df4-82bf-4919-bcb3-9cb8aa437f35</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>The policy name for agent assignment when transferring to a skill group queue.</p>
     * 
     * <strong>example:</strong>
     * <p>MOST_IDLE，MOST_SKILLED，MOST_ACQUAINTED，CUSTOMIZED等</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The parameters for the agent assignment policy when transferring to a skill group queue.</p>
     * 
     * <strong>example:</strong>
     * <p>当分配策略为CUSTOMIZED时，本参数的内容为如下格式：
     *  {
     *   &quot;functionId&quot;: &quot;512fed64-e379-400f-a1a5-14d5730xxxxx&quot;,
     *   &quot;functionName&quot;: &quot;routing-strategy-test-2&quot;
     * }</p>
     */
    @NameInMap("StrategyParams")
    public String strategyParams;

    /**
     * <p>Ingest endpoint data, primarily used for extension purposes. Regular users do not need to concern themselves with this field.</p>
     * 
     * <strong>example:</strong>
     * <p>5295578135#WAEtqY5U&amp;Biz_Package_Rexian_Zhuanjieanquanyungaojie_2527</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Timeout duration for the direct transfer, in seconds. If the transferee does not answer within the specified time, the call is disconnected. This field is optional and defaults to 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The transfer recipient, which can be either an agent ID or a skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("Transferee")
    public String transferee;

    /**
     * <p>Destination type for the transfer. Valid values are AGENT, SKILL_GROUP, IVR, and EXTERNAL_NUMBER. If this parameter is not specified, the system determines the destination type based on the format of the target number. If the automatic detection is inaccurate, you must explicitly specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SKILL_GROUP</p>
     */
    @NameInMap("TransfereeType")
    public String transfereeType;

    /**
     * <p>The transfer initiator. When the scenario involves directly transferring to an external number, the number specified by this parameter is used as the caller. This parameter is invalid when transferring to an internal agent or skill group; in such cases, the initiator is specified by the UserId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>08314325****</p>
     */
    @NameInMap("Transferor")
    public String transferor;

    /**
     * <p>The agent ID that initiates a direct transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static BlindTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        BlindTransferRequest self = new BlindTransferRequest();
        return TeaModel.build(map, self);
    }

    public BlindTransferRequest setCallPriority(Integer callPriority) {
        this.callPriority = callPriority;
        return this;
    }
    public Integer getCallPriority() {
        return this.callPriority;
    }

    public BlindTransferRequest setContactFlowVariables(String contactFlowVariables) {
        this.contactFlowVariables = contactFlowVariables;
        return this;
    }
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

    public BlindTransferRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BlindTransferRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BlindTransferRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public BlindTransferRequest setQueuingOverflowThreshold(Long queuingOverflowThreshold) {
        this.queuingOverflowThreshold = queuingOverflowThreshold;
        return this;
    }
    public Long getQueuingOverflowThreshold() {
        return this.queuingOverflowThreshold;
    }

    public BlindTransferRequest setQueuingTimeoutSeconds(Long queuingTimeoutSeconds) {
        this.queuingTimeoutSeconds = queuingTimeoutSeconds;
        return this;
    }
    public Long getQueuingTimeoutSeconds() {
        return this.queuingTimeoutSeconds;
    }

    public BlindTransferRequest setRoutingType(String routingType) {
        this.routingType = routingType;
        return this;
    }
    public String getRoutingType() {
        return this.routingType;
    }

    public BlindTransferRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public BlindTransferRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public BlindTransferRequest setStrategyParams(String strategyParams) {
        this.strategyParams = strategyParams;
        return this;
    }
    public String getStrategyParams() {
        return this.strategyParams;
    }

    public BlindTransferRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public BlindTransferRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public BlindTransferRequest setTransferee(String transferee) {
        this.transferee = transferee;
        return this;
    }
    public String getTransferee() {
        return this.transferee;
    }

    public BlindTransferRequest setTransfereeType(String transfereeType) {
        this.transfereeType = transfereeType;
        return this;
    }
    public String getTransfereeType() {
        return this.transfereeType;
    }

    public BlindTransferRequest setTransferor(String transferor) {
        this.transferor = transferor;
        return this;
    }
    public String getTransferor() {
        return this.transferor;
    }

    public BlindTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
