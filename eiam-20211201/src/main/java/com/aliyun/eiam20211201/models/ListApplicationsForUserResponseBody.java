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
