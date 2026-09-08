// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InitiateAttendedTransferRequest extends TeaModel {
    /**
     * <p>The queuing priority when transferring to a skill group queue. Valid values range from 0 to 9, where 0 is the highest priority and 9 is the lowest.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CallPriority")
    public Integer callPriority;

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
     * <p>The queuing timeout period in seconds when the transfer target is a skill group queue.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("QueuingTimeoutSeconds")
    public Long queuingTimeoutSeconds;

    /**
     * <p>The call assignment type. Valid values are Automatic or Manual. If this parameter is empty, the default value is Automatic, which is also the current system\&quot;s default behavior. When Manual is selected, you must invoke APIs such as ClaimCall to assign the call to a specific agent.</p>
     * 
     * <strong>example:</strong>
     * <p>Automatic</p>
     */
    @NameInMap("RoutingType")
    public String routingType;

    /**
     * <p>The policy name for agent assignment when transferring to a skill group queue.</p>
     * 
     * <strong>example:</strong>
     * <p>MOST_IDLE，MOST_SKILLED，MOST_ACQUAINTED，CUSTOMIZED等</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The policy parameters for agent assignment when transferring to a skill group queue.</p>
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
     * <p>Ingest endpoint data, primarily used for extension requirements. Regular users do not need to concern themselves with this.</p>
     * 
     * <strong>example:</strong>
     * <p>a=b</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>Timeout duration for the consultation transfer, in seconds. If the transferee does not answer within the specified time, the call is disconnected. This field is optional. Default value is 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>The transferee, which can be an agent ID or a skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent2@ccc-test</p>
     */
    @NameInMap("Transferee")
    public String transferee;

    /**
     * <p>The destination type for the transfer. Valid values are AGENT, SKILL_GROUP, and EXTERNAL. If this parameter is not provided, the system determines the destination type based on the format of the target number. If inaccurate detection occurs, explicitly specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SKILL_GROUP</p>
     */
    @NameInMap("TransfereeType")
    public String transfereeType;

    /**
     * <p>The party initiating the transfer. When transferring to an external number, this parameter specifies the caller number. This parameter is invalid when transferring to an internal agent or skill group; in such cases, the initiator is determined by the UserId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Transferor")
    public String transferor;

    /**
     * <p>The agent ID initiating the consultation transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static InitiateAttendedTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiateAttendedTransferRequest self = new InitiateAttendedTransferRequest();
        return TeaModel.build(map, self);
    }

    public InitiateAttendedTransferRequest setCallPriority(Integer callPriority) {
        this.callPriority = callPriority;
        return this;
    }
    public Integer getCallPriority() {
        return this.callPriority;
    }

    public InitiateAttendedTransferRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public InitiateAttendedTransferRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InitiateAttendedTransferRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public InitiateAttendedTransferRequest setQueuingOverflowThreshold(Long queuingOverflowThreshold) {
        this.queuingOverflowThreshold = queuingOverflowThreshold;
        return this;
    }
    public Long getQueuingOverflowThreshold() {
        return this.queuingOverflowThreshold;
    }

    public InitiateAttendedTransferRequest setQueuingTimeoutSeconds(Long queuingTimeoutSeconds) {
        this.queuingTimeoutSeconds = queuingTimeoutSeconds;
        return this;
    }
    public Long getQueuingTimeoutSeconds() {
        return this.queuingTimeoutSeconds;
    }

    public InitiateAttendedTransferRequest setRoutingType(String routingType) {
        this.routingType = routingType;
        return this;
    }
    public String getRoutingType() {
        return this.routingType;
    }

    public InitiateAttendedTransferRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public InitiateAttendedTransferRequest setStrategyParams(String strategyParams) {
        this.strategyParams = strategyParams;
        return this;
    }
    public String getStrategyParams() {
        return this.strategyParams;
    }

    public InitiateAttendedTransferRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public InitiateAttendedTransferRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public InitiateAttendedTransferRequest setTransferee(String transferee) {
        this.transferee = transferee;
        return this;
    }
    public String getTransferee() {
        return this.transferee;
    }

    public InitiateAttendedTransferRequest setTransfereeType(String transfereeType) {
        this.transfereeType = transfereeType;
        return this;
    }
    public String getTransfereeType() {
        return this.transfereeType;
    }

    public InitiateAttendedTransferRequest setTransferor(String transferor) {
        this.transferor = transferor;
        return this;
    }
    public String getTransferor() {
        return this.transferor;
    }

    public InitiateAttendedTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
