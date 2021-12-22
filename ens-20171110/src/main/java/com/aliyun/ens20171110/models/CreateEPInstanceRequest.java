// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEPInstanceRequest extends TeaModel {
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

    public static CreateEPInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEPInstanceRequest self = new CreateEPInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEPInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public CreateEPInstanceRequest setEPNInstanceType(String EPNInstanceType) {
        this.EPNInstanceType = EPNInstanceType;
        return this;
    }
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    public CreateEPInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEPInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateEPInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

}
