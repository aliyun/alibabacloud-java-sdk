// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkId")
    public String networkId;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateVSwitchRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateVSwitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVSwitchRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public CreateVSwitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVSwitchRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
