// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetHealthStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("EndpointGroups")
    public java.util.List<GetHealthStatusResponseBodyEndpointGroups> endpointGroups;

    public static GetHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthStatusResponseBody self = new GetHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHealthStatusResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetHealthStatusResponseBody setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public GetHealthStatusResponseBody setEndpointGroups(java.util.List<GetHealthStatusResponseBodyEndpointGroups> endpointGroups) {
        this.endpointGroups = endpointGroups;
        return this;
    }
    public java.util.List<GetHealthStatusResponseBodyEndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    public static class GetHealthStatusResponseBodyEndpointGroupsEndpoints extends TeaModel {
        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("Address")
        public String address;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("HealthDetail")
        public String healthDetail;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Type")
        public String type;

        public static GetHealthStatusResponseBodyEndpointGroupsEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetHealthStatusResponseBodyEndpointGroupsEndpoints self = new GetHealthStatusResponseBodyEndpointGroupsEndpoints();
            return TeaModel.build(map, self);
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public GetHealthStatusResponseBodyEndpointGroupsEndpoints setHealthDetail(String healthDetail) {
            this.healthDetail = healthDetail;
            return this;
        }
        public String getHealthDetail() {
            return this.healthDetail;
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
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

        @NameInMap("Endpoints")
        public java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> endpoints;

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

        public GetHealthStatusResponseBodyEndpointGroups setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public GetHealthStatusResponseBodyEndpointGroups setForwardingRuleIds(java.util.List<String> forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }
        public java.util.List<String> getForwardingRuleIds() {
            return this.forwardingRuleIds;
        }

        public GetHealthStatusResponseBodyEndpointGroups setEndpoints(java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> getEndpoints() {
            return this.endpoints;
        }

    }

}
