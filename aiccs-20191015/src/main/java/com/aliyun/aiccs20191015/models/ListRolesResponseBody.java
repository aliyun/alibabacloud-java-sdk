// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public java.util.List<ListRolesResponseBodyData> data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setData(java.util.List<ListRolesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRolesResponseBodyData> getData() {
        return this.data;
    }

    public ListRolesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRolesResponseBodyData extends TeaModel {
        // 租户id
        @NameInMap("BuId")
        public Long buId;

        // 角色code
        @NameInMap("Code")
        public String code;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 角色描述
        @NameInMap("Description")
        public String description;

        // 所属角色组id
        @NameInMap("RoleGroupId")
        public Long roleGroupId;

        // 所属角色组名称
        @NameInMap("RoleGroupName")
        public String roleGroupName;

        // 角色id
        @NameInMap("RoleId")
        public Long roleId;

        // 角色名称
        @NameInMap("Title")
        public String title;

        public static ListRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyData self = new ListRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public ListRolesResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListRolesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRolesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRolesResponseBodyData setRoleGroupId(Long roleGroupId) {
            this.roleGroupId = roleGroupId;
            return this;
        }
        public Long getRoleGroupId() {
            return this.roleGroupId;
        }

        public ListRolesResponseBodyData setRoleGroupName(String roleGroupName) {
            this.roleGroupName = roleGroupName;
            return this;
        }
        public String getRoleGroupName() {
            return this.roleGroupName;
        }

        public ListRolesResponseBodyData setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

        public ListRolesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
