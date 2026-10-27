// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryShrinkRequest extends TeaModel {
    /**
     * <p>The update memory request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateMemoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryShrinkRequest self = new UpdateMemoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
