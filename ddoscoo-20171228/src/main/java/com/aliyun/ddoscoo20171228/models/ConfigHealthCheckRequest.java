// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigHealthCheckRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;tcp&quot;,&quot;Timeout&quot;:10,&quot;Port&quot;:80,&quot;Interval&quot;:10,&quot;Up&quot;:10,&quot;Down&quot;:40}&quot;}</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-XXXXXX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigHealthCheckRequest self = new ConfigHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public ConfigHealthCheckRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ConfigHealthCheckRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ConfigHealthCheckRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public ConfigHealthCheckRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
