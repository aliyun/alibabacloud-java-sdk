// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>A list of private access policies.</p>
     */
    @NameInMap("Polices")
    public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolices> polices;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The start port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port.</p>
         * 
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
        /**
         * <p>A collection of private access application addresses.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The ID of the private access application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-7a9243dd02f4****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the private access application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the private access application.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条被内网访问策略引用的内网访问应用</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the private access application.</p>
         * 
         * <strong>example:</strong>
         * <p>application_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A collection of port ranges for the private access application.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplicationsPortRanges> portRanges;

        /**
         * <p>The protocol of the private access application. Valid values:</p>
         * <ul>
         * <li><p><strong>All</strong>: All protocols.</p>
         * </li>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The status of the private access application. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The application is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The application is disabled.</p>
         * </li>
         * </ul>
         * 
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
        /**
         * <p>A collection of private access applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListApplicationsForPrivateAccessPolicyResponseBodyPolicesApplications> applications;

        /**
         * <p>The policy ID.</p>
         * 
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
