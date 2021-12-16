// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChainRequest extends TeaModel {
    @NameInMap("ChainConfig")
    public String chainConfig;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    public static CreateChainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainRequest self = new CreateChainRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainRequest setChainConfig(String chainConfig) {
        this.chainConfig = chainConfig;
        return this;
    }
    public String getChainConfig() {
        return this.chainConfig;
    }

    public CreateChainRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateChainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChainRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateChainRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

}
