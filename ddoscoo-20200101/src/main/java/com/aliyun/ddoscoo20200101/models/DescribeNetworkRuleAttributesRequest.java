// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesRequest extends TeaModel {
    /**
     * <p>The details of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <br>
     * <p>This parameter is required.</p>
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
