// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRulesRequest extends TeaModel {
    /**
     * <p>The details of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <p>*   **BackendPort**: the port of the origin server. This field is required and must be of the INTEGER type.</p>
     * <p>*   **RealServers**: the IP addresses of the origin server. This field is required and must be a JSON array. You can specify up to 20 IP addresses.</p>
     * <br>
     * <p>> You can modify only the value of **RealServers** when you modify a port forwarding rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkRules")
    public String networkRules;

    public static ConfigNetworkRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRulesRequest self = new ConfigNetworkRulesRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRulesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
