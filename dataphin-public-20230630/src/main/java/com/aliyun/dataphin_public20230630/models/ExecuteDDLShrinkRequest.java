// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteDDLShrinkRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Context")
    public String contextShrink;

    /**
     * <p>The one-click table creation parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DDLCommand")
    public String DDLCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ExecuteDDLShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDDLShrinkRequest self = new ExecuteDDLShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDDLShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public ExecuteDDLShrinkRequest setDDLCommandShrink(String DDLCommandShrink) {
        this.DDLCommandShrink = DDLCommandShrink;
        return this;
    }
    public String getDDLCommandShrink() {
        return this.DDLCommandShrink;
    }

    public ExecuteDDLShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
