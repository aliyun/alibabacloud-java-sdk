// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of traffic policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingEndpointTrafficPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointTrafficPoliciesResponseBody self = new ListCustomRoutingEndpointTrafficPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setPolicies(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointTrafficPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges extends TeaModel {
        /**
         * <p>The first port of the port range.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the port range.</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The ID of the GA instance to which the endpoint belongs.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The IP address of the traffic policy.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint to which the traffic policy belongs.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the custom routing listener to which the endpoint belongs.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The ID of the traffic policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the traffic policy.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setPortRanges(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> getPortRanges() {
            return this.portRanges;
        }

    }

}
