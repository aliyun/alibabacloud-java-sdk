// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListDomainsResponseBody extends TeaModel {
    /**
     * <p>A list of accelerated domain names.</p>
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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**: Create an instance.</p>
         * <p>*   **Update**: Update the current instance.</p>
         * <p>*   **Delete**: Delete the current instance.</p>
         * <p>*   **Associate**: Reference the current instance.</p>
         * <p>*   **UserUnmanaged**: Unmanage the instance.</p>
         * <p>*   **CreateChild**: Create a child resource in the current instance.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: listener.</p>
         * <p>*   **IpSet**: acceleration region.</p>
         * <p>*   **EndpointGroup**: endpoint group.</p>
         * <p>*   **ForwardingRule**: forwarding rule.</p>
         * <p>*   **Endpoint**: endpoint.</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener.</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener.</p>
         * <br>
         * <p>>  This parameter takes effect only if **Action** is set to **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and you can perform the specified actions on the managed instance.</p>
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
         * <p>The ID of the service that manages the GA instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The GA instance is managed.</p>
         * <p>*   **false**: The GA instance is not managed.</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that you can perform on the managed instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         * <br>
         * <p>*   You can perform only specific actions on a managed instance.</p>
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
         * <p>A list of GA instances.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<ListDomainsResponseBodyDomainsAccelerators> accelerators;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
         * <br>
         * <p>*   **illegal:** The domain name is illegal.</p>
         * <p>*   **inactive:** The domain name has not completed ICP filing.</p>
         * <p>*   **active:** The domain name has a valid ICP number.</p>
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
