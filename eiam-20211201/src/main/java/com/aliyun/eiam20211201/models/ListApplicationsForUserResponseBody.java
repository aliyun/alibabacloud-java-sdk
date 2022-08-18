// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForUserResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("HasDirectAuthorization")
        public Boolean hasDirectAuthorization;

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
