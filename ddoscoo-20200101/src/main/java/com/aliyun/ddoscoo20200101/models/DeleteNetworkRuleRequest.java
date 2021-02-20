// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteNetworkRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("NetworkRule")
    public String networkRule;

    public static DeleteNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRuleRequest self = new DeleteNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteNetworkRuleRequest setNetworkRule(String networkRule) {
        this.networkRule = networkRule;
        return this;
    }
    public String getNetworkRule() {
        return this.networkRule;
    }

}
