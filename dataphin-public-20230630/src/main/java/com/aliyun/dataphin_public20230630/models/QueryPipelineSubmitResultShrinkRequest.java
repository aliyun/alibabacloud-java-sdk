// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class QueryPipelineSubmitResultShrinkRequest extends TeaModel {
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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The submit detail ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubmitId")
    public Long submitId;

    public static QueryPipelineSubmitResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPipelineSubmitResultShrinkRequest self = new QueryPipelineSubmitResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryPipelineSubmitResultShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public QueryPipelineSubmitResultShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public QueryPipelineSubmitResultShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public QueryPipelineSubmitResultShrinkRequest setSubmitId(Long submitId) {
        this.submitId = submitId;
        return this;
    }
    public Long getSubmitId() {
        return this.submitId;
    }

}
