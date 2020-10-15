// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    public String EPNInstanceId;

    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    public static ModifyEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEpnInstanceRequest self = new ModifyEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public ModifyEpnInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public ModifyEpnInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public ModifyEpnInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

}
