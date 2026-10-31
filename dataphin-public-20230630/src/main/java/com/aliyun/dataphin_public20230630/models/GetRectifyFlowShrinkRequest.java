// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRectifyFlowShrinkRequest extends TeaModel {
    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetQuery")
    public String getQueryShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetRectifyFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyFlowShrinkRequest self = new GetRectifyFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetRectifyFlowShrinkRequest setGetQueryShrink(String getQueryShrink) {
        this.getQueryShrink = getQueryShrink;
        return this;
    }
    public String getGetQueryShrink() {
        return this.getQueryShrink;
    }

    public GetRectifyFlowShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetRectifyFlowShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
