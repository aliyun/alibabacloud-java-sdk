// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteEventsShrinkRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static DeleteEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventsShrinkRequest self = new DeleteEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
