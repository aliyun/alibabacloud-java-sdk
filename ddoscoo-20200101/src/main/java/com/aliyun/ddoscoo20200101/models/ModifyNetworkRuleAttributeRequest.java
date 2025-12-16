// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyNetworkRuleAttributeRequest extends TeaModel {
    /**
     * <p>The detailed settings of the port forwarding rule. This parameter is a JSON string and contains the following fields. The detailed settings of a TCP port forwarding rule contain the following fields.</p>
     * <ul>
     * <li><strong>PersistenceTimeout</strong>: the timeout period of session persistence. This field is required and of the integer type. Valid values: <strong>30</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>, which indicates that session persistence is disabled.</li>
     * <li><strong>Synproxy</strong>: specifies whether to enable the false source feature in the DDoS mitigation policy. This field is required and of the string type. Valid values: off and on.</li>
     * <li><strong>NodataConn</strong>: specifies whether to enable the empty connection feature in the DDoS mitigation policy. This field is required and of the string type. Valid values: off and on.</li>
     * <li><strong>Sla</strong>: the settings of the speed limit for destination feature. This field is required and of the struct type. For more information, see the following description about Sla.</li>
     * <li><strong>Slimit</strong>: the settings of the rate limit for source feature. This field is required and of the struct type. For more information, see the following description about Slimit.</li>
     * <li><strong>PayloadLen</strong>: the settings of the packet length limit feature. This field is required and of the struct type. For more information, see the following description about PayloadLen.</li>
     * </ul>
     * <p>Sla contains the following fields:</p>
     * <ul>
     * <li><strong>Cps</strong>: the destination rate limit on new connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 100 to 100000.</li>
     * <li><strong>Maxconn</strong>: the destination rate limit on concurrent connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1000 to 1000000.</li>
     * <li><strong>CpsEnable</strong>: specifies whether to enable Cps. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Cps is disabled, and the value 1 indicates that Cps is enabled.</li>
     * <li><strong>MaxconnEnable</strong>: specifies whether to enable Maxconn. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Maxconn is disabled, and the value 1 indicates that Maxconn is enabled.</li>
     * </ul>
     * <p>Slimit contains the following fields:</p>
     * <ul>
     * <li><strong>Cps</strong>: the source rate limit on new connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1 to 50000.</li>
     * <li><strong>Maxconn</strong>: the source rate limit on concurrent connections in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 1 to 50000.</li>
     * <li><strong>CpsEnable</strong>: specifies whether to enable Cps. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Cps is disabled, and the value 1 indicates that Cps is enabled.</li>
     * <li><strong>MaxconnEnable</strong>: specifies whether to enable Maxconn. This field is required and of the integer type. Valid values: 0 and 1. Default value: 1. The value 0 indicates that Maxconn is disabled, and the value 1 indicates that Maxconn is enabled.</li>
     * <li><strong>CpsMode</strong>: specifies whether to enable the source rate limit on new connections. This field is required and of the integer type. Valid values: 1 and 2. The value 1 indicates that the source rate limit is disabled. The value 2 indicates that the system determines whether to enable the source rate limit.</li>
     * </ul>
     * <p>PayloadLen contains the following fields:</p>
     * <ul>
     * <li><strong>Min</strong>: the minimum packet length in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 0 to 1500.</li>
     * <li><strong>Max</strong>: the maximum packet length in the DDoS mitigation policy. This field is required and of the integer type. Valid values: 0 to 1500.</li>
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

    @NameInMap("Module")
    public String module;

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

    public ModifyNetworkRuleAttributeRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

}
