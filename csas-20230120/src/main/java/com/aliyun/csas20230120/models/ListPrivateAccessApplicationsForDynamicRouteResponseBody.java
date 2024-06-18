// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsForDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRoutes")
    public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes> dynamicRoutes;

    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateAccessApplicationsForDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsForDynamicRouteResponseBody self = new ListPrivateAccessApplicationsForDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsForDynamicRouteResponseBody setDynamicRoutes(java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes> dynamicRoutes) {
        this.dynamicRoutes = dynamicRoutes;
        return this;
    }
    public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    public ListPrivateAccessApplicationsForDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges extends TeaModel {
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

        public static ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges self = new ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications extends TeaModel {
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
         * <p>2022-04-13 13:33:24</p>
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
        public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges> portRanges;

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

        public static ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications self = new ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setPortRanges(java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplicationsPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes extends TeaModel {
        @NameInMap("Applications")
        public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications> applications;

        /**
         * <strong>example:</strong>
         * <p>dr-ca9fddfac7c6****</p>
         */
        @NameInMap("DynamicRouteId")
        public String dynamicRouteId;

        public static ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes self = new ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes setApplications(java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutesApplications> getApplications() {
            return this.applications;
        }

        public ListPrivateAccessApplicationsForDynamicRouteResponseBodyDynamicRoutes setDynamicRouteId(String dynamicRouteId) {
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

    }

}
