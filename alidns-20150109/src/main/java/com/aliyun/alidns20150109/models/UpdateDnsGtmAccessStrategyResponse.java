// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    public static UpdateDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAccessStrategyResponse self = new UpdateDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDnsGtmAccessStrategyResponse setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
