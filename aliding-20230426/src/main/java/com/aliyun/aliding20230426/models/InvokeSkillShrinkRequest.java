// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeSkillShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    /**
     * <strong>example:</strong>
     * <p>a1d033dd-xxxx-49cf-b49b-2068081bb551</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    public static InvokeSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeSkillShrinkRequest self = new InvokeSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvokeSkillShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

    public InvokeSkillShrinkRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

}
