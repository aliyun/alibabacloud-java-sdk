// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("Polices")
    public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolices> polices;

    /**
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationsForPrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessPolicyResponseBody self = new ListApplicationsForPrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessPolicyResponseBody setPolices(java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListApplicationsForPrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges self = new ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <strong>example:</strong>
         * <p>pa-application-7a9243dd02f4****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>application_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PortRanges")
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges> portRanges;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications self = new ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setPortRanges(java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListApplicationsForPrivateAccessPolicyResponseBodyPolices extends TeaModel {
        @NameInMap("Applications")
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications> applications;

        /**
         * <strong>example:</strong>
         * <p>pa-policy-1b0d0e8b4bcf****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        public static ListApplicationsForPrivateAccessPolicyResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForPrivateAccessPolicyResponseBodyPolices self = new ListApplicationsForPrivateAccessPolicyResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolices setApplications(java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications> getApplications() {
            return this.applications;
        }

        public ListApplicationsForPrivateAccessPolicyResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

    }

}
