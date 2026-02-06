// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillsShrinkRequest extends TeaModel {
    @NameInMap("GroupIds")
    public String groupIdsShrink;

    @NameInMap("SkillIds")
    public String skillIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SourceIdOfAssistantId")
    public String sourceIdOfAssistantId;

    public static GetSkillsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillsShrinkRequest self = new GetSkillsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillsShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetSkillsShrinkRequest setSkillIdsShrink(String skillIdsShrink) {
        this.skillIdsShrink = skillIdsShrink;
        return this;
    }
    public String getSkillIdsShrink() {
        return this.skillIdsShrink;
    }

    public GetSkillsShrinkRequest setSourceIdOfAssistantId(String sourceIdOfAssistantId) {
        this.sourceIdOfAssistantId = sourceIdOfAssistantId;
        return this;
    }
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

}
