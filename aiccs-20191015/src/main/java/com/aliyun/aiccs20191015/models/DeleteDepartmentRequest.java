// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteDepartmentRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 部门id
    @NameInMap("DepartmentId")
    public Long departmentId;

    public static DeleteDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDepartmentRequest self = new DeleteDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDepartmentRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

}
