// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateChainRequest extends TeaModel {
    /**
     * <p>The JSON-serialized entity object that describes the delivery chain.</p>
     * 
     * <strong>example:</strong>
     * <p>chainconfig</p>
     */
    @NameInMap("ChainConfig")
    public String chainConfig;

    /**
     * <p>The description of the delivery chain.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4cdrlqmhn4gm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the delivery chain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The repository name.</p>
     * 
     * <strong>example:</strong>
     * <p>repo1</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    /**
     * <p>The collection of repositories excluded from the delivery chain execution.</p>
     */
    @NameInMap("ScopeExclude")
    public java.util.List<String> scopeExclude;

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

    public CreateChainRequest setScopeExclude(java.util.List<String> scopeExclude) {
        this.scopeExclude = scopeExclude;
        return this;
    }
    public java.util.List<String> getScopeExclude() {
        return this.scopeExclude;
    }

}
