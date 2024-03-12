// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateExpressConnectRouterRequest extends TeaModel {
    @NameInMap("AlibabaSideAsn")
    public Long alibabaSideAsn;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressConnectRouterRequest self = new CreateExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateExpressConnectRouterRequest setAlibabaSideAsn(Long alibabaSideAsn) {
        this.alibabaSideAsn = alibabaSideAsn;
        return this;
    }
    public Long getAlibabaSideAsn() {
        return this.alibabaSideAsn;
    }

    public CreateExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateExpressConnectRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateExpressConnectRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExpressConnectRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
