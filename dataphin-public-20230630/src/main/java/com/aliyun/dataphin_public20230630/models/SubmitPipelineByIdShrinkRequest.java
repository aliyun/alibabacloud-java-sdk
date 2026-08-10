// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitPipelineByIdShrinkRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

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
     * <p>The ID used to query the pipeline task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryId")
    public String queryIdShrink;

    public static SubmitPipelineByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPipelineByIdShrinkRequest self = new SubmitPipelineByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPipelineByIdShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public SubmitPipelineByIdShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitPipelineByIdShrinkRequest setQueryIdShrink(String queryIdShrink) {
        this.queryIdShrink = queryIdShrink;
        return this;
    }
    public String getQueryIdShrink() {
        return this.queryIdShrink;
    }

}
