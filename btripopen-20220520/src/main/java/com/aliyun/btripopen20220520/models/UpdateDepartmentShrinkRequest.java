// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateDepartmentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dept_name")
    public String deptName;

    @NameInMap("manager_employee_id_list")
    public String managerEmployeeIdListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dept123</p>
     */
    @NameInMap("out_dept_id")
    public String outDeptId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dept456</p>
     */
    @NameInMap("out_dept_pid")
    public String outDeptPid;

    public static UpdateDepartmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentShrinkRequest self = new UpdateDepartmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentShrinkRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public UpdateDepartmentShrinkRequest setManagerEmployeeIdListShrink(String managerEmployeeIdListShrink) {
        this.managerEmployeeIdListShrink = managerEmployeeIdListShrink;
        return this;
    }
    public String getManagerEmployeeIdListShrink() {
        return this.managerEmployeeIdListShrink;
    }

    public UpdateDepartmentShrinkRequest setOutDeptId(String outDeptId) {
        this.outDeptId = outDeptId;
        return this;
    }
    public String getOutDeptId() {
        return this.outDeptId;
    }

    public UpdateDepartmentShrinkRequest setOutDeptPid(String outDeptPid) {
        this.outDeptPid = outDeptPid;
        return this;
    }
    public String getOutDeptPid() {
        return this.outDeptPid;
    }

}
