// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteDepartmentRequest extends TeaModel {
    /**
     * <p>The department ID.  </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API and check the <strong>DepartmentId</strong> field in the response to obtain the department ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentRequest self = new DeleteDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public DeleteDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
