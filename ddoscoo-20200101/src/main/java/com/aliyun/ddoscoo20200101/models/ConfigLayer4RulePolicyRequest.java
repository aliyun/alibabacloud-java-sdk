// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigLayer4RulePolicyRequest extends TeaModel {
    /**
     * <p>The port forwarding rule that you want to manage.</p>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
     * </blockquote>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <ul>
     * <li><p><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</p>
     * </li>
     * <li><p><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</p>
     * </li>
     * <li><p><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * </li>
     * <li><p><strong>BackendPort</strong>: the port of the origin server. This field is required and must be of the INTEGER type.</p>
     * </li>
     * <li><p><strong>PriRealServers</strong>: the IP addresses of the primary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the primary origin server. You can configure a maximum of 20 IP addresses.</p>
     * <p>Each element in the JSON array contains the following field:</p>
     * <ul>
     * <li><strong>RealServer</strong>: the IP address of the primary origin server. This field is required and must be of the STRING type.</li>
     * </ul>
     * </li>
     * <li><p><strong>SecRealServers</strong>: the IP addresses of the secondary origin server. This field is required and must be a JSON array. Each element in a JSON array indicates an IP address of the secondary origin server. You can configure a maximum of 20 IP addresses.</p>
     * <p>Each element in the JSON array contains the following field:</p>
     * <ul>
     * <li><strong>RealServer</strong>: the IP address of the secondary origin server. This field is required and must be of the STRING type.</li>
     * </ul>
     * </li>
     * <li><p><strong>CurrentRsIndex</strong>: the origin server that you want to use to receive service traffic. This field is required and must be of the INTEGER type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</li>
     * <li><strong>2</strong>: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;Protocol\&quot;:\&quot;udp\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;BackendPort\&quot;:2022,\&quot;PriRealServers\&quot;:[{\&quot;RealServer\&quot;:\&quot;192.0.2.1\&quot;},{\&quot;RealServer\&quot;:\&quot;192.0.2.2\&quot;}],\&quot;SecRealServers\&quot;:[{\&quot;RealServer\&quot;:\&quot;192.0.2.3\&quot;},{\&quot;RealServer\&quot;:\&quot;192.0.2.4\&quot;}],\&quot;CurrentRsIndex\&quot;:1}]</p>
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
