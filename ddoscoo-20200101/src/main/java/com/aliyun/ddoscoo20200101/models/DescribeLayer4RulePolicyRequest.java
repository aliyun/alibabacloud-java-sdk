// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyRequest extends TeaModel {
    /**
     * <p>The port forwarding rule that you want to query.</p>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can query only one port forwarding rule at a time.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
     * </blockquote>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <ul>
     * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the string type.</li>
     * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the string type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
     * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the integer type.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;InstanceId\&quot;:\&quot;ddosDip-sg-4hr2b3l****\&quot;,\&quot;FrontendPort\&quot;:2020,\&quot;Protocol\&quot;:\&quot;udp\&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    public static DescribeLayer4RulePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulePolicyRequest self = new DescribeLayer4RulePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulePolicyRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
