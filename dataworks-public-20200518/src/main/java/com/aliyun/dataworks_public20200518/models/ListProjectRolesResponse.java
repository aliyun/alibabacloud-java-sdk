// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectRolesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProjectRoleList")
    @Validation(required = true)
    public java.util.List<ListProjectRolesResponseProjectRoleList> projectRoleList;

    public static ListProjectRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesResponse self = new ListProjectRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectRolesResponse setProjectRoleList(java.util.List<ListProjectRolesResponseProjectRoleList> projectRoleList) {
        this.projectRoleList = projectRoleList;
        return this;
    }
    public java.util.List<ListProjectRolesResponseProjectRoleList> getProjectRoleList() {
        return this.projectRoleList;
    }

    public static class ListProjectRolesResponseProjectRoleList extends TeaModel {
        @NameInMap("ProjectRoleCode")
        @Validation(required = true)
        public String projectRoleCode;

        @NameInMap("ProjectRoleId")
        @Validation(required = true)
        public Integer projectRoleId;

        @NameInMap("ProjectRoleName")
        @Validation(required = true)
        public String projectRoleName;

        @NameInMap("ProjectRoleType")
        @Validation(required = true)
        public String projectRoleType;

        public static ListProjectRolesResponseProjectRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRolesResponseProjectRoleList self = new ListProjectRolesResponseProjectRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectRolesResponseProjectRoleList setProjectRoleCode(String projectRoleCode) {
            this.projectRoleCode = projectRoleCode;
            return this;
        }
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

        public ListProjectRolesResponseProjectRoleList setProjectRoleId(Integer projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        public ListProjectRolesResponseProjectRoleList setProjectRoleName(String projectRoleName) {
            this.projectRoleName = projectRoleName;
            return this;
        }
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        public ListProjectRolesResponseProjectRoleList setProjectRoleType(String projectRoleType) {
            this.projectRoleType = projectRoleType;
            return this;
        }
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

    }

}
