// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAgentSkillRequest extends TeaModel {
    /**
     * <p>The list of skill IDs.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    public static DeleteAgentSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentSkillRequest self = new DeleteAgentSkillRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentSkillRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

}
