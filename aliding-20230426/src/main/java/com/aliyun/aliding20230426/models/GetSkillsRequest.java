// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSkillsRequest extends TeaModel {
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SourceIdOfAssistantId")
    public String sourceIdOfAssistantId;

    public static GetSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillsRequest self = new GetSkillsRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public GetSkillsRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public GetSkillsRequest setSourceIdOfAssistantId(String sourceIdOfAssistantId) {
        this.sourceIdOfAssistantId = sourceIdOfAssistantId;
        return this;
    }
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

}
