// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateUserDepartmentsRequest extends TeaModel {
    @NameInMap("UserId")
    public java.util.List<String> userId;

    @NameInMap("DepartmentId")
    public java.util.List<String> departmentId;

    public static CreateUserDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDepartmentsRequest self = new CreateUserDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserDepartmentsRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

    public CreateUserDepartmentsRequest setDepartmentId(java.util.List<String> departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public java.util.List<String> getDepartmentId() {
        return this.departmentId;
    }

}
