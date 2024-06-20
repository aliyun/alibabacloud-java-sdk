// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigRequest extends TeaModel {
    /**
     * <p>The forwarding protocol. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong></li>
     * <li><strong>udp</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    /**
     * <p>The forwarding port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>The details of the health check configuration. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><p><strong>Type</strong>: the protocol type. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> (Layer 4) and <strong>http</strong> (Layer 7).</p>
     * </li>
     * <li><p><strong>Domain</strong>: the domain name, which must be of the STRING type.</p>
     * <p>**</p>
     * <p><strong>Note</strong>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
     * </li>
     * <li><p><strong>Uri</strong>: the check path, which must be of the STRING type.</p>
     * <p>**</p>
     * <p><strong>Note</strong>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
     * </li>
     * <li><p><strong>Timeout</strong>: the response timeout period, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
     * </li>
     * <li><p><strong>Port</strong>: the port on which you want to perform the health check, which must be of the INTEGER type.</p>
     * </li>
     * <li><p><strong>Interval</strong>: the health check interval, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
     * </li>
     * <li><p><strong>Up</strong>: the number of consecutive successful health checks that must occur before declaring a port healthy, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
     * </li>
     * <li><p><strong>Down</strong>: the number of consecutive failed health checks that must occur before declaring a port unhealthy, which must be of the INTEGER type. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;tcp&quot;,&quot;Timeout&quot;:10,&quot;Port&quot;:8080,&quot;Interval&quot;:10,&quot;Up&quot;:10,&quot;Down&quot;:40}</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyHealthCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigRequest self = new ModifyHealthCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ModifyHealthCheckConfigRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyHealthCheckConfigRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public ModifyHealthCheckConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
