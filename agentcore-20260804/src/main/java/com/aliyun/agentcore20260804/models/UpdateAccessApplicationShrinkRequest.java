// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAccessApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The request body for updating the access application.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessApplicationShrinkRequest self = new UpdateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessApplicationShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
