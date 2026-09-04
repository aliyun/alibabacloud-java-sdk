// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request.</p>
     * <p>You must generate a unique value on your client for each request. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <code>RequestId</code> of the request as the <code>ClientToken</code>. The <code>RequestId</code> of each request is unique.</p>
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
     * <li><p><strong>true</strong>: Performs a dry run to check the request. The system checks for required parameters, request syntax, and business constraints without performing the operation. If the request is invalid, an error is returned. If the request is valid, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. If the request is valid, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of status codes that indicate a healthy state.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port used for health checks. Valid values: <strong>0</strong> to <strong>65535</strong>.
     * The default value is <strong>0</strong>, which means the health check uses the backend server\&quot;s port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name used for health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>$SERVER_IP</strong> (default): The private IP of a backend server. If you specify this value or leave the parameter empty, the load balancing service uses the private IP of the backend server for health checks.</p>
     * </li>
     * <li><p><strong>domain</strong>: A domain name that is 1 to 80 characters long and can contain letters, digits, periods (.), and hyphens (-).</p>
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
     * <p>The HTTP version used for health checks.</p>
     * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
     * <p>Default value: <strong>HTTP1.1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1.0</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval between health checks, in seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The method used for health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>HEAD</strong> (default): The default method for health checks on HTTP and HTTPS listeners.</p>
     * </li>
     * <li><p><strong>GET</strong>: If the response body is larger than 8 KB, it is truncated. This does not affect the health check result.</p>
     * </li>
     * <li><p><strong>POST</strong>: The default method for health checks on gRPC listeners.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL used for health checks.</p>
     * <p>The URL must be 1 to 80 characters long. It can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), ampersands (&amp;), and the following extended characters: <code>_;~!()*[]@$^:\\&quot;,+</code>.</p>
     * <p>The URL must start with a forward slash (/).</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The protocol used for health checks. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong> (default): Checks the health of a backend server by sending an HTTP HEAD or GET request.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: Checks the health of a backend server by sending an HTTPS HEAD or GET request. HTTPS is more secure than HTTP because it encrypts data.</p>
     * </li>
     * <li><p><strong>TCP</strong>: Checks if a backend server port is reachable by sending a TCP SYN packet.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: Checks the health of a backend server by sending a POST or GET request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The health check template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hct-bp1qjwo61******</p>
     */
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    /**
     * <p>The name of the health check template.</p>
     * <p>The name must be 2 to 128 characters long, start with a letter, a Chinese character, or a digit, and can contain letters, Chinese characters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheckTemplate1</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period, in seconds, for a health check response. A health check fails if a backend server does not respond within this period.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of consecutive successful health checks required to change a backend server\&quot;s status from <strong>unhealthy</strong> to <strong>healthy</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The number of consecutive failed health checks required to change a backend server\&quot;s status from <strong>healthy</strong> to <strong>unhealthy</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static UpdateHealthCheckTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckTemplateAttributeRequest self = new UpdateHealthCheckTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckTemplateAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateHealthCheckTemplateAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UpdateHealthCheckTemplateAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
