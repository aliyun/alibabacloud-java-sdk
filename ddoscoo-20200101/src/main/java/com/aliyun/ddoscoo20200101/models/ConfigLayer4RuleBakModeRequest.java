// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RuleBakModeRequest extends TeaModel {
    /**
     * <p>The mode that you want to use to forward service traffic. Valid values:</p>
     * <br>
     * <p>*   **0**: the default mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin IP address that you specified when you created the port forwarding rule. You can call the [CreateNetworkRules](https://help.aliyun.com/document_detail/157482.html) operation to create a port forwarding rule.</p>
     * <p>*   **1**: the origin redundancy mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary or secondary origin servers. You can call the [ConfigLayer4RulePolicy](https://help.aliyun.com/document_detail/312684.html) operation to configure IP addresses.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BakMode")
    public String bakMode;

    /**
     * <p>The port forwarding rule that you want to manage.</p>
     * <br>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
     * <br>
     * <p>> You can call the [DescribeNetworkRules](https://help.aliyun.com/document_detail/157484.html) to query existing port forwarding rules.</p>
     * <br>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <br>
     * <p>This parameter is required.</p>
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
