// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddSkillGroupRequest extends TeaModel {
    @NameInMap("OuterGroupId")
    public String outerGroupId;

    @NameInMap("OuterGroupName")
    public String outerGroupName;

    @NameInMap("OuterGroupType")
    public String outerGroupType;

    @NameInMap("OuterDepartmentId")
    public String outerDepartmentId;

    @NameInMap("OuterDepartmentType")
    public String outerDepartmentType;

    public static AddSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSkillGroupRequest self = new AddSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddSkillGroupRequest setOuterGroupId(String outerGroupId) {
        this.outerGroupId = outerGroupId;
        return this;
    }
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    public AddSkillGroupRequest setOuterGroupName(String outerGroupName) {
        this.outerGroupName = outerGroupName;
        return this;
    }
    public String getOuterGroupName() {
        return this.outerGroupName;
    }

    public AddSkillGroupRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public AddSkillGroupRequest setOuterDepartmentId(String outerDepartmentId) {
        this.outerDepartmentId = outerDepartmentId;
        return this;
    }
    public String getOuterDepartmentId() {
        return this.outerDepartmentId;
    }

    public AddSkillGroupRequest setOuterDepartmentType(String outerDepartmentType) {
        this.outerDepartmentType = outerDepartmentType;
        return this;
    }
    public String getOuterDepartmentType() {
        return this.outerDepartmentType;
    }

}
