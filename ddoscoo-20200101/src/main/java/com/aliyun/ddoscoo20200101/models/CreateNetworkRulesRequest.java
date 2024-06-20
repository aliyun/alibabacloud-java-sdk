// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateNetworkRulesRequest extends TeaModel {
    /**
     * <p>The details of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
     * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
     * <li><strong>BackendPort</strong>: the port of the origin server. This field is required and must be of the INTEGER type.</li>
     * <li><strong>RealServers</strong>: the IP addresses of the origin server. This field is required and must be a JSON array. You can specify up to 20 IP addresses.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:8080,&quot;BackendPort&quot;:8080,&quot;RealServers&quot;:[&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;]}]</p>
     */
    @NameInMap("NetworkRules")
    public String networkRules;

    public static CreateNetworkRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRulesRequest self = new CreateNetworkRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRulesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
