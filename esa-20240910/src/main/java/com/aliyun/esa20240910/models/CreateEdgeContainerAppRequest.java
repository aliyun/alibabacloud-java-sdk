// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppRequest extends TeaModel {
    /**
     * <p>The number of consecutive failed health checks required for an application to be considered as unhealthy. Valid values: 1 to 10. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckFailTimes")
    public Integer healthCheckFailTimes;

    /**
     * <p>The domain name that is used for health checks. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP status code returned for a successful health check. Valid values:</p>
     * <ul>
     * <li><strong>http_2xx</strong> (default)</li>
     * <li><strong>http_3xx</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The HTTP request method for health checks. Valid values:</p>
     * <ul>
     * <li><strong>HEAD</strong> (default): requests the headers of the resource.</li>
     * <li><strong>GET</strong>: requests the specified resource and returns both the headers and entity body.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The port used for health checks. Valid values: 1 to 65535. Default value: 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The number of consecutive successful health checks required for an application to be considered as healthy. Valid values: 1 to 10. Default value: 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckSuccTimes")
    public Integer healthCheckSuccTimes;

    /**
     * <p>The timeout period of a health check response. If a backend ECS instance does not respond within the specified timeout period, the ECS instance fails the health check. Unit: seconds.\
     * Valid values: <strong>1</strong> to <strong>100</strong>.\
     * Default value: <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The health check type. By default, this parameter is left empty.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>l4</strong>: Layer 4 health check.</li>
     * <li><strong>l7</strong>: Layer 7 health check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>l7</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The URI used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length. Default value: &quot;/&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>/health_check</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The name of the application. The name must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-). The name must be 6 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks. This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>The server port. Valid values: 1 to 65535.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServicePort")
    public Integer servicePort;

    /**
     * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TargetPort")
    public Integer targetPort;

    public static CreateEdgeContainerAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppRequest self = new CreateEdgeContainerAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppRequest setHealthCheckFailTimes(Integer healthCheckFailTimes) {
        this.healthCheckFailTimes = healthCheckFailTimes;
        return this;
    }
    public Integer getHealthCheckFailTimes() {
        return this.healthCheckFailTimes;
    }

    public CreateEdgeContainerAppRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public CreateEdgeContainerAppRequest setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public CreateEdgeContainerAppRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public CreateEdgeContainerAppRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public CreateEdgeContainerAppRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public CreateEdgeContainerAppRequest setHealthCheckSuccTimes(Integer healthCheckSuccTimes) {
        this.healthCheckSuccTimes = healthCheckSuccTimes;
        return this;
    }
    public Integer getHealthCheckSuccTimes() {
        return this.healthCheckSuccTimes;
    }

    public CreateEdgeContainerAppRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public CreateEdgeContainerAppRequest setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }
    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    public CreateEdgeContainerAppRequest setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public CreateEdgeContainerAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeContainerAppRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateEdgeContainerAppRequest setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Integer getServicePort() {
        return this.servicePort;
    }

    public CreateEdgeContainerAppRequest setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

}
