// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the access policy.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static UpdateDnsGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAccessStrategyResponseBody self = new UpdateDnsGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDnsGtmAccessStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
