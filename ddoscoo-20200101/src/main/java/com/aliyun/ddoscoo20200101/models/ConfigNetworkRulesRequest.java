// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRulesRequest extends TeaModel {
    /**
     * <p>The details of the port forwarding rules. The value is a JSON format character string that contains the following structure:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: String. Required. The instance ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>Protocol</strong>: String. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: Integer. Required. The Redirection Port.</li>
     * <li><strong>BackendPort</strong>: Integer. Required. The origin server port.</li>
     * <li><strong>RealServers</strong>: JSON array. Required. The list of origin server IP addresses. A maximum of 20 IP addresses are supported.</li>
     * </ul>
     * <blockquote>
     * <p>When you edit port forwarding rules, you can modify only <strong>RealServers</strong>, which specifies the origin server IP addresses.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080,&quot;BackendPort&quot;:8080,&quot;RealServers&quot;:[&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;,&quot;3.3.3.3&quot;]}]</p>
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
