// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetRolesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetRolesResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRolesResponseBody self = new GetRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRolesResponseBody setData(java.util.List<GetRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRolesResponseBodyData> getData() {
        return this.data;
    }

    public GetRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRolesResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleId")
        public Long roleId;

        public static GetRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRolesResponseBodyData self = new GetRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRolesResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetRolesResponseBodyData setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public GetRolesResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetRolesResponseBodyData setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

    }

}
