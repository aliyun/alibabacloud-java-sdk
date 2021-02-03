// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyId")
    public String strategyId;

    public static AddGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyResponseBody self = new AddGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGtmAccessStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
