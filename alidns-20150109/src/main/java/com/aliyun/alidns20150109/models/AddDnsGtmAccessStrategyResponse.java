// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    public static AddDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAccessStrategyResponse self = new AddDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnsGtmAccessStrategyResponse setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
