// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class UpdateDepartmentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dept_name")
    public String deptName;

    @NameInMap("manager_employee_id_list")
    public java.util.List<String> managerEmployeeIdList;

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

    public static UpdateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentRequest self = new UpdateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentRequest setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }
    public String getDeptName() {
        return this.deptName;
    }

    public UpdateDepartmentRequest setManagerEmployeeIdList(java.util.List<String> managerEmployeeIdList) {
        this.managerEmployeeIdList = managerEmployeeIdList;
        return this;
    }
    public java.util.List<String> getManagerEmployeeIdList() {
        return this.managerEmployeeIdList;
    }

    public UpdateDepartmentRequest setOutDeptId(String outDeptId) {
        this.outDeptId = outDeptId;
        return this;
    }
    public String getOutDeptId() {
        return this.outDeptId;
    }

    public UpdateDepartmentRequest setOutDeptPid(String outDeptPid) {
        this.outDeptPid = outDeptPid;
        return this;
    }
    public String getOutDeptPid() {
        return this.outDeptPid;
    }

}
