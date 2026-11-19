// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateEventsShrinkRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static CreateEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventsShrinkRequest self = new CreateEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
