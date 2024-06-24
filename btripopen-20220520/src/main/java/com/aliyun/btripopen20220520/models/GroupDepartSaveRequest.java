// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupDepartSaveRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dept_name")
    public String deptName;

    @NameInMap("manager_ids")
    public String managerIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("outer_dept_id")
    public String outerDeptId;

    /**
     * <strong>example:</strong>
     * <p>002</p>
     */
    @NameInMap("outer_dept_pid")
    public String outerDeptPid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    @NameInMap("sub_corp_id_list")
    public java.util.List<String> subCorpIdList;

    @NameInMap("sync_group")
    public Boolean syncGroup;

    public static GroupDepartSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupDepartSaveRequest self = new GroupDepartSaveRequest();
        return TeaModel.build(map, self);
    }

    public GroupDepartSaveRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public GroupDepartSaveRequest setManagerIds(String managerIds) {
        this.managerIds = managerIds;
        return this;
    }
    public String getManagerIds() {
        return this.managerIds;
    }

    public GroupDepartSaveRequest setOuterDeptId(String outerDeptId) {
        this.outerDeptId = outerDeptId;
        return this;
    }
    public String getOuterDeptId() {
        return this.outerDeptId;
    }

    public GroupDepartSaveRequest setOuterDeptPid(String outerDeptPid) {
        this.outerDeptPid = outerDeptPid;
        return this;
    }
    public String getOuterDeptPid() {
        return this.outerDeptPid;
    }

    public GroupDepartSaveRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GroupDepartSaveRequest setSubCorpIdList(java.util.List<String> subCorpIdList) {
        this.subCorpIdList = subCorpIdList;
        return this;
    }
    public java.util.List<String> getSubCorpIdList() {
        return this.subCorpIdList;
    }

    public GroupDepartSaveRequest setSyncGroup(Boolean syncGroup) {
        this.syncGroup = syncGroup;
        return this;
    }
    public Boolean getSyncGroup() {
        return this.syncGroup;
    }

}
