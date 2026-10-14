// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreatePortRequest extends TeaModel {
    /**
     * <p>The origin server port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("BackendPort")
    public String backendPort;

    /**
     * <p>The forward port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("FrontendPort")
    public String frontendPort;

    /**
     * <p>The forwarding protocol type. Valid values:</p>
     * <ul>
     * <li><strong>tcp</strong>: TCP protocol.</li>
     * <li><strong>udp</strong>: UDP protocol.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("FrontendProtocol")
    public String frontendProtocol;

    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to which the port forwarding rule belongs.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-st21zbyq****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpMode")
    public String ipMode;

    /**
     * <p>The traffic redirection switch. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProxyEnable")
    public Long proxyEnable;

    /**
     * <p>The list of origin server IP addresses.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    public static CreatePortRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRequest self = new CreatePortRequest();
        return TeaModel.build(map, self);
    }

    public CreatePortRequest setBackendPort(String backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public String getBackendPort() {
        return this.backendPort;
    }

    public CreatePortRequest setFrontendPort(String frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public String getFrontendPort() {
        return this.frontendPort;
    }

    public CreatePortRequest setFrontendProtocol(String frontendProtocol) {
        this.frontendProtocol = frontendProtocol;
        return this;
    }
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    public CreatePortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreatePortRequest setIpMode(String ipMode) {
        this.ipMode = ipMode;
        return this;
    }
    public String getIpMode() {
        return this.ipMode;
    }

    public CreatePortRequest setProxyEnable(Long proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Long getProxyEnable() {
        return this.proxyEnable;
    }

    public CreatePortRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

}
