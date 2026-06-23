// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectMemberResponseBody extends TeaModel {
    /**
     * <p>The details of the Workspace member.</p>
     */
    @NameInMap("ProjectMember")
    public GetProjectMemberResponseBodyProjectMember projectMember;

    /**
     * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMemberResponseBody self = new GetProjectMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectMemberResponseBody setProjectMember(GetProjectMemberResponseBodyProjectMember projectMember) {
        this.projectMember = projectMember;
        return this;
    }
    public GetProjectMemberResponseBodyProjectMember getProjectMember() {
        return this.projectMember;
    }

    public GetProjectMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectMemberResponseBodyProjectMemberRoles extends TeaModel {
        /**
         * <p>The code of the Workspace role.</p>
         * <p>The built-in system roles in a DataWorks Workspace include:</p>
         * <ul>
         * <li><p>role_project_admin: Workspace Administrator</p>
         * </li>
         * <li><p>role_project_dev: Developer</p>
         * </li>
         * <li><p>role_project_dg_admin: Data Governance Administrator</p>
         * </li>
         * <li><p>role_project_guest: Guest</p>
         * </li>
         * <li><p>role_project_security: Security Administrator</p>
         * </li>
         * <li><p>role_project_deploy: Deployment</p>
         * </li>
         * <li><p>role_project_owner: Workspace Owner</p>
         * </li>
         * <li><p>role_project_data_analyst: Data Analyst</p>
         * </li>
         * <li><p>role_project_pe: O\&amp;M (Operations &amp; Maintenance)</p>
         * </li>
         * <li><p>role_project_erd: Model Designer</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the Workspace role.</p>
         * 
         * <strong>example:</strong>
         * <p>Visitors</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the Workspace role.</p>
         * <ul>
         * <li><p>UserCustom: A user-defined role.</p>
         * </li>
         * <li><p>System: A built-in System Role.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProjectMemberResponseBodyProjectMemberRoles build(java.util.Map<String, ?> map) throws Exception {
            GetProjectMemberResponseBodyProjectMemberRoles self = new GetProjectMemberResponseBodyProjectMemberRoles();
            return TeaModel.build(map, self);
        }

        public GetProjectMemberResponseBodyProjectMemberRoles setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetProjectMemberResponseBodyProjectMemberRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectMemberResponseBodyProjectMemberRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetProjectMemberResponseBodyProjectMember extends TeaModel {
        /**
         * <p>The ID of the Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>88757</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Roles assigned to the Workspace member.</p>
         */
        @NameInMap("Roles")
        public java.util.List<GetProjectMemberResponseBodyProjectMemberRoles> roles;

        /**
         * <p>The status of the Workspace member.</p>
         * <ul>
         * <li><p>Normal: The member is active.</p>
         * </li>
         * <li><p>Disabled: The member is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>123422344899</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetProjectMemberResponseBodyProjectMember build(java.util.Map<String, ?> map) throws Exception {
            GetProjectMemberResponseBodyProjectMember self = new GetProjectMemberResponseBodyProjectMember();
            return TeaModel.build(map, self);
        }

        public GetProjectMemberResponseBodyProjectMember setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetProjectMemberResponseBodyProjectMember setRoles(java.util.List<GetProjectMemberResponseBodyProjectMemberRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetProjectMemberResponseBodyProjectMemberRoles> getRoles() {
            return this.roles;
        }

        public GetProjectMemberResponseBodyProjectMember setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectMemberResponseBodyProjectMember setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetProjectMemberResponseBodyProjectMember setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
