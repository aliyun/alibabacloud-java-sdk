// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("NetworkRules")
    public String networkRules;

    public static DescribeNetworkRuleAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleAttributesRequest self = new DescribeNetworkRuleAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleAttributesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNetworkRuleAttributesRequest setNetworkRules(String networkRules) {
        this.networkRules = networkRules;
        return this;
    }
    public String getNetworkRules() {
        return this.networkRules;
    }

}
