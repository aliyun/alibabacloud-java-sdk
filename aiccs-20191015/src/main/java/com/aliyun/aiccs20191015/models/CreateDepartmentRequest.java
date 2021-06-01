// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateDepartmentRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 部门名称
    @NameInMap("DepartmentName")
    public String departmentName;

    public static CreateDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDepartmentRequest self = new CreateDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDepartmentRequest setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }

}
