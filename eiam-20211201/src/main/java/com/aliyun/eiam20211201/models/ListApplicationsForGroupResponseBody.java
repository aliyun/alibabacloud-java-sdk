// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForGroupResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForGroupResponseBodyApplications> applications;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsForGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForGroupResponseBody self = new ListApplicationsForGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForGroupResponseBody setApplications(java.util.List<ListApplicationsForGroupResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsForGroupResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsForGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForGroupResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForGroupResponseBodyApplicationsApplicationRoles extends TeaModel {
        /**
         * <p>应用角色标识。</p>
         * 
         * <strong>example:</strong>
         * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
         */
        @NameInMap("ApplicationRoleId")
        public String applicationRoleId;

        public static ListApplicationsForGroupResponseBodyApplicationsApplicationRoles build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForGroupResponseBodyApplicationsApplicationRoles self = new ListApplicationsForGroupResponseBodyApplicationsApplicationRoles();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForGroupResponseBodyApplicationsApplicationRoles setApplicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

    }

    public static class ListApplicationsForGroupResponseBodyApplications extends TeaModel {
        /**
         * <p>应用的唯一标识。</p>
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
        public java.util.List<ListApplicationsForGroupResponseBodyApplicationsApplicationRoles> applicationRoles;

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

        public static ListApplicationsForGroupResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForGroupResponseBodyApplications self = new ListApplicationsForGroupResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForGroupResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForGroupResponseBodyApplications setApplicationRoles(java.util.List<ListApplicationsForGroupResponseBodyApplicationsApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }
        public java.util.List<ListApplicationsForGroupResponseBodyApplicationsApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        public ListApplicationsForGroupResponseBodyApplications setHasDirectAuthorization(Boolean hasDirectAuthorization) {
            this.hasDirectAuthorization = hasDirectAuthorization;
            return this;
        }
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        public ListApplicationsForGroupResponseBodyApplications setHasInheritAuthorization(Boolean hasInheritAuthorization) {
            this.hasInheritAuthorization = hasInheritAuthorization;
            return this;
        }
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

    }

}
