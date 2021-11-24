// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetHealthStatusResponseBody extends TeaModel {
    @NameInMap("EndpointGroups")
    public java.util.List<GetHealthStatusResponseBodyEndpointGroups> endpointGroups;

    @NameInMap("HealthStatus")
    public String healthStatus;

    @NameInMap("ListenerId")
    public String listenerId;

    // Id of the request
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
        @NameInMap("Address")
        public String address;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("HealthDetail")
        public String healthDetail;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("Port")
        public Long port;

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
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        @NameInMap("EndpointGroupType")
        public String endpointGroupType;

        @NameInMap("Endpoints")
        public java.util.List<GetHealthStatusResponseBodyEndpointGroupsEndpoints> endpoints;

        @NameInMap("ForwardingRuleIds")
        public java.util.List<String> forwardingRuleIds;

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
