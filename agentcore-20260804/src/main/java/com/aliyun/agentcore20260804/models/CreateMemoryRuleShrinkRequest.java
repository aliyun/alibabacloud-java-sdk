// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryRuleShrinkRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static CreateMemoryRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRuleShrinkRequest self = new CreateMemoryRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRuleShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
