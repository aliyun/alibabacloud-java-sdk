// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsResponseBody extends TeaModel {
    /**
     * <p>Number of items per page in a paginated query. The maximum is 100, and the default is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Service registration information.</p>
     */
    @NameInMap("ServiceRegistrations")
    public java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> serviceRegistrations;

    /**
     * <p>Total number of records that meet the criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceRegistrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsResponseBody self = new ListServiceRegistrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
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

    public ListServiceRegistrationsResponseBody setServiceRegistrations(java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> serviceRegistrations) {
        this.serviceRegistrations = serviceRegistrations;
        return this;
    }
    public java.util.List<ListServiceRegistrationsResponseBodyServiceRegistrations> getServiceRegistrations() {
        return this.serviceRegistrations;
    }

    public ListServiceRegistrationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceRegistrationsResponseBodyServiceRegistrations extends TeaModel {
        /**
         * <p>Comment.</p>
         * 
         * <strong>example:</strong>
         * <p>some info is missing</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Finish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T00:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>Registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-001</p>
         */
        @NameInMap("RegistrationId")
        public String registrationId;

        /**
         * <p>Service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-f4c0026a254bxxxxxxxx</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Registration status. Allowed values:</p>
         * <ul>
         * <li><p>Submitted</p>
         * </li>
         * <li><p>Approved</p>
         * </li>
         * <li><p>Rejected</p>
         * </li>
         * <li><p>Canceled</p>
         * </li>
         * <li><p>Executed</p>
         * </li>
         * <li><p>Executed: Executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rejected</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Submit time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-22T00:00:00Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        public static ListServiceRegistrationsResponseBodyServiceRegistrations build(java.util.Map<String, ?> map) throws Exception {
            ListServiceRegistrationsResponseBodyServiceRegistrations self = new ListServiceRegistrationsResponseBodyServiceRegistrations();
            return TeaModel.build(map, self);
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setRegistrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public String getRegistrationId() {
            return this.registrationId;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServiceRegistrationsResponseBodyServiceRegistrations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
