// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateAgentSpecShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static CreateAgentSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSpecShrinkRequest self = new CreateAgentSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSpecShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
