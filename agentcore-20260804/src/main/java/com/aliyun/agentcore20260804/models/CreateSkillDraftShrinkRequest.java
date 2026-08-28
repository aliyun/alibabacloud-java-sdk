// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateSkillDraftShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static CreateSkillDraftShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillDraftShrinkRequest self = new CreateSkillDraftShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillDraftShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
