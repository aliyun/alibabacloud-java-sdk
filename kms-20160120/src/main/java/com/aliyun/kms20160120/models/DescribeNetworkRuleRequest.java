// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static DescribeNetworkRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleRequest self = new DescribeNetworkRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
