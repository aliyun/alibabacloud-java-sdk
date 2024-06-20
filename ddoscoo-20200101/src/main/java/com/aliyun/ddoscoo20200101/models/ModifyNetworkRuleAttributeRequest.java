// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyNetworkRuleAttributeRequest extends TeaModel {
    /**
     * <p>The session persistence settings of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><strong>PersistenceTimeout</strong>: The timeout period of session persistence. This field is required and must be of the integer type. Valid values: <strong>30</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>. A value of 0 indicates that session persistence is disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;PersistenceTimeout&quot;:900}</p>
     */
    @NameInMap("Config")
    public String config;

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

    public static ModifyNetworkRuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkRuleAttributeRequest self = new ModifyNetworkRuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkRuleAttributeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyNetworkRuleAttributeRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ModifyNetworkRuleAttributeRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyNetworkRuleAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
