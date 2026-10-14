// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyPortRequest extends TeaModel {
    /**
     * <p>The origin server port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("BackendPort")
    public String backendPort;

    /**
     * <p>The forwarding port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("FrontendPort")
    public String frontendPort;

    /**
     * <p>The type of the forwarding protocol. Valid values:</p>
     * <ul>
     * <li><p><strong>tcp</strong>: TCP protocol.</p>
     * </li>
     * <li><p><strong>udp</strong>: UDP protocol.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("FrontendProtocol")
    public String frontendProtocol;

    /**
     * <p>The ID of the Anti-DDoS Proxy instance to which the port forwarding rule belongs.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Proxy instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-st21zbyq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the traffic diversion switch is on. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: off.</p>
     * </li>
     * <li><p><strong>1</strong>: on.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProxyEnable")
    public Long proxyEnable;

    /**
     * <p>The IP addresses of origin servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    public static ModifyPortRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortRequest self = new ModifyPortRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPortRequest setBackendPort(String backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public String getBackendPort() {
        return this.backendPort;
    }

    public ModifyPortRequest setFrontendPort(String frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public String getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyPortRequest setFrontendProtocol(String frontendProtocol) {
        this.frontendProtocol = frontendProtocol;
        return this;
    }
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    public ModifyPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPortRequest setProxyEnable(Long proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

    public ModifyPortRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

}
