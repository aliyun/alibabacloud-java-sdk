// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAndAttachPolicyRequest extends TeaModel {
    /**
     * <p>The association IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>The supported associated resource type. Valid values:</p>
     * <ul>
     * <li>HttpApi: an HTTP API</li>
     * <li>Operation: an operation in an HTTP API</li>
     * <li>GatewayRoute: a route</li>
     * <li>GatewayService: a service</li>
     * <li>GatewayServicePort: a service port</li>
     * <li>Domain: a domain name</li>
     * <li>Gateway: an instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The policy configurations. The value is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq2avtllhtgja4dk5djg</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq2avtllhtgja4dk5djg</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateAndAttachPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndAttachPolicyRequest self = new UpdateAndAttachPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndAttachPolicyRequest setAttachResourceIds(java.util.List<String> attachResourceIds) {
        this.attachResourceIds = attachResourceIds;
        return this;
    }
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    public UpdateAndAttachPolicyRequest setAttachResourceType(String attachResourceType) {
        this.attachResourceType = attachResourceType;
        return this;
    }
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    public UpdateAndAttachPolicyRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateAndAttachPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAndAttachPolicyRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateAndAttachPolicyRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public UpdateAndAttachPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
