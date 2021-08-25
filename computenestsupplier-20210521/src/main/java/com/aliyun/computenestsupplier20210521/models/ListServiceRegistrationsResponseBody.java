// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ServiceRegistrations")
    public java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> serviceRegistrations;

    public static ListServiceRegistrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsResponseBody self = new ListServiceRegistrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRegistrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceRegistrationsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public ListServiceRegistrationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRegistrationsResponseBody setServiceRegistrations(java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> serviceRegistrations) {
        this.serviceRegistrations = serviceRegistrations;
        return this;
    }
    public java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> getServiceRegistrations() {
        return this.serviceRegistrations;
    }

    public static class ListServiceRegistrationsResponseBodyServiceRegistrations extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RegistrationId")
        public String registrationId;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static ListServiceRegistrationsResponseBodyServiceRegistrations build(java.util.Map<String, ?> map) throws Exception {
            ListServiceRegistrationsResponseBodyServiceRegistrations self = new ListServiceRegistrationsResponseBodyServiceRegistrations();
            return TeaModel.build(map, self);
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public String getRegistrationId() {
            return this.registrationId;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

}
