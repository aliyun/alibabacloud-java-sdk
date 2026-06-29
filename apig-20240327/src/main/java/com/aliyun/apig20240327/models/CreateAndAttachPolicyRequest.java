// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAndAttachPolicyRequest extends TeaModel {
    /**
     * <p>List of attachment point IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("attachResourceIds")
    public java.util.List<String> attachResourceIds;

    /**
     * <p>Types of attachment points supported by the policy.</p>
     * <ul>
     * <li>HttpApi: HttpApi.</li>
     * <li>Operation: Operation of HttpApi.</li>
     * <li>GatewayRoute: Gateway route.</li>
     * <li>GatewayService: Gateway service.</li>
     * <li>GatewayServicePort: Gateway service port.</li>
     * <li>Domain: Gateway domain.</li>
     * <li>Gateway: Gateway.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HttpApi</p>
     */
    @NameInMap("attachResourceType")
    public String attachResourceType;

    /**
     * <p>The class name types supported by the policy. Different policies support different attachment points, to be used in conjunction with <code>attachResourceType</code>.</p>
     * <ul>
     * <li><p>RateLimit: Traffic control, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>ConcurrencyLimit: Concurrency control, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>CircuitBreaker: Circuit breaking and degradation, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>HttpRewrite: HTTP rewrite, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>HeaderModify: Header modification, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>Cors: Cross-origin, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>FlowCopy: Traffic replication, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>Timeout: Timeout, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>Retry: Retry, supports HttpApi, Operation, GatewayRoute.</p>
     * </li>
     * <li><p>IpAccessControl: IP access control, supports HttpApi, Operation, GatewayRoute, Domain, Gateway.</p>
     * </li>
     * <li><p>DirectResponse: Mock, supports Operation, GatewayRoute.</p>
     * </li>
     * <li><p>Redirect: Redirection, supports GatewayRoute.</p>
     * </li>
     * <li><p>Fallback: Fallback, supports Operation, GatewayRoute.</p>
     * </li>
     * <li><p>ServiceTls: Service TLS authentication, supports GatewayService.</p>
     * </li>
     * <li><p>ServiceLb: Service load balancing, supports GatewayService.</p>
     * </li>
     * <li><p>ServicePortTls: Service port TLS authentication, supports GatewayServicePort.</p>
     * </li>
     * <li><p>Waf: WAF protection, supports GatewayRoute, Gateway.</p>
     * </li>
     * <li><p>JWTAuth: JWT global authentication, supports Gateway.</p>
     * </li>
     * <li><p>OIDCAuth: OIDC global authentication, supports Gateway.</p>
     * </li>
     * <li><p>ExternalZAuth: Custom authorization, supports Gateway.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IpAccessControl</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>Configuration information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>Policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>这是策略描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Policy name.</p>
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
