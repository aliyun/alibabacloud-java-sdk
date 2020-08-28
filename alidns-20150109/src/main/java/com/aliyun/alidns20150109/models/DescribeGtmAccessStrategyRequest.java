// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    public static DescribeGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyRequest self = new DescribeGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

}
