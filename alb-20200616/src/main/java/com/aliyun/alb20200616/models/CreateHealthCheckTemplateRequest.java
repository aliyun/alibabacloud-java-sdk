// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateRequest extends TeaModel {
    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can generate this token, but you must ensure that it is unique across requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <code>RequestId</code> of the request as the client token. Each API request has a unique <code>RequestId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run. The system checks the request for potential issues, including missing required parameters, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned. The resource is not created.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. If the request is valid, a 2xx HTTP status code is returned and the health check template is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The HTTP status codes that indicate a successful health check.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port used for health checks.</p>
     * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>Default value: <strong>0</strong>. This value indicates that the port of a backend server is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name used for the health check. Valid values:</p>
     * <ul>
     * <li><p><strong>$SERVER_IP</strong>: The private IP address of a backend server. If you set this parameter to <code>$SERVER_IP</code> or leave it empty, the load balancer uses the private IP address of the backend server as the domain name for the health check.</p>
     * </li>
     * <li><p><strong>domain</strong>: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>$SERVER_IP</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The version of the HTTP protocol that is used for the health check.</p>
     * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
     * <p>Default value: <strong>HTTP1.1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP 1.0</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval at which health checks are performed.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <p>Default value: <strong>2</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The method used for the health check. Valid values:</p>
     * <ul>
     * <li><p><strong>HEAD</strong> (default): For HTTP and HTTPS listeners, the default health check method is HEAD.</p>
     * </li>
     * <li><p><strong>POST</strong>: For gRPC listeners, the default health check method is POST.</p>
     * </li>
     * <li><p><strong>GET</strong>: If the response body exceeds 8 KB, it is truncated. This does not affect the health check result.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL that is used for health checks.</p>
     * <p>The URL must be 1 to 80 characters in length. It must start with a forward slash (/) and can contain letters, digits, and the following special characters: <code>- / . % ? # &amp; _;~!()*[]@$^:\\&quot;,+</code>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The protocol used for the health check. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default): simulates browser access by sending HEAD or GET requests to check whether the server application is healthy.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: simulates browser access by sending HEAD or GET requests to check whether the server application is healthy. HTTPS provides encrypted data transmission and is more secure than HTTP.</p>
     * </li>
     * <li><p><strong>TCP</strong>: checks whether the server port is responsive by sending SYN packets.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: checks whether the server application is healthy by sending POST or GET requests.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The name of the health check template.</p>
     * <p>The name must be 2 to 128 characters in length, must start with a letter, a digit, or a Chinese character, and can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheckTemplate1</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period for a health check response. If a backend server does not respond within this period, the health check fails.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
     * <p>Default value: <strong>5</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of consecutive successful health checks required to change the health status of a backend server from <strong>unhealthy</strong> to <strong>healthy</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateHealthCheckTemplateRequestTag> tag;

    /**
     * <p>The number of consecutive failed health checks required to change the health status of a backend server from <strong>healthy</strong> to <strong>unhealthy</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static CreateHealthCheckTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHealthCheckTemplateRequest self = new CreateHealthCheckTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateHealthCheckTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHealthCheckTemplateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public CreateHealthCheckTemplateRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public CreateHealthCheckTemplateRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public CreateHealthCheckTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHealthCheckTemplateRequest setTag(java.util.List<CreateHealthCheckTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateHealthCheckTemplateRequestTag> getTag() {
        return this.tag;
    }

    public CreateHealthCheckTemplateRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static class CreateHealthCheckTemplateRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHealthCheckTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateHealthCheckTemplateRequestTag self = new CreateHealthCheckTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateHealthCheckTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateHealthCheckTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
