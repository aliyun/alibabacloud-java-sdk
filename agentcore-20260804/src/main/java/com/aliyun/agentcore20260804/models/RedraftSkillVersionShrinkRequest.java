// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class RedraftSkillVersionShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static RedraftSkillVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RedraftSkillVersionShrinkRequest self = new RedraftSkillVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RedraftSkillVersionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
