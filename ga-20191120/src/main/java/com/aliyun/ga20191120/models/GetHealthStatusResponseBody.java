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
     * <ul>
     * <li><strong>normal</strong></li>
     * <li><strong>abnormal</strong></li>
     * <li><strong>partiallyAbnormal</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the listener.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
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
         * 
         * <strong>example:</strong>
         * <p>47.0.XX.XX</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The health check details of the endpoint.</p>
         * <blockquote>
         * <p> This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("HealthDetail")
        public String healthDetail;

        /**
         * <p>The health status of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>init:</strong> The endpoint is being initialized.</li>
         * <li><strong>normal:</strong> The endpoint is normal.</li>
         * <li><strong>abnormal:</strong> The endpoint is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The port that is used to connect to the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Domain:</strong> a custom domain name.</li>
         * <li><strong>Ip:</strong> a custom IP address.</li>
         * <li><strong>PublicIp:</strong> a public IP address provided by Alibaba Cloud.</li>
         * <li><strong>ECS:</strong> an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>SLB:</strong> a Classic Load Balancer (CLB) instance.</li>
         * <li><strong>ALB:</strong> an Application Load Balancer (ALB) instance.</li>
         * <li><strong>OSS:</strong> an Object Storage Service (OSS) bucket.</li>
         * <li><strong>ENI:</strong> an elastic network interface (ENI).</li>
         * <li><strong>NLB:</strong> a Network Load Balancer (NLB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ip</p>
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
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The type of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>default:</strong> the default endpoint group.</li>
         * <li><strong>virtual:</strong> a virtual endpoint group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
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
         * <ul>
         * <li><strong>init:</strong> The endpoint group is being initialized.</li>
         * <li><strong>normal:</strong> The endpoint group is normal.</li>
         * <li><strong>abnormal:</strong> The endpoint group is abnormal.</li>
         * <li><strong>partiallyAbnormal:</strong> The endpoint group is partially abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
