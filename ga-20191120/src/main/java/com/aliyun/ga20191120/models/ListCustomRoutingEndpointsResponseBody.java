// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointsResponseBody extends TeaModel {
    /**
     * <p>Information about the endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomRoutingEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomRoutingEndpointsResponseBody self = new ListCustomRoutingEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomRoutingEndpointsResponseBody setEndpoints(java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListCustomRoutingEndpointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomRoutingEndpointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomRoutingEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomRoutingEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos extends TeaModel {
        /**
         * <p>托管策略动作名称，取值：</p>
         * <p>- **Create**：创建实例。</p>
         * <p>- **Update**：更新当前实例。</p>
         * <p>- **Delete**：删除当前实例。</p>
         * <p>- **Associate**：引用/被引用当前实例。</p>
         * <p>- **UserUnmanaged**：用户解托管实例。</p>
         * <p>- **CreateChild**：在当前实例下创建子资源。</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>子资源类型，取值：</p>
         * <br>
         * <p>- **Listener**：监听资源。</p>
         * <br>
         * <p>- **IpSet**：加速地域资源。</p>
         * <br>
         * <p>- **EndpointGroup**：终端节点组资源。</p>
         * <br>
         * <p>- **ForwardingRule**：转发策略资源。</p>
         * <br>
         * <p>- **Endpoint**：终端节点资源。</p>
         * <br>
         * <p>- **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。</p>
         * <br>
         * <p>- **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。</p>
         * <br>
         * <p>> 仅在**Action**参数为**CreateChild**时有效。</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>托管策略动作是否被托管，取值：</p>
         * <p>- **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。</p>
         * <p>- **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos self = new ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListCustomRoutingEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The ID of the GA instance with which the endpoint is associated.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The name of the vSwitch that is specified as an endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The endpoint ID.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the listener to which the endpoint belongs.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>托管实例所属的服务方ID。</p>
         * <br>
         * <p>> 仅在**ServiceManaged**参数为**True**时有效。</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>是否为托管实例。取值：</p>
         * <br>
         * <p>- **true**：是托管资实例。</p>
         * <br>
         * <p>- **false**：不是托管实例。</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>用户在此托管实例下可执行的动作策略列表。</p>
         * <br>
         * <p>> 仅在**ServiceManaged**参数为**True**时有效。</p>
         * <p>> - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The access policy of traffic that is destinated for the endpoint. Valid values:</p>
         * <br>
         * <p>*   **AllowAll:** allows all traffic to the endpoint.</p>
         * <p>*   **DenyAll:** denies all traffic to the endpoint.</p>
         * <p>*   **AllowCustom:** allows traffic only to specified destinations.</p>
         */
        @NameInMap("TrafficToEndpointPolicy")
        public String trafficToEndpointPolicy;

        /**
         * <p>The backend service type of the endpoint.</p>
         * <br>
         * <p>**PrivateSubNet** is returned, which indicates a private CIDR block.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCustomRoutingEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointsResponseBodyEndpoints self = new ListCustomRoutingEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setServiceManagedInfos(java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointsResponseBodyEndpointsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setTrafficToEndpointPolicy(String trafficToEndpointPolicy) {
            this.trafficToEndpointPolicy = trafficToEndpointPolicy;
            return this;
        }
        public String getTrafficToEndpointPolicy() {
            return this.trafficToEndpointPolicy;
        }

        public ListCustomRoutingEndpointsResponseBodyEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
