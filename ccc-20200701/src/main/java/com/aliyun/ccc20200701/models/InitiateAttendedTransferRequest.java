// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InitiateAttendedTransferRequest extends TeaModel {
    @NameInMap("CallPriority")
    public Integer callPriority;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

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

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("Transferee")
    public String transferee;

    @NameInMap("TransfereeType")
    public String transfereeType;

    @NameInMap("Transferor")
    public String transferor;

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
