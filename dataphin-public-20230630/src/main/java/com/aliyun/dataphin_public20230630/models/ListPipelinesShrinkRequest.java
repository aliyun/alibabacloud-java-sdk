// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPipelinesShrinkRequest extends TeaModel {
    /**
     * <p>The request context.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>The query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCommand")
    public String listCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListPipelinesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesShrinkRequest self = new ListPipelinesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public ListPipelinesShrinkRequest setListCommandShrink(String listCommandShrink) {
        this.listCommandShrink = listCommandShrink;
        return this;
    }
    public String getListCommandShrink() {
        return this.listCommandShrink;
    }

    public ListPipelinesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
