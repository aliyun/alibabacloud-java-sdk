// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class DeleteUserDepartmentsRequest extends TeaModel {
    @NameInMap("UserId")
    @Validation(required = true)
    public java.util.List<String> userId;

    @NameInMap("DepartmentId")
    @Validation(required = true)
    public java.util.List<String> departmentId;

    public static DeleteUserDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDepartmentsRequest self = new DeleteUserDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDepartmentsRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

    public DeleteUserDepartmentsRequest setDepartmentId(java.util.List<String> departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public java.util.List<String> getDepartmentId() {
        return this.departmentId;
    }

}
