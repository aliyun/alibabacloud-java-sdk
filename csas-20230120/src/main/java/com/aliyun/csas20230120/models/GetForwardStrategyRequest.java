// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetForwardStrategyRequest extends TeaModel {
    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fs-651b975a22aa019c</p>
     */
    @NameInMap("ForwardId")
    public String forwardId;

    public static GetForwardStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetForwardStrategyRequest self = new GetForwardStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetForwardStrategyRequest setForwardId(String forwardId) {
        this.forwardId = forwardId;
        return this;
    }
    public String getForwardId() {
        return this.forwardId;
    }

}
