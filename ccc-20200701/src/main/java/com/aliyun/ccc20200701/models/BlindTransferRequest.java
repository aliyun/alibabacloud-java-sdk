// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferRequest extends TeaModel {
    @NameInMap("CallPriority")
    public Integer callPriority;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("StrategyParams")
    public String strategyParams;

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
