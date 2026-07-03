// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The policy type. Valid values: RateLimit, ConcurrencyLimit, CircuitBreaker, HttpRewrite, HeaderModify, Cors, Authentication, FlowCopy, Timeout, Retry, IpAccessControl, DirectResponse, Redirect, Fallback, ServiceTls, ServiceLb, ServicePortTls, Waf, JWTAuth, OIDCAuth, ExternalZAuth, AiProxy, ModelRouter, AiStatistics, AiSecurityGuard, AiFallback, ModelMapper, AiTokenRateLimit, AiCache, DynamicRoute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Timeout</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;unitNum&quot;:1,&quot;timeUnit&quot;:&quot;s&quot;,&quot;enable&quot;:true}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The description of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>超时策略</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-policy</p>
     */
    @NameInMap("name")
    public String name;

    public static CreatePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyRequest self = new CreatePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreatePolicyRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreatePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
