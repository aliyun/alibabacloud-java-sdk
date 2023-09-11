// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListCustomRoutingEndpointTrafficPoliciesResponseBody extends TeaModel {
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
     * <p>The list of traffic policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies> policies;

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
         * <p>The first port of the port range used by the traffic destination to process requests.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The last port of the port range used by the traffic destination to process requests.</p>
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

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos extends TeaModel {
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
         * <br>
         * <p>- **true**：托管策略动作被托管，用户无权在托管实例下执行Action指定的操作。</p>
         * <br>
         * <p>- **false**：托管策略动作未被托管，用户可在托管实例下执行Action指定的操作。</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos self = new ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The ID of the GA instance with which the endpoint is associated.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The IP address of the traffic destination.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The ID of the endpoint group to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        /**
         * <p>The ID of the endpoint to which the traffic destination belongs.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the custom routing listener with which the endpoint is associated.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The traffic policy ID.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The port range of the traffic policy.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesPortRanges> portRanges;

        /**
         * <p>托管实例所属的服务方ID。</p>
         * <p>> 仅在**ServiceManaged**参数为**True**时有效。</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>是否为托管实例。取值：  </p>
         * <br>
         * <p>- true：是托管资实例。  </p>
         * <br>
         * <p>- false：不是托管实例。</p>
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
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> serviceManagedInfos;

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

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListCustomRoutingEndpointTrafficPoliciesResponseBodyPolicies setServiceManagedInfos(java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListCustomRoutingEndpointTrafficPoliciesResponseBodyPoliciesServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

    }

}
