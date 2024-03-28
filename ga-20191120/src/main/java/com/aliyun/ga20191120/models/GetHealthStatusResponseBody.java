// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The information about the endpoint groups.</p>
     */
    @NameInMap("EndpointGroups")
    public java.util.List<GetHealthStatusResponseBodyEndpointGroups> endpointGroups;

    /**
     * <p>The health status of endpoints and endpoint groups. Valid values:</p>
     * <br>
     * <p>*   **normal**</p>
     * <p>*   **abnormal**</p>
     * <p>*   **partiallyAbnormal**</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthStatusResponseBody self = new GetHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthStatusResponseBody setEndpointGroups(java.util.List<GetHealthStatusResponseBodyEndpointGroups> endpointGroups) {
        this.endpointGroups = endpointGroups;
        return this;
    }
    public java.util.List<GetHealthStatusResponseBodyEndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    public GetHealthStatusResponseBody setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public GetHealthStatusResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHealthStatusResponseBodyEndpointGroupsEndpoints extends TeaModel {
        /**
         * <p>The IP address of the endpoint.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The health check details of the endpoint.</p>
         * <br>
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("HealthDetail")
        public String healthDetail;

        /**
         * <p>The health status of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **init:** The endpoint is being initialized.</p>
         * <p>*   **normal:** The endpoint is normal.</p>
         * <p>*   **abnormal:** The endpoint is abnormal.</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The port that is used to connect to the endpoint.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Domain:** a custom domain name.</p>
         * <p>*   **Ip:** a custom IP address.</p>
         * <p>*   **PublicIp:** a public IP address provided by Alibaba Cloud.</p>
         * <p>*   **ECS:** an Elastic Compute Service (ECS) instance.</p>
         * <p>*   **SLB:** a Classic Load Balancer (CLB) instance.</p>
         * <p>*   **ALB:** an Application Load Balancer (ALB) instance.</p>
         * <p>*   **OSS:** an Object Storage Service (OSS) bucket.</p>
         * <p>*   **ENI:** an elastic network interface (ENI).</p>
         * <p>*   **NLB:** a Network Load Balancer (NLB) instance.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetHealthStatusResponseBodyEndpointGroupsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetHealthStatusResponseBodyEndpointGroupsEndpoints self = new GetHealthStatusResponseBodyEndpointGroupsEndpoints();
            return TeaModel.build(map, self);
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setHealthDetail(String healthDetail) {
            this.healthDetail = healthDetail;
            return this;
        }
        public String getHealthDetail() {
            return this.healthDetail;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetHealthStatusResponseBodyEndpointGroups extends TeaModel {
        /**
         * <p>The ID of the endpoint group.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The type of the endpoint group. Valid values:</p>
         * <br>
         * <p>*   **default:** the default endpoint group.</p>
         * <p>*   **virtual:** a virtual endpoint group.</p>
         */
        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        /**
         * <p>The information about the endpoints.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> endpoints;

        /**
         * <p>The IDs of the forwarding rules.</p>
         */
        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        /**
         * <p>The health status of the endpoint group. Valid values:</p>
         * <br>
         * <p>*   **init:** The endpoint group is being initialized.</p>
         * <p>*   **normal:** The endpoint group is normal.</p>
         * <p>*   **abnormal:** The endpoint group is abnormal.</p>
         * <p>*   **partiallyAbnormal:** The endpoint group is partially abnormal.</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        public static GetHealthStatusResponseBodyEndpointGroups build(java.util.Map<String, ?> map) throws Exception {
            GetHealthStatusResponseBodyEndpointGroups self = new GetHealthStatusResponseBodyEndpointGroups();
            return TeaModel.build(map, self);
        }

        public GetHealthStatusResponseBodyEndpointGroups setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public GetHealthStatusResponseBodyEndpointGroups setEndpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        public GetHealthStatusResponseBodyEndpointGroups setEndpoints(java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public GetHealthStatusResponseBodyEndpointGroups setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }
        public java.util.List<String> getForwardingRuleIds() {
            return this.forwardingRuleIds;
        }

        public GetHealthStatusResponseBodyEndpointGroups setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

    }

}
