// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyRequest extends TeaModel {
    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li>RateLimit: Rate limiting. Limits the request rate.</li>
     * <li>ConcurrencyLimit: Concurrency limiting. Limits the number of concurrent requests.</li>
     * <li>CircuitBreaker: Circuit breaker. Automatically triggers circuit breaking when backend exceptions occur.</li>
     * <li>HttpRewrite: HTTP rewrite. Rewrites the request URL or path.</li>
     * <li>HeaderModify: Header modification. Adds, removes, or modifies HTTP request headers.</li>
     * <li>Cors: Cross-Origin Resource Sharing (CORS). Controls cross-origin requests.</li>
     * <li>Authentication: General authentication. A general request authentication policy.</li>
     * <li>FlowCopy: Traffic mirroring. Copies requests to an additional backend.</li>
     * <li>Timeout: Timeout. Sets the request timeout period.</li>
     * <li>Retry: Retry. Automatically retries failed requests.</li>
     * <li>IpAccessControl: IP access control. Filters requests based on IP address whitelists and blacklists.</li>
     * <li>DirectResponse: Direct response. Returns a fixed response directly.</li>
     * <li>Redirect: Redirect. Redirects requests to another address.</li>
     * <li>Fallback: Fallback. Returns a fallback response when the backend is unavailable.</li>
     * <li>ServiceTls: Service TLS. Configures TLS for backend services.</li>
     * <li>ServiceLb: Service load balancing. Configures load balancing for backend services.</li>
     * <li>ServicePortTls: Service port TLS. Configures TLS for backend service ports.</li>
     * <li>Waf: Web Application Firewall (WAF). Provides request security protection.</li>
     * <li>JWTAuth: JWT authentication. Authenticates requests based on JSON Web Tokens (JWT).</li>
     * <li>OIDCAuth: OIDC authentication. Authenticates requests based on the OpenID Connect (OIDC) protocol.</li>
     * <li>ExternalZAuth: External authentication. Integrates with an external authentication service.</li>
     * <li>AiProxy: AI proxy.</li>
     * <li>ModelRouter: Model router.</li>
     * <li>AiStatistics: AI statistics.</li>
     * <li>AiSecurityGuard: AI security guard. Detects the security of AI request and response content.</li>
     * <li>AiFallback: AI fallback. Falls back to an alternative model when the AI service is unavailable.</li>
     * <li>ModelMapper: Model mapper.</li>
     * <li>AiTokenRateLimit: AI token rate limiting. Limits the rate based on token consumption.</li>
     * <li>AiCache: AI cache. Caches AI response results.</li>
     * <li>DynamicRoute: Dynamic route.</li>
     * </ul>
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
     * <p>Timeout policy</p>
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
