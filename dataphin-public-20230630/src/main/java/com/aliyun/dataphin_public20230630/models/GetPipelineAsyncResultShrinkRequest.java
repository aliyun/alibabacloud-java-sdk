// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineAsyncResultShrinkRequest extends TeaModel {
    /**
     * <p>The asynchronous execution ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AsyncId")
    public Long asyncId;

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
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetPipelineAsyncResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineAsyncResultShrinkRequest self = new GetPipelineAsyncResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineAsyncResultShrinkRequest setAsyncId(Long asyncId) {
        this.asyncId = asyncId;
        return this;
    }
    public Long getAsyncId() {
        return this.asyncId;
    }

    public GetPipelineAsyncResultShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public GetPipelineAsyncResultShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetPipelineAsyncResultShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
