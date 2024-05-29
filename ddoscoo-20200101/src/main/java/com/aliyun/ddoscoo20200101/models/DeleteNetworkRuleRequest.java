// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleRequest extends TeaModel {
    /**
     * <p>An array that consists of the information about the port forwarding rule. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the instance. This field is required and must be of the STRING type.</p>
     * <p>*   **Protocol**: the forwarding protocol. This field is required and must be of the STRING type. Valid values: **tcp** and **udp**.</p>
     * <p>*   **FrontendPort**: the forwarding port. This field is required and must be of the INTEGER type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkRule")
    public String networkRule;

    public static DeleteNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRuleRequest self = new DeleteNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRuleRequest setNetworkRule(String networkRule) {
        this.networkRule = networkRule;
        return this;
    }
    public String getNetworkRule() {
        return this.networkRule;
    }

}
