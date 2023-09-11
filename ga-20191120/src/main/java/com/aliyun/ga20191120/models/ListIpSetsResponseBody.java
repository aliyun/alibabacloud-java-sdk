// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIpSetsResponseBody extends TeaModel {
    /**
     * <p>Details of the acceleration regions.</p>
     */
    @NameInMap("IpSets")
    public java.util.List<ListIpSetsResponseBodyIpSets> ipSets;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpSetsResponseBody self = new ListIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpSetsResponseBody setIpSets(java.util.List<ListIpSetsResponseBodyIpSets> ipSets) {
        this.ipSets = ipSets;
        return this;
    }
    public java.util.List<ListIpSetsResponseBodyIpSets> getIpSets() {
        return this.ipSets;
    }

    public ListIpSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIpSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpSetsResponseBodyIpSetsServiceManagedInfos extends TeaModel {
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
         * <p>- **Listener**：监听资源。</p>
         * <p>- **IpSet**：加速地域资源。</p>
         * <p>- **EndpointGroup**：终端节点组资源。</p>
         * <p>- **ForwardingRule**：转发策略资源。</p>
         * <p>- **Endpoint**：终端节点资源。</p>
         * <p>- **EndpointGroupDestination**：自定义路由监听下的终端节点组协议映射资源。</p>
         * <p>- **EndpointPolicy**：自定义路由监听下的终端节点通行策略资源。</p>
         * <p>> 仅在**Action**参数为**CreateChild**时有效</p>
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

        public static ListIpSetsResponseBodyIpSetsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListIpSetsResponseBodyIpSetsServiceManagedInfos self = new ListIpSetsResponseBodyIpSetsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListIpSetsResponseBodyIpSetsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListIpSetsResponseBodyIpSetsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListIpSetsResponseBodyIpSetsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListIpSetsResponseBodyIpSets extends TeaModel {
        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth that is allocated to the acceleration region. Unit: **Mbit/s**.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The list of accelerated IP addresses in the acceleration region.</p>
         */
        @NameInMap("IpAddressList")
        public java.util.List<String> ipAddressList;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The version of the IP protocol. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **BGP**: BGP (Multi-ISP) lines.</p>
         * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
         * <br>
         * <p>If you are allowed to use single-ISP bandwidth, you can also specify one of the following values:</p>
         * <br>
         * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
         * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
         * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
         * <p>*   **ChinaTelecom_L2**: China Telecom \_L2 (single ISP)</p>
         * <p>*   **ChinaUnicom_L2**: China Unicom \_L2 (single ISP)</p>
         * <p>*   **ChinaMobile_L2**: China Mobile \_L2 (single ISP)</p>
         * <br>
         * <p>> Different acceleration regions support different single-ISP BGP lines.</p>
         */
        @NameInMap("IspType")
        public String ispType;

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
        public java.util.List<ListIpSetsResponseBodyIpSetsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The status of the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **init**: The acceleration region is being initialized.</p>
         * <p>*   **active**: The acceleration region is running.</p>
         * <p>*   **updating**: The acceleration region is being configured.</p>
         * <p>*   **deleting**: The acceleration region is being deleted.</p>
         */
        @NameInMap("State")
        public String state;

        public static ListIpSetsResponseBodyIpSets build(java.util.Map<String, ?> map) throws Exception {
            ListIpSetsResponseBodyIpSets self = new ListIpSetsResponseBodyIpSets();
            return TeaModel.build(map, self);
        }

        public ListIpSetsResponseBodyIpSets setAccelerateRegionId(String accelerateRegionId) {
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        public String getAccelerateRegionId() {
            return this.accelerateRegionId;
        }

        public ListIpSetsResponseBodyIpSets setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListIpSetsResponseBodyIpSets setIpAddressList(java.util.List<String> ipAddressList) {
            this.ipAddressList = ipAddressList;
            return this;
        }
        public java.util.List<String> getIpAddressList() {
            return this.ipAddressList;
        }

        public ListIpSetsResponseBodyIpSets setIpSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }
        public String getIpSetId() {
            return this.ipSetId;
        }

        public ListIpSetsResponseBodyIpSets setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListIpSetsResponseBodyIpSets setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

        public ListIpSetsResponseBodyIpSets setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListIpSetsResponseBodyIpSets setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListIpSetsResponseBodyIpSets setServiceManagedInfos(java.util.List<ListIpSetsResponseBodyIpSetsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListIpSetsResponseBodyIpSetsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public ListIpSetsResponseBodyIpSets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
