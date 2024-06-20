// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferRequest extends TeaModel {
    @NameInMap("CallPriority")
    public Integer callPriority;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <strong>example:</strong>
     * <p>ACC-YUNBS-1.0.10-****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

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
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("QueuingOverflowThreshold")
    public Long queuingOverflowThreshold;

    @NameInMap("QueuingTimeoutSeconds")
    public Long queuingTimeoutSeconds;

    @NameInMap("RoutingType")
    public String routingType;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("StrategyParams")
    public String strategyParams;

    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("Transferee")
    public String transferee;

    @NameInMap("TransfereeType")
    public String transfereeType;

    /**
     * <strong>example:</strong>
     * <p>08314325****</p>
     */
    @NameInMap("Transferor")
    public String transferor;

    /**
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
