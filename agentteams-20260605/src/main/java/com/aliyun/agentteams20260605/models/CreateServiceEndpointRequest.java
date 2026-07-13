// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cert-001</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
     */
    @NameInMap("Component")
    public String component;

    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ins-001</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
