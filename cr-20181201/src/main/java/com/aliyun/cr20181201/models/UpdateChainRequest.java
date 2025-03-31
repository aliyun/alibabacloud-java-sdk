// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateChainRequest extends TeaModel {
    /**
     * <p>The configuration of the delivery chain in the JSON format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chainconfig</p>
     */
    @NameInMap("ChainConfig")
    public String chainConfig;

    /**
     * <p>The ID of the delivery chain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chi-02ymhtwl3cq8****</p>
     */
    @NameInMap("ChainId")
    public String chainId;

    /**
     * <p>The description of the delivery chain.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
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
     * <p>Repositories in which the delivery chain does not take effect.</p>
     */
    @NameInMap("ScopeExclude")
    public java.util.List<String> scopeExclude;

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

    public UpdateChainRequest setScopeExclude(java.util.List<String> scopeExclude) {
        this.scopeExclude = scopeExclude;
        return this;
    }
    public java.util.List<String> getScopeExclude() {
        return this.scopeExclude;
    }

}
