// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChainRequest extends TeaModel {
    @NameInMap("ChainConfig")
    public String chainConfig;

    @NameInMap("ChainId")
    public String chainId;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateChainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainRequest self = new UpdateChainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainRequest setChainConfig(String chainConfig) {
        this.chainConfig = chainConfig;
        return this;
    }
    public String getChainConfig() {
        return this.chainConfig;
    }

    public UpdateChainRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateChainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateChainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateChainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
