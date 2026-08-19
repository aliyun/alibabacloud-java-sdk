// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteForwardStrategyRequest extends TeaModel {
    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fs-3fb9b5ae28ee5416</p>
     */
    @NameInMap("ForwardId")
    public String forwardId;

    public static DeleteForwardStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardStrategyRequest self = new DeleteForwardStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteForwardStrategyRequest setForwardId(String forwardId) {
        this.forwardId = forwardId;
        return this;
    }
    public String getForwardId() {
        return this.forwardId;
    }

}
