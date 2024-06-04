// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectRolesResponseBody extends TeaModel {
    /**
     * <p>The roles in the DataWorks workspace.</p>
     */
    @NameInMap("ProjectRoleList")
    public java.util.List<ListProjectRolesResponseBodyProjectRoleList> projectRoleList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRolesResponseBody self = new ListProjectRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectRolesResponseBody setProjectRoleList(java.util.List<ListProjectRolesResponseBodyProjectRoleList> projectRoleList) {
        this.projectRoleList = projectRoleList;
        return this;
    }
    public java.util.List<ListProjectRolesResponseBodyProjectRoleList> getProjectRoleList() {
        return this.projectRoleList;
    }

    public ListProjectRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectRolesResponseBodyProjectRoleList extends TeaModel {
        /**
         * <p>The code of the role in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectRoleCode")
        public String projectRoleCode;

        /**
         * <p>The ID of the role in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectRoleId")
        public Integer projectRoleId;

        /**
         * <p>The name of the role in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectRoleName")
        public String projectRoleName;

        /**
         * <p>The type of the role in the DataWorks workspace.</p>
         */
        @NameInMap("ProjectRoleType")
        public String projectRoleType;

        public static ListProjectRolesResponseBodyProjectRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectRolesResponseBodyProjectRoleList self = new ListProjectRolesResponseBodyProjectRoleList();
            return TeaModel.build(map, self);
        }

        public ListProjectRolesResponseBodyProjectRoleList setProjectRoleCode(String projectRoleCode) {
            this.projectRoleCode = projectRoleCode;
            return this;
        }
        public String getProjectRoleCode() {
            return this.projectRoleCode;
        }

        public ListProjectRolesResponseBodyProjectRoleList setProjectRoleId(Integer projectRoleId) {
            this.projectRoleId = projectRoleId;
            return this;
        }
        public Integer getProjectRoleId() {
            return this.projectRoleId;
        }

        public ListProjectRolesResponseBodyProjectRoleList setProjectRoleName(String projectRoleName) {
            this.projectRoleName = projectRoleName;
            return this;
        }
        public String getProjectRoleName() {
            return this.projectRoleName;
        }

        public ListProjectRolesResponseBodyProjectRoleList setProjectRoleType(String projectRoleType) {
            this.projectRoleType = projectRoleType;
            return this;
        }
        public String getProjectRoleType() {
            return this.projectRoleType;
        }

    }

}
