// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyInfo extends TeaModel {
    /**
     * <p>The list of mount information.</p>
     */
    @NameInMap("attachments")
    public java.util.List<Attachment> attachments;

    /**
     * <p>The policy class alias.</p>
     * 
     * <strong>example:</strong>
     * <p>Throttling</p>
     */
    @NameInMap("classAlias")
    public String classAlias;

    /**
     * <p>The class name supported by the policy. Different policies support different mount points. This parameter is used together with AttachResourceType. Valid values:</p>
     * <ul>
     * <li>RateLimit: throttling. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>ConcurrencyLimit: concurrency control. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>CircuitBreaker: circuit breaking. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>HttpRewrite: HTTP rewrite. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>HeaderModify: header modification. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>Cors: cross-origin resource sharing (CORS). Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>FlowCopy: traffic copy. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>Timeout: timeout. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>Retry: retry. Supported for HttpApi, Operation, and GatewayRoute.</li>
     * <li>IpAccessControl: IP access control. Supported for HttpApi, Operation, GatewayRoute, Domain, and Gateway.</li>
     * <li>DirectResponse: mock. Supported for Operation and GatewayRoute.</li>
     * <li>Redirect: redirect. Supported for GatewayRoute.</li>
     * <li>Fallback: fallback. Supported for Operation and GatewayRoute.</li>
     * <li>ServiceTls: service TLS authentication. Supported for GatewayService.</li>
     * <li>ServiceLb: service load balancing. Supported for GatewayService.</li>
     * <li>ServicePortTls: service port TLS authentication. Supported for GatewayServicePort.</li>
     * <li>Waf: WAF protection. Supported for GatewayRoute and Gateway.</li>
     * <li>JWTAuth: JWT global authentication. Supported for Gateway.</li>
     * <li>OIDCAuth: OIDC global authentication. Supported for Gateway.</li>
     * <li>ExternalZAuth: custom authentication. Supported for Gateway.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RateLimit</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;:false}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The inbound or outbound direction of the policy. Valid values:</p>
     * <ul>
     * <li>OutBound: outbound.</li>
     * <li>InBound: inbound.</li>
     * <li>Both: both directions.</li>
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
     * <p>The execution stage.</p>
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
     * 
     * <strong>example:</strong>
     * <p>Policy type</p>
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
