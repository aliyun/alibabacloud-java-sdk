// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyRequest extends TeaModel {
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
     * <br>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <br>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <br>
     * <p>*   **BackendPort**: the port of the origin server. This field is required and must be of the INTEGER type.</p>
     * <br>
     * <p>*   **PriRealServers**: the IP addresses of the primary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the primary origin server. You can configure a maximum of 20 IP addresses.</p>
     * <br>
     * <p>    Each element in the JSON array contains the following field:</p>
     * <br>
     * <p>    *   **RealServer**: the IP address of the primary origin server. This field is required and must be of the STRING type.</p>
     * <br>
     * <p>*   **SecRealServers**: the IP addresses of the secondary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the secondary origin server. You can configure a maximum of 20 IP addresses.</p>
     * <br>
     * <p>    Each element in the JSON array contains the following field:</p>
     * <br>
     * <p>    *   **RealServer**: the IP address of the secondary origin server. This field is required and must be of the STRING type.</p>
     * <br>
     * <p>*   **CurrentRsIndex**: the origin server that you want to use to receive service traffic. This field is required and must be of the INTEGER type. Valid values:</p>
     * <br>
     * <p>    *   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</p>
     * <p>    *   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    public static ConfigLayer4RulePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigLayer4RulePolicyRequest self = new ConfigLayer4RulePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ConfigLayer4RulePolicyRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
