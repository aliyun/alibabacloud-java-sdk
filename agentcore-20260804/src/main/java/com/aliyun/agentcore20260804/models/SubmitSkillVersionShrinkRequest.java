// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class SubmitSkillVersionShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static SubmitSkillVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSkillVersionShrinkRequest self = new SubmitSkillVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSkillVersionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
