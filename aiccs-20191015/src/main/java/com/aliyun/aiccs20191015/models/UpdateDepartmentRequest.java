// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateDepartmentRequest extends TeaModel {
    /**
     * <p>The department ID.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/2717975.html">GetAllDepartment</a> API and view the <strong>DepartmentId</strong> field in the response to obtain the department ID.</p>
     * <blockquote>
     * <p>This parameter does not support updates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The department name.</p>
     * <blockquote>
     * <p>This parameter supports updates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>部门A</p>
     */
    @NameInMap("DepartmentName")
    public String departmentName;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDepartmentRequest self = new UpdateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDepartmentRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public UpdateDepartmentRequest setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }

    public UpdateDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
