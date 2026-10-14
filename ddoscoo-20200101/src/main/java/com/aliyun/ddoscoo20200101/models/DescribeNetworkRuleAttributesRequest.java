// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesRequest extends TeaModel {
    /**
     * <p>The port forwarding rules to query. This parameter is a JSON string with the following structure:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: String type. Required. The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</li>
     * <li><strong>Protocol</strong>: String type. Required. The forwarding protocol type. Valid values: <strong>tcp</strong>, <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: Integer type. Required. The forwarding port.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080}]</p>
     */
    @NameInMap("NetworkRules")
    public String networkRules;

    public static DescribeNetworkRuleAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleAttributesRequest self = new DescribeNetworkRuleAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleAttributesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
