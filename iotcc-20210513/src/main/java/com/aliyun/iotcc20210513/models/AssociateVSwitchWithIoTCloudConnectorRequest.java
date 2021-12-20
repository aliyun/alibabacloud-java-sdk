// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateVSwitchWithIoTCloudConnectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchList")
    public java.util.List<String> vSwitchList;

    @NameInMap("VpcId")
    public String vpcId;

    public static AssociateVSwitchWithIoTCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateVSwitchWithIoTCloudConnectorRequest self = new AssociateVSwitchWithIoTCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setVSwitchList(java.util.List<String> vSwitchList) {
        this.vSwitchList = vSwitchList;
        return this;
    }
    public java.util.List<String> getVSwitchList() {
        return this.vSwitchList;
    }

    public AssociateVSwitchWithIoTCloudConnectorRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
