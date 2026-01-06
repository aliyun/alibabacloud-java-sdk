// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <p>The applications that the EIAM organization can access.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplications> applications;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsForOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForOrganizationalUnitResponseBody self = new ListApplicationsForOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForOrganizationalUnitResponseBody setApplications(java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsForOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForOrganizationalUnitResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles extends TeaModel {
        /**
         * <p>应用角色标识。</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        public static ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles self = new ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

    }

    public static class ListApplicationsForOrganizationalUnitResponseBodyApplications extends TeaModel {
        /**
         * <p>The ID of the application that the EIAM organization can access.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>应用角色列表。</p>
         */
        @NameInMap("ApplicationRoles")
        public java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles> applicationRoles;

        public static ListApplicationsForOrganizationalUnitResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForOrganizationalUnitResponseBodyApplications self = new ListApplicationsForOrganizationalUnitResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForOrganizationalUnitResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForOrganizationalUnitResponseBodyApplications setApplicationRoles(java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplicationsApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

    }

}
