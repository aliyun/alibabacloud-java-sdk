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

    public static class ListApplicationsForOrganizationalUnitResponseBodyApplications extends TeaModel {
        /**
         * <p>The ID of the application that the EIAM organization can access.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

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

    }

}
