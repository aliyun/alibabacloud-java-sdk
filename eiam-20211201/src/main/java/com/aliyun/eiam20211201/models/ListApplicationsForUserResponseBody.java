// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserResponseBody extends TeaModel {
    /**
     * <p>The list of applications that the account is authorized to access.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForUserResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForUserResponseBody self = new ListApplicationsForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForUserResponseBody setApplications(java.util.List<ListApplicationsForUserResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsForUserResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForUserResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForUserResponseBodyApplicationsApplicationRoles extends TeaModel {
        /**
         * <p>The ID of the application role.</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        /**
         * <p>Indicates whether the role is directly assigned to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>Indicates whether the role is inherited from an organization or a group to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasInheritAuthorization")
        public Boolean hasInheritAuthorization;

        public static ListApplicationsForUserResponseBodyApplicationsApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForUserResponseBodyApplicationsApplicationRoles self = new ListApplicationsForUserResponseBodyApplicationsApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForUserResponseBodyApplicationsApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

        public ListApplicationsForUserResponseBodyApplicationsApplicationRoles setHasDirectAuthorization(Boolean hasDirectAuthorization) {
            this.hasDirectAuthorization = hasDirectAuthorization;
            return this;
        }
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        public ListApplicationsForUserResponseBodyApplicationsApplicationRoles setHasInheritAuthorization(Boolean hasInheritAuthorization) {
            this.hasInheritAuthorization = hasInheritAuthorization;
            return this;
        }
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

    }

    public static class ListApplicationsForUserResponseBodyApplications extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The list of application roles.</p>
         */
        @NameInMap("ApplicationRoles")
        public java.util.List<ListApplicationsForUserResponseBodyApplicationsApplicationRoles> applicationRoles;

        /**
         * <p>Indicates whether a direct authorization exists. Valid values:</p>
         * <ul>
         * <li><p>true: A direct authorization record exists between the application and the account.</p>
         * </li>
         * <li><p>false: No direct authorization record exists between the application and the account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>Indicates whether an inherited authorization exists. Valid values:</p>
         * <ul>
         * <li><p>true: A direct authorization record exists between the application and a parent organization or a group to which the account belongs.</p>
         * </li>
         * <li><p>false: No direct authorization record exists between the application and any of the parent organizations or groups to which the account belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasInheritAuthorization")
        public Boolean hasInheritAuthorization;

        public static ListApplicationsForUserResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForUserResponseBodyApplications self = new ListApplicationsForUserResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForUserResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForUserResponseBodyApplications setApplicationRoles(java.util.List<ListApplicationsForUserResponseBodyApplicationsApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListApplicationsForUserResponseBodyApplicationsApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        public ListApplicationsForUserResponseBodyApplications setHasDirectAuthorization(Boolean hasDirectAuthorization) {
            this.hasDirectAuthorization = hasDirectAuthorization;
            return this;
        }
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        public ListApplicationsForUserResponseBodyApplications setHasInheritAuthorization(Boolean hasInheritAuthorization) {
            this.hasInheritAuthorization = hasInheritAuthorization;
            return this;
        }
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

    }

}
