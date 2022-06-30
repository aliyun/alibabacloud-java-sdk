// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleRequest extends TeaModel {
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
