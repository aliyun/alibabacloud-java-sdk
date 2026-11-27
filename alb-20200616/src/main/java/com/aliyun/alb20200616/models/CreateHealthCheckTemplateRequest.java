// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateHealthCheckTemplateRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a precheck request without creating the resource. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the precheck, the <strong>http_2xx</strong> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of normal status codes for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    /**
     * <p>The port used for health checks.</p>
     * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>Default value: <strong>0</strong>, which indicates that the port of the backend server is used for health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    /**
     * <p>The domain name used for health checks. Valid values: </p>
     * <ul>
     * <li><p><strong>$SERVER_IP</strong>: the private IP of the backend server. If an IP address is specified or this parameter is not specified, load balancing uses the private IP of the backend server as the domain name for health checks.</p>
     * </li>
     * <li><p><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain only letters, digits, periods (.), and hyphens (-).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>$SERVER_IP</p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP version for health checks.</p>
     * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
     * <p>Default value: <strong>HTTP 1.1</strong>.</p>
     * <blockquote>
     * <p>This parameter is available only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTTP 1.0</p>
     */
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    /**
     * <p>The interval between health checks.</p>
     * <p>Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
     * <p>Default value: <strong>2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method. Valid values:</p>
     * <ul>
     * <li><p><strong>HEAD</strong> (default): the default method for HTTP and HTTPS listener health checks.</p>
     * </li>
     * <li><p><strong>POST</strong>: the default method for gRPC listener health checks.</p>
     * </li>
     * <li><p><strong>GET</strong>: If the length of the response message exceeds 8 KB, the message is truncated. However, this does not affect the health check result.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The URL used for health checks.</p>
     * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), ampersands (&amp;), and the following extended characters: <code>_;~!()*[]@$^:\&quot;,+</code>. The URL must start with a forward slash (/).</p>
     * <blockquote>
     * <p>This parameter is available only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
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
     * <li><p><strong>HTTP</strong> (default): sends HEAD or GET requests for browser access impersonation to check whether the server application is healthy.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests for browser access impersonation to check whether the server application is healthy. (Provides data encryption, making it more secure than HTTP.)</p>
     * </li>
     * <li><p><strong>TCP</strong>: sends SYN handshake messages to check whether the server port is alive.</p>
     * </li>
     * <li><p><strong>gRPC</strong>: sends POST or GET requests to check whether the server application is healthy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    /**
     * <p>The name of the health check template. The name must be 2 to 128 characters in length. It must start with a letter, Chinese character, or digit, and can contain letters, Chinese characters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HealthCheckTemplate1</p>
     */
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    /**
     * <p>The timeout period for receiving a response from a health check. If the backend server does not respond within the specified timeout period, the health check fails.</p>
     * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
     * <p>Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The number of consecutive successful health checks that must occur before the health check status of a backend server changes from <strong>Failed</strong> to <strong>Successful</strong>.</p>
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
     * <p>The number of consecutive failed health checks that must occur before the health check status of a backend server changes from <strong>Successful</strong> to <strong>Failed</strong>.</p>
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
         * <p>The tag key. The key can be up to 128 characters in length, and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length, and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
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
