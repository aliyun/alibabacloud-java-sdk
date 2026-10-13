// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class AddMemoriesShrinkRequest extends TeaModel {
    /**
     * <p>The memory write request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static AddMemoriesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesShrinkRequest self = new AddMemoriesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddMemoriesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
