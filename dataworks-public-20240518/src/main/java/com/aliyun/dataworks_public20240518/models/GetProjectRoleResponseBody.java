// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRoleResponseBody extends TeaModel {
    @NameInMap("ProjectRole")
    public GetProjectRoleResponseBodyProjectRole projectRole;

    /**
     * <strong>example:</strong>
     * <p>82F28E60-CF48-5EDF-AB25-D806847B97D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRoleResponseBody self = new GetProjectRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectRoleResponseBody setProjectRole(GetProjectRoleResponseBodyProjectRole projectRole) {
        this.projectRole = projectRole;
        return this;
    }
    public GetProjectRoleResponseBodyProjectRole getProjectRole() {
        return this.projectRole;
    }

    public GetProjectRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectRoleResponseBodyProjectRole extends TeaModel {
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
         * <p>10002</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProjectRoleResponseBodyProjectRole build(java.util.Map<String, ?> map) throws Exception {
            GetProjectRoleResponseBodyProjectRole self = new GetProjectRoleResponseBodyProjectRole();
            return TeaModel.build(map, self);
        }

        public GetProjectRoleResponseBodyProjectRole setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetProjectRoleResponseBodyProjectRole setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectRoleResponseBodyProjectRole setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetProjectRoleResponseBodyProjectRole setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
