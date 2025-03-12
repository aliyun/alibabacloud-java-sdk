// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Slimit&quot;:{&quot;CpsEnable&quot;:1,&quot;MaxconnEnable&quot;:1,&quot;Cps&quot;:1,&quot;Maxconn&quot;:1},&quot;Sla&quot;:{&quot;CpsEnable&quot;:1,&quot;MaxconnEnable&quot;:1,&quot;Cps&quot;:100,&quot;Maxconn&quot;:1000},&quot;PayloadLen&quot;:{&quot;Min&quot;:0,&quot;Max&quot;:6000}}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
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
     * <p>ddoscoo-cn-XXXXX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigLayer4RuleAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleAttributeRequest self = new ConfigLayer4RuleAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleAttributeRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigLayer4RuleAttributeRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ConfigLayer4RuleAttributeRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ConfigLayer4RuleAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
