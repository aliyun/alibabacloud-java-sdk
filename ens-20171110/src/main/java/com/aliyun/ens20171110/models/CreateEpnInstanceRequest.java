// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceRequest extends TeaModel {
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    @NameInMap("EPNInstanceType")
    public String EPNInstanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("NetworkingModel")
    public String networkingModel;

    public static CreateEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceRequest self = new CreateEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public CreateEpnInstanceRequest setEPNInstanceType(String EPNInstanceType) {
        this.EPNInstanceType = EPNInstanceType;
        return this;
    }
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    public CreateEpnInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEpnInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateEpnInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

}
