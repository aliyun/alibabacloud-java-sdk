// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    public static AddGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyResponse self = new AddGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

}
