// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAccessStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the access policy.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static AddDnsGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAccessStrategyResponseBody self = new AddDnsGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnsGtmAccessStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
