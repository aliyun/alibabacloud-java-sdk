// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    /**
     * <p>The environment alias.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试环境</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <p>The description of the environment. You can specify information such as the purpose and owner of the environment.</p>
     * 
     * <strong>example:</strong>
     * <p>这是xxx的xx项目测试环境</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The gateway ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The environment name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ahr5uil8raz0rq3b</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateEnvironmentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnvironmentRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateEnvironmentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnvironmentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
