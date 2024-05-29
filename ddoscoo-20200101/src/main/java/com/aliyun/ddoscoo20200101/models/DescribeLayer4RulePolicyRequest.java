// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyRequest extends TeaModel {
    /**
     * <p>The port forwarding rule that you want to query.</p>
     * <br>
     * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can query only one port forwarding rule at a time.</p>
     * <br>
     * <p>> You can call the [DescribeNetworkRules](https://help.aliyun.com/document_detail/157484.html) to query existing port forwarding rules.</p>
     * <br>
     * <p>Each port forwarding rule contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the string type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the string type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the integer type.</p>
     * <br>
     * <p>This parameter is required.</p>
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
