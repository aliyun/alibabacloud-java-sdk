// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateUserDepartmentsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DepartmentId")
    public java.util.List<String> departmentId;

    @NameInMap("UserId")
    public java.util.List<String> userId;

    public static CreateUserDepartmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDepartmentsRequest self = new CreateUserDepartmentsRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserDepartmentsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateUserDepartmentsRequest setDepartmentId(java.util.List<String> departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public java.util.List<String> getDepartmentId() {
        return this.departmentId;
    }

    public CreateUserDepartmentsRequest setUserId(java.util.List<String> userId) {
        this.userId = userId;
        return this;
    }
    public java.util.List<String> getUserId() {
        return this.userId;
    }

}
