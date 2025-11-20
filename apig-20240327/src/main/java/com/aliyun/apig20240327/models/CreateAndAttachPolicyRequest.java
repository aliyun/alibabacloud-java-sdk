// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAndAttachPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the resources to be associated with the policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>The supported resource type. Valid values:</p>
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
     * <p>The class name supported by the policy. Different policies support different resources. This parameter is used in combination with AttachResourceType.</p>
     * <ul>
     * <li>RateLimit: throttles traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>ConcurrencyLimit: controls concurrency. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>CircuitBreaker: breaks circuits and downgrades traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>HttpRewrite: rewrites HTTP traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>HeaderModify: modifies headers. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>Cors: supports CORS. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>FlowCopy: replicates traffic. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>Timeout: times out requests. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>Retry: retries requests. Supported: HttpApi, Operation, and GatewayRoute.</li>
     * <li>IpAccessControl: implements IP address-based access control. Supported: HttpApi, Operation, GatewayRoute, Domain, and Gateway.</li>
     * <li>DirectResponse: mocks responses. Supported: Operation and GatewayRoute.</li>
     * <li>Redirect: redirects traffic. Supported: GatewayRoute.</li>
     * <li>Fallback: implements fallback. Supported: Operation and GatewayRoute.</li>
     * <li>ServiceTls: implements TLS authentication. Supported: GatewayService.</li>
     * <li>ServiceLb: balances loads. Supported: GatewayService.</li>
     * <li>ServicePortTls: implements service port TLS authentication. Supported: GatewayServicePort.</li>
     * <li>Waf: implements WAF protection. Supported: GatewayRoute and Gateway.</li>
     * <li>JWTAuth: implements global JWT authentication. Supported: Gateway.</li>
     * <li>OIDCAuth: implements global OIDC authentication. Supported: Gateway.</li>
     * <li>ExternalZAuth: implements custom authentication. Supported: Gateway.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IpAccessControl</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configurations.</p>
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
     * <p>This is the policy description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qasrdc0</p>
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
