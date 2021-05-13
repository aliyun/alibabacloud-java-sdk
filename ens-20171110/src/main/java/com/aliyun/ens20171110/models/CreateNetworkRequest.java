// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("NetworkName")
    public String networkName;

    @NameInMap("Description")
    public String description;

    public static CreateNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRequest self = new CreateNetworkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateNetworkRequest setNetworkName(String networkName) {
        this.networkName = networkName;
        return this;
    }
    public String getNetworkName() {
        return this.networkName;
    }

    public CreateNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
