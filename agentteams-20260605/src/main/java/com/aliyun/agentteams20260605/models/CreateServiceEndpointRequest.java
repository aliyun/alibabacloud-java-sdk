// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-001</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The idempotency token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The component type. Valid values: <code>ELEMENT</code>, <code>TUNNEL</code>, <code>MATRIX</code>, and <code>WORKER</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("Component")
    public String component;

    /**
     * <p>The custom domain name. The server trims and converts the value to lowercase.</p>
     * 
     * <strong>example:</strong>
     * <p>matrix.example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ins-001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-service</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    public static CreateServiceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEndpointRequest self = new CreateServiceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceEndpointRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public CreateServiceEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceEndpointRequest setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public CreateServiceEndpointRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateServiceEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateServiceEndpointRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

}
