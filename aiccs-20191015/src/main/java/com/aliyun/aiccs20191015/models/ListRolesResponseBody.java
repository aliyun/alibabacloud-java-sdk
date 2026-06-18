// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>Role information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListRolesResponseBodyData> data;

    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BuId")
        public Long buId;

        /**
         * <p>Role code.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Creation Time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-03T20:25:33Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Role description.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>ID of the group to which the role belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RoleGroupId")
        public Long roleGroupId;

        /**
         * <p>Name of the role group to which the role belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>角色组名称</p>
         */
        @NameInMap("RoleGroupName")
        public String roleGroupName;

        /**
         * <p>Role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RoleId")
        public Long roleId;

        /**
         * <p>Role name.</p>
         * 
         * <strong>example:</strong>
         * <p>企业管理员</p>
         */
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
