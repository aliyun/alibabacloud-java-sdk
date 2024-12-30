// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ParseBatchTaskDependencyShrinkRequest extends TeaModel {
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
    @NameInMap("ParseCommand")
    public String parseCommandShrink;

    public static ParseBatchTaskDependencyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ParseBatchTaskDependencyShrinkRequest self = new ParseBatchTaskDependencyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ParseBatchTaskDependencyShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ParseBatchTaskDependencyShrinkRequest setParseCommandShrink(String parseCommandShrink) {
        this.parseCommandShrink = parseCommandShrink;
        return this;
    }
    public String getParseCommandShrink() {
        return this.parseCommandShrink;
    }

}
