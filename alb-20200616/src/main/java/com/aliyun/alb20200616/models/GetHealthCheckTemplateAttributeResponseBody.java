// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status codes that indicate healthy backend servers.</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port that is used for health checks.</p>
     * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name that you want to use for health checks. Valid values:</p>
     * <ul>
     * <li><strong>$SERVER_IP</strong>: the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) instance uses the private IP addresses of backend servers for health checks.</li>
     * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>$SERVER_IP</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP version that is used for health checks.</p>
     * <p>Valid values: <strong>HTTP1.0</strong> and <strong>HTTP1.1</strong>.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <code>HealthCheckProtocol</code> parameter is set to <strong>HTTP</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP1.0</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1 to 50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The method that you want to use for the health check. Valid values:</p>
     * <ul>
     * <li><strong>HEAD</strong>: By default, the ALB instance sends HEAD requests to a backend server to perform HTTP health checks.</li>
     * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
     * <li><strong>POST</strong>: gRPC health checks automatically use the POST method.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong> or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL that is used for health checks.</p>
     * <p>The URL must be 1 to 80 characters in length, and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&amp;). The URL can also contain the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \\&quot; , +</code>. The URL must start with a forward slash (/).</p>
     * <blockquote>
     * <p>This parameter takes effect only when the <strong>HealthCheckProtocol</strong> parameter is set to <strong>HTTP</strong> or <strong>gRPC</strong>.</p>
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
     * <p>The ID of the health check template.</p>
     * 
     * <strong>example:</strong>
     * <p>hct-x4jazoyi6tvsq9****</p>
     */
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    /**
     * <p>The name of the health check template.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheckTemplate1</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period of a health check. If a backend server does not respond within the specified timeout period, the backend server fails the health check. Unit: seconds.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
     * <blockquote>
     * <p>If the value of the <code>HealthCheckTimeout</code> parameter is smaller than that of the <code>HealthCheckInterval</code> parameter, the timeout period specified by the <code>HealthCheckTimeout</code> parameter is ignored and the value of the <code>HealthCheckInterval</code> parameter is used as the timeout period.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB1AFC33-DAE8-528E-AA4D-4A6AABE71945</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> tags;

    /**
     * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
     * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static GetHealthCheckTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthCheckTemplateAttributeResponseBody self = new GetHealthCheckTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public GetHealthCheckTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setTags(java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetHealthCheckTemplateAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetHealthCheckTemplateAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static class GetHealthCheckTemplateAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetHealthCheckTemplateAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetHealthCheckTemplateAttributeResponseBodyTags self = new GetHealthCheckTemplateAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetHealthCheckTemplateAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHealthCheckTemplateAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
