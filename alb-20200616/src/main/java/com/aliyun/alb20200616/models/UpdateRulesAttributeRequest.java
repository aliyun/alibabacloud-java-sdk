// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateRulesAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The ClientToken parameter can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544***</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run only. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run only and does not batch update the forwarding rule attributes. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of forwarding rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateRulesAttributeRequestRules> rules;

    public static UpdateRulesAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRulesAttributeRequest self = new UpdateRulesAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRulesAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRulesAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateRulesAttributeRequest setRules(java.util.List<UpdateRulesAttributeRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateRulesAttributeRequestRules> getRules() {
        return this.rules;
    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsCorsConfig extends TeaModel {
        /**
         * <p>Specifies whether to allow credentials in cross-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The list of allowed headers for cross-origin requests.</p>
         */
        @NameInMap("AllowHeaders")
        public java.util.List<String> allowHeaders;

        /**
         * <p>The allowed HTTP methods for cross-origin requests.</p>
         */
        @NameInMap("AllowMethods")
        public java.util.List<String> allowMethods;

        /**
         * <p>The allowed origins.</p>
         */
        @NameInMap("AllowOrigin")
        public java.util.List<String> allowOrigin;

        /**
         * <p>The list of exposed headers.</p>
         */
        @NameInMap("ExposeHeaders")
        public java.util.List<String> exposeHeaders;

        /**
         * <p>The maximum cache time for preflight requests in the browser.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxAge")
        public Long maxAge;

        public static UpdateRulesAttributeRequestRulesRuleActionsCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsCorsConfig self = new UpdateRulesAttributeRequestRulesRuleActionsCorsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public java.util.List<String> getAllowHeaders() {
            return this.allowHeaders;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public java.util.List<String> getAllowMethods() {
            return this.allowMethods;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setAllowOrigin(java.util.List<String> allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public java.util.List<String> getAllowOrigin() {
            return this.allowOrigin;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setExposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public java.util.List<String> getExposeHeaders() {
            return this.exposeHeaders;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig setMaxAge(Long maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Long getMaxAge() {
            return this.maxAge;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig extends TeaModel {
        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>dssacav</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        public static UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig self = new UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession extends TeaModel {
        /**
         * <p>Specifies whether session persistence is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The timeout period for session persistence across server groups. Unit: seconds. Valid values: 1 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-3kbj35ay7cvi******</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The session persistence across server groups.</p>
         */
        @NameInMap("ServerGroupStickySession")
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession;

        /**
         * <p>The list of destination server groups to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig self = new UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig setServerGroupStickySession(UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession serverGroupStickySession) {
            this.serverGroupStickySession = serverGroupStickySession;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig extends TeaModel {
        /**
         * <p>Specifies whether to overwrite the existing value in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("CoverEnabled")
        public Boolean coverEnabled;

        /**
         * <p>The HTTP header.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the HTTP header.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The type of the value.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDefined</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setCoverEnabled(Boolean coverEnabled) {
            this.coverEnabled = coverEnabled;
            return this;
        }
        public Boolean getCoverEnabled() {
            return this.coverEnabled;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig extends TeaModel {
        /**
         * <p>The host to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p>test.alb.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The redirect method.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The path to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The query string to which requests are redirected.</p>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig extends TeaModel {
        /**
         * <p>The HTTP header key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        public static UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig extends TeaModel {
        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>${host}</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The query string.</p>
         * 
         * <strong>example:</strong>
         * <p>${query}</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig self = new UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig extends TeaModel {
        /**
         * <p>The number of requests per second per IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PerIpQps")
        public Integer perIpQps;

        /**
         * <p>The number of requests per second.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("QPS")
        public Integer QPS;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig setPerIpQps(Integer perIpQps) {
            this.perIpQps = perIpQps;
            return this;
        }
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig setQPS(Integer QPS) {
            this.QPS = QPS;
            return this;
        }
        public Integer getQPS() {
            return this.QPS;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-vlnjo1rhw0vc******</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig extends TeaModel {
        /**
         * <p>The server groups to which traffic is mirrored.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig setServerGroupTuples(java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig extends TeaModel {
        /**
         * <p>The configuration for mirroring traffic to a server group.</p>
         */
        @NameInMap("MirrorGroupConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig;

        /**
         * <p>The type of the mirror target.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroupMirror</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig self = new UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig setMirrorGroupConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig mirrorGroupConfig) {
            this.mirrorGroupConfig = mirrorGroupConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfigMirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleActions extends TeaModel {
        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig corsConfig;

        /**
         * <p>The configuration of the fixed response action.</p>
         */
        @NameInMap("FixedResponseConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig;

        /**
         * <p>The configuration of the forward group action.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The configuration of the insert header action.</p>
         */
        @NameInMap("InsertHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig;

        /**
         * <p>The priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The configuration of the redirect action.</p>
         */
        @NameInMap("RedirectConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig redirectConfig;

        /**
         * <p>Removes HTTP headers.</p>
         */
        @NameInMap("RemoveHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig;

        /**
         * <p>The configuration of the rewrite action.</p>
         */
        @NameInMap("RewriteConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig rewriteConfig;

        /**
         * <p>The traffic throttling configuration.</p>
         */
        @NameInMap("TrafficLimitConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig;

        /**
         * <p>The traffic mirroring configuration.</p>
         */
        @NameInMap("TrafficMirrorConfig")
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig;

        /**
         * <p>The type of the forwarding rule action.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRulesAttributeRequestRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleActions self = new UpdateRulesAttributeRequestRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleActions setCorsConfig(UpdateRulesAttributeRequestRulesRuleActionsCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setFixedResponseConfig(UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsFixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setForwardGroupConfig(UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setInsertHeaderConfig(UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig insertHeaderConfig) {
            this.insertHeaderConfig = insertHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsInsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRedirectConfig(UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRemoveHeaderConfig(UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig removeHeaderConfig) {
            this.removeHeaderConfig = removeHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRemoveHeaderConfig getRemoveHeaderConfig() {
            return this.removeHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setRewriteConfig(UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig rewriteConfig) {
            this.rewriteConfig = rewriteConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsRewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setTrafficLimitConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig trafficLimitConfig) {
            this.trafficLimitConfig = trafficLimitConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setTrafficMirrorConfig(UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig trafficMirrorConfig) {
            this.trafficMirrorConfig = trafficMirrorConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleActionsTrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues extends TeaModel {
        /**
         * <p>The cookie condition key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The cookie condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues self = new UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig extends TeaModel {
        /**
         * <p>The list of cookie key-value pairs.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig setValues(java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsCookieConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig extends TeaModel {
        /**
         * <p>The HTTP header key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of HTTP header values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The list of hostnames.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsHostConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig extends TeaModel {
        /**
         * <p>The list of HTTP request methods.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The list of path conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsPathConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues extends TeaModel {
        /**
         * <p>The query string condition key.</p>
         * 
         * <strong>example:</strong>
         * <p>account</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The query string condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues self = new UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig extends TeaModel {
        /**
         * <p>The list of query string condition key-value pairs.</p>
         */
        @NameInMap("Values")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig setValues(java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfigValues> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig extends TeaModel {
        /**
         * <p>The response HTTP header key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The response HTTP header values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig extends TeaModel {
        /**
         * <p>The response status code condition.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig extends TeaModel {
        /**
         * <p>Adds one or more IP addresses or CIDR blocks.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig self = new UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateRulesAttributeRequestRulesRuleConditions extends TeaModel {
        /**
         * <p>The cookie condition configuration.</p>
         */
        @NameInMap("CookieConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig cookieConfig;

        /**
         * <p>The HTTP header condition configuration.</p>
         */
        @NameInMap("HeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig headerConfig;

        /**
         * <p>The hostname condition configuration.</p>
         */
        @NameInMap("HostConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The HTTP request method condition configuration.</p>
         */
        @NameInMap("MethodConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig methodConfig;

        /**
         * <p>The query character string condition configuration.</p>
         */
        @NameInMap("PathConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The query character string condition configuration.</p>
         */
        @NameInMap("QueryStringConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig queryStringConfig;

        /**
         * <p>The response HTTP header.</p>
         */
        @NameInMap("ResponseHeaderConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig;

        /**
         * <p>The response status code condition.</p>
         */
        @NameInMap("ResponseStatusCodeConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig;

        /**
         * <p>The configuration for matching service traffic based on source IP addresses.</p>
         */
        @NameInMap("SourceIpConfig")
        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig sourceIpConfig;

        /**
         * <p>The condition type.</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRulesAttributeRequestRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRulesRuleConditions self = new UpdateRulesAttributeRequestRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setCookieConfig(UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig cookieConfig) {
            this.cookieConfig = cookieConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsCookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setHeaderConfig(UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig headerConfig) {
            this.headerConfig = headerConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsHeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setHostConfig(UpdateRulesAttributeRequestRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setMethodConfig(UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig methodConfig) {
            this.methodConfig = methodConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsMethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setPathConfig(UpdateRulesAttributeRequestRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setQueryStringConfig(UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig queryStringConfig) {
            this.queryStringConfig = queryStringConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsQueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setResponseHeaderConfig(UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig responseHeaderConfig) {
            this.responseHeaderConfig = responseHeaderConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setResponseStatusCodeConfig(UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig responseStatusCodeConfig) {
            this.responseStatusCodeConfig = responseStatusCodeConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsResponseStatusCodeConfig getResponseStatusCodeConfig() {
            return this.responseStatusCodeConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setSourceIpConfig(UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig sourceIpConfig) {
            this.sourceIpConfig = sourceIpConfig;
            return this;
        }
        public UpdateRulesAttributeRequestRulesRuleConditionsSourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        public UpdateRulesAttributeRequestRulesRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRulesAttributeRequestRules extends TeaModel {
        /**
         * <p>The priority of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The list of actions for the forwarding rule.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActions> ruleActions;

        /**
         * <p>The list of forwarding rule conditions.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> ruleConditions;

        /**
         * <p>The ID of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-n4hfecmmtmfl******</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_111</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static UpdateRulesAttributeRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateRulesAttributeRequestRules self = new UpdateRulesAttributeRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateRulesAttributeRequestRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateRulesAttributeRequestRules setRuleActions(java.util.List<UpdateRulesAttributeRequestRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public UpdateRulesAttributeRequestRules setRuleConditions(java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<UpdateRulesAttributeRequestRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public UpdateRulesAttributeRequestRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public UpdateRulesAttributeRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
