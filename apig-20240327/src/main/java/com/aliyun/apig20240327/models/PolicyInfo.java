// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyInfo extends TeaModel {
    /**
     * <p>The mount information.</p>
     */
    @NameInMap("attachments")
    public java.util.List<Attachment> attachments;

    /**
     * <p>The policy class alias.</p>
     */
    @NameInMap("classAlias")
    public String classAlias;

    /**
     * <p>The class name supported by the policy. Different policies support different mount points. This parameter is used in combination with AttachResourceType.</p>
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
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The direction of traffic on which the policy takes effect. Valid values:</p>
     * <ul>
     * <li>OutBound</li>
     * <li>InBound</li>
     * <li>Both</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The execution priority.</p>
     * 
     * <strong>example:</strong>
     * <p>310</p>
     */
    @NameInMap("executePriority")
    public String executePriority;

    /**
     * <p>The execution phase.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PluginStatistic</li>
     * <li>PluginAuthorization</li>
     * <li>PluginPre</li>
     * <li>PluginAuthentication</li>
     * <li>PluginDefault</li>
     * <li>PluginPost</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PluginPost</p>
     */
    @NameInMap("executeStage")
    public String executeStage;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-policy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-cq7l5s5lhtgi6qasrdc0</p>
     */
    @NameInMap("policyId")
    public String policyId;

    /**
     * <p>The policy type.</p>
     */
    @NameInMap("type")
    public String type;

    public static PolicyInfo build(java.util.Map<String, ?> map) throws Exception {
        PolicyInfo self = new PolicyInfo();
        return TeaModel.build(map, self);
    }

    public PolicyInfo setAttachments(java.util.List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }

    public PolicyInfo setClassAlias(String classAlias) {
        this.classAlias = classAlias;
        return this;
    }
    public String getClassAlias() {
        return this.classAlias;
    }

    public PolicyInfo setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public PolicyInfo setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public PolicyInfo setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public PolicyInfo setExecutePriority(String executePriority) {
        this.executePriority = executePriority;
        return this;
    }
    public String getExecutePriority() {
        return this.executePriority;
    }

    public PolicyInfo setExecuteStage(String executeStage) {
        this.executeStage = executeStage;
        return this;
    }
    public String getExecuteStage() {
        return this.executeStage;
    }

    public PolicyInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PolicyInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public PolicyInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
