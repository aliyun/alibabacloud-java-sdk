// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateDepartmentRequest extends TeaModel {
    /**
     * <p>Department name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>部门A</p>
     */
    @NameInMap("DepartmentName")
    public String departmentName;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentRequest self = new CreateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentRequest setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }

    public CreateDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
