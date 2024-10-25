// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectMemberResponseBody extends TeaModel {
    @NameInMap("ProjectMember")
    public GetProjectMemberResponseBodyProjectMember projectMember;

    /**
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
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>88757</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Roles")
        public java.util.List<GetProjectMemberResponseBodyProjectMemberRoles> roles;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123422344899</p>
         */
        @NameInMap("UserId")
        public String userId;

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

    }

}
