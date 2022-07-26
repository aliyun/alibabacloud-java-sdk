// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public Role role;

    @NameInMap("Success")
    public Boolean success;

    public static GetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponseBody self = new GetRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoleResponseBody setRole(Role role) {
        this.role = role;
        return this;
    }
    public Role getRole() {
        return this.role;
    }

    public GetRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
