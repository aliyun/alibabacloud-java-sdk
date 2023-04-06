// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForOrganizationalUnitResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

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
         * <p>应用的唯一标识。</p>
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
