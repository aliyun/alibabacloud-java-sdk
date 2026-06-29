// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReplaceProjectWhiteListsShrinkRequest extends TeaModel {
    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1030111021</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>The edit command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReplaceCommand")
    public String replaceCommandShrink;

    public static ReplaceProjectWhiteListsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceProjectWhiteListsShrinkRequest self = new ReplaceProjectWhiteListsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceProjectWhiteListsShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ReplaceProjectWhiteListsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ReplaceProjectWhiteListsShrinkRequest setReplaceCommandShrink(String replaceCommandShrink) {
        this.replaceCommandShrink = replaceCommandShrink;
        return this;
    }
    public String getReplaceCommandShrink() {
        return this.replaceCommandShrink;
    }

}
