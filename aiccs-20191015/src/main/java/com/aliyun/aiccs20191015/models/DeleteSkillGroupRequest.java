// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupRequest extends TeaModel {
    @NameInMap("OuterGroupType")
    public String outerGroupType;

    @NameInMap("OuterGroupId")
    public String outerGroupId;

    public static DeleteSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupRequest self = new DeleteSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public DeleteSkillGroupRequest setOuterGroupId(String outerGroupId) {
        this.outerGroupId = outerGroupId;
        return this;
    }
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

}
