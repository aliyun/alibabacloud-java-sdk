// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppRequest extends TeaModel {
    /**
     * <p>The number of consecutive failed health checks required. If an application is healthy, it is considered unhealthy after the specified number of consecutive failed probes.</p>
     * <ul>
     * <li>Valid values: <strong>1 to 10</strong>. </li>
     * <li>Default value: <strong>5</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckFailTimes")
    public Integer healthCheckFailTimes;

    /**
     * <p>The domain name used for health checks. If not specified, the value is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <p>The HTTP status code that indicates a Normal health check result. Valid values:</p>
     * <ul>
     * <li><strong>http_2xx</strong> (default).</li>
     * <li><strong>http_3xx</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <p>The interval between health checks.</p>
     * <ul>
     * <li>Valid values: <strong>1</strong> to <strong>50</strong>.</li>
     * <li>Default value: <strong>5</strong>.</li>
     * <li>Unit: <strong>seconds</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <p>The health check method for HTTP-type listeners. Valid values:</p>
     * <ul>
     * <li><strong>HEAD</strong> (default): requests only the header of the page.</li>
     * <li><strong>GET</strong>: requests the specified page information and returns the entity body.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <p>The port used for health checks.</p>
     * <ul>
     * <li>Valid values: <strong>1 to 65535</strong>.</li>
     * <li>Default value: <strong>80</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <p>The number of consecutive successful health checks required. If an application is unhealthy, it is considered healthy again after the specified number of consecutive successful probes.</p>
     * <ul>
     * <li>Valid values: <strong>1 to 10</strong>.</li>
     * <li>Default value: <strong>2</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckSuccTimes")
    public Integer healthCheckSuccTimes;

    /**
     * <p>The amount of time to wait for a response from the health check. If the backend ECS instance does not respond correctly within the specified time, the health check is considered failed.    </p>
     * <ul>
     * <li>Valid values: <strong>1</strong> to <strong>100</strong>.   </li>
     * <li>Default value: <strong>3</strong>.</li>
     * <li>Unit: <strong>seconds</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <p>The health check type, which includes Layer 4 and Layer 7 probing. If not specified, the value is empty by default.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>l4</strong>: Layer 4 probing.</li>
     * <li><strong>l7</strong>: Layer 7 probing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>l7</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <p>The URI used for health checks.</p>
     * <ul>
     * <li>Length limit: <strong>1</strong> to <strong>80</strong> characters.</li>
     * <li>Default value: <strong>&quot;/&quot;</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/health_check</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>The application name. The name must start with a lowercase letter and can contain lowercase letters, digits, and hyphens (-). The name must be 6 to 128 characters in length.</p>
     * <blockquote>
     * <p>Notice: You must activate the EdgeContainer service in the console before calling this operation. Calls from accounts that have not activated the service will return a service activation error.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks. If not specified, the value is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>The service port number. Valid values: 1 to 65535.</p>
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
