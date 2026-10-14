// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeRequest extends TeaModel {
    /**
     * <p>The back-to-origin mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The default back-to-origin mode. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin server IP address that you specified when you called <a href="https://help.aliyun.com/document_detail/157482.html">CreateNetworkRules</a> to create the port forwarding rule.</li>
     * <li><strong>1</strong>: The origin redundancy mode. Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the primary origin server IP address or secondary origin server IP address that you configured by calling <a href="https://help.aliyun.com/document_detail/312684.html">ConfigLayer4RulePolicy</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BakMode")
    public String bakMode;

    /**
     * <p>The port forwarding rule to configure.</p>
     * <p>This parameter is a string converted from a JSON array. Each element in the JSON array represents a created port forwarding rule. You can configure up to one port forwarding rule at a time.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query all created port forwarding rules.</p>
     * </blockquote>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>Protocol</strong>: String type. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: Integer type. Required. The Redirection Port.</li>
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
