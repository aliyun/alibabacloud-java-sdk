// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupDepartSaveShrinkRequest extends TeaModel {
    @NameInMap("dept_name")
    public String deptName;

    @NameInMap("manager_ids")
    public String managerIds;

    @NameInMap("outer_dept_id")
    public String outerDeptId;

    @NameInMap("outer_dept_pid")
    public String outerDeptPid;

    @NameInMap("status")
    public Integer status;

    @NameInMap("sub_corp_id_list")
    public String subCorpIdListShrink;

    @NameInMap("sync_group")
    public Boolean syncGroup;

    public static GroupDepartSaveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupDepartSaveShrinkRequest self = new GroupDepartSaveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GroupDepartSaveShrinkRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public GroupDepartSaveShrinkRequest setManagerIds(String managerIds) {
        this.managerIds = managerIds;
        return this;
    }
    public String getManagerIds() {
        return this.managerIds;
    }

    public GroupDepartSaveShrinkRequest setOuterDeptId(String outerDeptId) {
        this.outerDeptId = outerDeptId;
        return this;
    }
    public String getOuterDeptId() {
        return this.outerDeptId;
    }

    public GroupDepartSaveShrinkRequest setOuterDeptPid(String outerDeptPid) {
        this.outerDeptPid = outerDeptPid;
        return this;
    }
    public String getOuterDeptPid() {
        return this.outerDeptPid;
    }

    public GroupDepartSaveShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GroupDepartSaveShrinkRequest setSubCorpIdListShrink(String subCorpIdListShrink) {
        this.subCorpIdListShrink = subCorpIdListShrink;
        return this;
    }
    public String getSubCorpIdListShrink() {
        return this.subCorpIdListShrink;
    }

    public GroupDepartSaveShrinkRequest setSyncGroup(Boolean syncGroup) {
        this.syncGroup = syncGroup;
        return this;
    }
    public Boolean getSyncGroup() {
        return this.syncGroup;
    }

}
