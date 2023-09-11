// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of accelerated domain names.</p>
     */
    @NameInMap("Domains")
    public java.util.List<ListDomainsResponseBodyDomains> domains;

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
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsResponseBody self = new ListDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainsResponseBody setDomains(java.util.List<ListDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<ListDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public ListDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos extends TeaModel {
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

        public static ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos self = new ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListDomainsResponseBodyDomainsAccelerators extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The name of the GA instance.</p>
         */
        @NameInMap("Name")
        public String name;

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
         * <p>> 仅在**ServiceManaged**参数为**True**时有效。</p>
         * <p>> - 当实例处于托管状态时，用户对实例的操作会受到限制，某些操作行为会被禁止。</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos> serviceManagedInfos;

        public static ListDomainsResponseBodyDomainsAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomainsAccelerators self = new ListDomainsResponseBodyDomainsAccelerators();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomainsAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListDomainsResponseBodyDomainsAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDomainsResponseBodyDomainsAccelerators setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListDomainsResponseBodyDomainsAccelerators setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListDomainsResponseBodyDomainsAccelerators setServiceManagedInfos(java.util.List<ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListDomainsResponseBodyDomainsAcceleratorsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

    }

    public static class ListDomainsResponseBodyDomains extends TeaModel {
        /**
         * <p>The list of GA instances.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ICP filing status of the accelerated domain name.</p>
         * <br>
         * <p>*   **illegal:** The domain name is illegal.</p>
         * <p>*   **inactive:** The domain name has not completed ICP filing.</p>
         * <p>*   **active:** The domain name has a valid ICP filing.</p>
         * <p>*   **unknown:** The ICP filing status is unknown.</p>
         */
        @NameInMap("State")
        public String state;

        public static ListDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            ListDomainsResponseBodyDomains self = new ListDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public ListDomainsResponseBodyDomains setAccelerators(java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> getAccelerators() {
            return this.accelerators;
        }

        public ListDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListDomainsResponseBodyDomains setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
