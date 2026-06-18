// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteSkillGroupRequest extends TeaModel {
    /**
     * <p>External skill group ID</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OuterGroupId")
    public String outerGroupId;

    /**
     * <p>External skill group type. Valid enumeration values are: 1: Hotline, 2: Online, 4: Ticket</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OuterGroupType")
    public String outerGroupType;

    public static DeleteSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSkillGroupRequest self = new DeleteSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSkillGroupRequest setOuterGroupId(String outerGroupId) {
        this.outerGroupId = outerGroupId;
        return this;
    }
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    public DeleteSkillGroupRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

}
