// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("NetworkChargeType")
    public String networkChargeType;

    @NameInMap("AllocatePublicIp")
    public Boolean allocatePublicIp;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyInstanceNetworkSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecRequest self = new ModifyInstanceNetworkSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNetworkSpecRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyInstanceNetworkSpecRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyInstanceNetworkSpecRequest setNetworkChargeType(String networkChargeType) {
        this.networkChargeType = networkChargeType;
        return this;
    }
    public String getNetworkChargeType() {
        return this.networkChargeType;
    }

    public ModifyInstanceNetworkSpecRequest setAllocatePublicIp(Boolean allocatePublicIp) {
        this.allocatePublicIp = allocatePublicIp;
        return this;
    }
    public Boolean getAllocatePublicIp() {
        return this.allocatePublicIp;
    }

    public ModifyInstanceNetworkSpecRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyInstanceNetworkSpecRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyInstanceNetworkSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceNetworkSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
