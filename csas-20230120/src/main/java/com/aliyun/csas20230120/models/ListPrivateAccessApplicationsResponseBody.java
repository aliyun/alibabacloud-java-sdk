// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> applications;

    /**
     * <strong>example:</strong>
     * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListPrivateAccessApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsResponseBody self = new ListPrivateAccessApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsResponseBody setApplications(java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListPrivateAccessApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListPrivateAccessApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateAccessApplicationsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges extends TeaModel {
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

        public static ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges self = new ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListPrivateAccessApplicationsResponseBodyApplications extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("BrowserAccessStatus")
        public String browserAccessStatus;

        @NameInMap("ConnectorIds")
        public java.util.List<String> connectorIds;

        /**
         * <strong>example:</strong>
         * <p>2022-12-16 15:03:42</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("L7ProxyDomainAutomatic")
        public String l7ProxyDomainAutomatic;

        @NameInMap("L7ProxyDomainCustom")
        public String l7ProxyDomainCustom;

        /**
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("PortRanges")
        public java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> portRanges;

        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        public static ListPrivateAccessApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsResponseBodyApplications self = new ListPrivateAccessApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setBrowserAccessStatus(String browserAccessStatus) {
            this.browserAccessStatus = browserAccessStatus;
            return this;
        }
        public String getBrowserAccessStatus() {
            return this.browserAccessStatus;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setConnectorIds(java.util.List<String> connectorIds) {
            this.connectorIds = connectorIds;
            return this;
        }
        public java.util.List<String> getConnectorIds() {
            return this.connectorIds;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setL7ProxyDomainAutomatic(String l7ProxyDomainAutomatic) {
            this.l7ProxyDomainAutomatic = l7ProxyDomainAutomatic;
            return this;
        }
        public String getL7ProxyDomainAutomatic() {
            return this.l7ProxyDomainAutomatic;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
            this.l7ProxyDomainCustom = l7ProxyDomainCustom;
            return this;
        }
        public String getL7ProxyDomainCustom() {
            return this.l7ProxyDomainCustom;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setPortRanges(java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationsResponseBodyApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateAccessApplicationsResponseBodyApplications setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

    }

}
