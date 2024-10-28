// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HealthCheckFailTimes")
    public Integer healthCheckFailTimes;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    /**
     * <strong>example:</strong>
     * <p>http_2xx</p>
     */
    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    /**
     * <strong>example:</strong>
     * <p>HEAD</p>
     */
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("HealthCheckPort")
    public Integer healthCheckPort;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HealthCheckSuccTimes")
    public Integer healthCheckSuccTimes;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    /**
     * <strong>example:</strong>
     * <p>l7</p>
     */
    @NameInMap("HealthCheckType")
    public String healthCheckType;

    /**
     * <strong>example:</strong>
     * <p>/health_check</p>
     */
    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>test app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ServicePort")
    public Integer servicePort;

    /**
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
