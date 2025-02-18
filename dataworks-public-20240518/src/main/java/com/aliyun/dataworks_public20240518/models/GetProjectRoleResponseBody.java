// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRoleResponseBody extends TeaModel {
    /**
     * <p>The role in the DataWorks workspace.</p>
     */
    @NameInMap("ProjectRole")
    public GetProjectRoleResponseBodyProjectRole projectRole;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The code of the role in the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>role_project_guest</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the role in the DataWorks workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Visitors</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The type of the role in the DataWorks workspace. Valid values:</p>
         * <ul>
         * <li>UserCustom: user-defined role</li>
         * <li>System: system role</li>
         * </ul>
         * 
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
