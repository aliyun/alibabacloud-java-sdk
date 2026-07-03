// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAndAttachPolicyRequest extends TeaModel {
    /**
     * <p>The list of target resource IDs to attach.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>The type of the target resource to attach.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GatewayRoute</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The policy type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AiFallback</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configuration content (JSON string).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceConfigs&quot;:[...]}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>主路由失败时回退</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-test</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-fallback-policy</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateAndAttachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAttachPolicyRequest self = new CreateAndAttachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndAttachPolicyRequest setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    public CreateAndAttachPolicyRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public CreateAndAttachPolicyRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateAndAttachPolicyRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateAndAttachPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAndAttachPolicyRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreateAndAttachPolicyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateAndAttachPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
