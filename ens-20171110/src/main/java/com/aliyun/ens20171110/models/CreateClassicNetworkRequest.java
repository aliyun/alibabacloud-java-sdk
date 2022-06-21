// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateClassicNetworkRequest extends TeaModel {
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("NetworkName")
    public String networkName;

    public static CreateClassicNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClassicNetworkRequest self = new CreateClassicNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClassicNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateClassicNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClassicNetworkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateClassicNetworkRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

}
