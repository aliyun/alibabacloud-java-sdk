// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeRequest extends TeaModel {
    /**
     * <p>The mode that you want to use to forward service traffic. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the default mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin IP address that you specified when you created the port forwarding rule. You can call the <a href="https://help.aliyun.com/document_detail/157482.html">CreateNetworkRules</a> operation to create a port forwarding rule.</li>
     * <li><strong>1</strong>: the origin redundancy mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary or secondary origin servers. You can call the <a href="https://help.aliyun.com/document_detail/312684.html">ConfigLayer4RulePolicy</a> operation to configure IP addresses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BakMode")
    public String bakMode;

    /**
     * <p>The port forwarding rule that you want to manage.</p>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
     * </blockquote>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
     * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;Protocol\&quot;:\&quot;udp\&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RuleBakModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RuleBakModeRequest self = new ConfigLayer4RuleBakModeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RuleBakModeRequest setBakMode(String bakMode) {
        this.bakMode = bakMode;
        return this;
    }
    public String getBakMode() {
        return this.bakMode;
    }

    public ConfigLayer4RuleBakModeRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
