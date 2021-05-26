// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryRolesByBuIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<QueryRolesByBuIdResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRolesByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRolesByBuIdResponseBody self = new QueryRolesByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRolesByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRolesByBuIdResponseBody setData(java.util.List<QueryRolesByBuIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryRolesByBuIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryRolesByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRolesByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRolesByBuIdResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("RoleCode")
        public String roleCode;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleId")
        public Long roleId;

        public static QueryRolesByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRolesByBuIdResponseBodyData self = new QueryRolesByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRolesByBuIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryRolesByBuIdResponseBodyData setRoleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public String getRoleCode() {
            return this.roleCode;
        }

        public QueryRolesByBuIdResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public QueryRolesByBuIdResponseBodyData setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

    }

}
