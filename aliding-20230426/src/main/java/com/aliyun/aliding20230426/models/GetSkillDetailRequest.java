// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillDetailRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SkillId")
    public String skillId;

    @NameInMap("SourceIdOfAssistantId")
    public String sourceIdOfAssistantId;

    public static GetSkillDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillDetailRequest self = new GetSkillDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillDetailRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetSkillDetailRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public GetSkillDetailRequest setSourceIdOfAssistantId(String sourceIdOfAssistantId) {
        this.sourceIdOfAssistantId = sourceIdOfAssistantId;
        return this;
    }
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

}
