// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleId")
    public Integer roleId;

    public static InsertRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertRoleResponseBody self = new InsertRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertRoleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertRoleResponseBody setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
    public Integer getRoleId() {
        return this.roleId;
    }

}
