// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineByIdShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryId")
    public String queryIdShrink;

    public static GetPipelineByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineByIdShrinkRequest self = new GetPipelineByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineByIdShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public GetPipelineByIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetPipelineByIdShrinkRequest setQueryIdShrink(String queryIdShrink) {
        this.queryIdShrink = queryIdShrink;
        return this;
    }
    public String getQueryIdShrink() {
        return this.queryIdShrink;
    }

}
