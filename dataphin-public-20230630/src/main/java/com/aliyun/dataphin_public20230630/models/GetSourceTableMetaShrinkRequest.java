// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSourceTableMetaShrinkRequest extends TeaModel {
    /**
     * <p>The request context.</p>
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
     * <p>The query conditions for the integration source table.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Query")
    public String queryShrink;

    public static GetSourceTableMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourceTableMetaShrinkRequest self = new GetSourceTableMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSourceTableMetaShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public GetSourceTableMetaShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetSourceTableMetaShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetSourceTableMetaShrinkRequest setQueryShrink(String queryShrink) {
        this.queryShrink = queryShrink;
        return this;
    }
    public String getQueryShrink() {
        return this.queryShrink;
    }

}
