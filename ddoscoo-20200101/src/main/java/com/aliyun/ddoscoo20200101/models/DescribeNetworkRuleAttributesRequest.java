// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesRequest extends TeaModel {
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
