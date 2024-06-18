// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx</strong> HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The HTTP status codes that indicate healthy backend servers.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port that is used for health checks.</p>
     * <p>Valid values: <strong>0 to 65535</strong>.</p>
     * <p>Default value: <strong>0</strong>. If you set the value to 0, the port of a backend server is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that is used for health checks. Valid values:</p>
     * <ul>
     * <li><strong>$SERVER_IP</strong>: the private IP addresses of backend servers. If an IP address is specified, or this parameter is not specified, the ALB instance uses the private IP addresses of backend servers as domain names for health checks.</li>
     * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>$_ip</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP version that is used for health checks.</p>
     * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
     * <p>Default value: <strong>HTTP 1.1</strong>.</p>
     * <blockquote>
     * <p>This parameter is valid only if the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP 1.0</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval at which health checks are performed.</p>
     * <p>Valid values: <strong>1 to 50</strong>.</p>
     * <p>Default value: <strong>2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The method that you want to use for the health check. Valid values:</p>
     * <ul>
     * <li><strong>HEAD</strong>: By default, the ALB instance sends HEAD requests to a backend server to perform HTTP health checks.</li>
     * <li><strong>POST</strong>: gRPC health checks automatically use the POST method.</li>
     * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong> or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL that is used for health checks.</p>
     * <p>It must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&amp;). It can also contain the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \\&quot; , +</code>. The URL must start with a forward slash (/).</p>
     * <blockquote>
     * <p>This parameter is valid only if the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/test/index.html</p>
     */
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    /**
     * <p>The protocol that you want to use for health checks. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong> (default): To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.</li>
     * <li><strong>TCP</strong>: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.</li>
     * <li><strong>gRPC</strong>: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The name of the health check template.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheckTemplate1</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check.</p>
     * <p>Valid values: <strong>1 to 300</strong>.</p>
     * <p>Default value: <strong>5</strong>.</p>
     * <blockquote>
     * <p>If the value of the <code>HealthCheckTimeout</code> parameter is smaller than that of the <code>HealthCheckInterval</code> parameter, the timeout period specified by the <code>HealthCheckTimeout</code> parameter is ignored and the value of the <code>HealthCheckInterval</code> parameter is used as the timeout period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
     * <p>Valid values: <strong>2 to 10</strong>.</p>
     * <p>Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateHealthCheckTemplateRequestTag> tag;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
     * <p>Valid values: <strong>2 to 10</strong>.</p>
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
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
