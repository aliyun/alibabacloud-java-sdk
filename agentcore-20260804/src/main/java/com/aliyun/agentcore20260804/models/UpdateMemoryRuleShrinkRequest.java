// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryRuleShrinkRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateMemoryRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRuleShrinkRequest self = new UpdateMemoryRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRuleShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
