// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the access policy created.</p>
     * 
     * <strong>example:</strong>
     * <p>strategyid</p>
     */
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
