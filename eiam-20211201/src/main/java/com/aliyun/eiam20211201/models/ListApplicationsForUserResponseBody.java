// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserResponseBody extends TeaModel {
    /**
     * <p>The applications that the EIAM account can access.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForUserResponseBodyApplications> applications;

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
         * <p>应用角色标识。</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        /**
         * <p>直接分配给当前用户的权限，视为直接授权。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>通过用户隶属的组织、组获取的权限，视为继承权限。</p>
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
         * <p>The ID of the application that the EIAM account can access.</p>
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
        public java.util.List<ListApplicationsForUserResponseBodyApplicationsApplicationRoles> applicationRoles;

        /**
         * <p>Indicates whether the EIAM account has direct permissions on the application. Valid values:</p>
         * <ul>
         * <li>true: The EIAM account has direct permissions on the application.</li>
         * <li>false: The EIAM account does not have direct permissions on the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

        /**
         * <p>Indicates whether the EIAM account has inherited permissions on the application. Valid values:</p>
         * <ul>
         * <li>true: A parent organization or an organization to which the EIAM account belongs has direct permissions on the application.</li>
         * <li>false: A parent organization or an organization to which the EIAM account belongs does not have direct permissions on the application.</li>
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
