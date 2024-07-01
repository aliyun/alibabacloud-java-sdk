// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddDepartmentShrinkRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>dept456</p>
     */
    @NameInMap("out_dept_pid")
    public String outDeptPid;

    public static AddDepartmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDepartmentShrinkRequest self = new AddDepartmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddDepartmentShrinkRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public AddDepartmentShrinkRequest setManagerEmployeeIdListShrink(String managerEmployeeIdListShrink) {
        this.managerEmployeeIdListShrink = managerEmployeeIdListShrink;
        return this;
    }
    public String getManagerEmployeeIdListShrink() {
        return this.managerEmployeeIdListShrink;
    }

    public AddDepartmentShrinkRequest setOutDeptId(String outDeptId) {
        this.outDeptId = outDeptId;
        return this;
    }
    public String getOutDeptId() {
        return this.outDeptId;
    }

    public AddDepartmentShrinkRequest setOutDeptPid(String outDeptPid) {
        this.outDeptPid = outDeptPid;
        return this;
    }
    public String getOutDeptPid() {
        return this.outDeptPid;
    }

}
