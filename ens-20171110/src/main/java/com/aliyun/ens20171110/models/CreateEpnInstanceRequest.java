// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceType")
    public String EPNInstanceType;

    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    public static CreateEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceRequest self = new CreateEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceRequest setEPNInstanceType(String EPNInstanceType) {
        this.EPNInstanceType = EPNInstanceType;
        return this;
    }
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    public CreateEpnInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public CreateEpnInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEpnInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public CreateEpnInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

}
