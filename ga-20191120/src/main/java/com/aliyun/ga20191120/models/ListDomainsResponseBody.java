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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li><strong>Create</strong>: Create an instance.</li>
         * <li><strong>Update</strong>: Update the current instance.</li>
         * <li><strong>Delete</strong>: Delete the current instance.</li>
         * <li><strong>Associate</strong>: Reference the current instance.</li>
         * <li><strong>UserUnmanaged</strong>: Unmanage the instance.</li>
         * <li><strong>CreateChild</strong>: Create a child resource in the current instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Update</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <ul>
         * <li><strong>Listener</strong>: listener.</li>
         * <li><strong>IpSet</strong>: acceleration region.</li>
         * <li><strong>EndpointGroup</strong>: endpoint group.</li>
         * <li><strong>ForwardingRule</strong>: forwarding rule.</li>
         * <li><strong>Endpoint</strong>: endpoint.</li>
         * <li><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</li>
         * <li><strong>false</strong>: The specified actions are not managed, and you can perform the specified actions on the managed instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The name of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Accelerator</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The GA instance is managed.</li>
         * <li><strong>false</strong>: The GA instance is not managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that you can perform on the managed instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * <ul>
         * <li>You can perform only specific actions on a managed instance.</li>
         * </ul>
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
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>illegal:</strong> The domain name is illegal.</li>
         * <li><strong>inactive:</strong> The domain name has not completed ICP filing.</li>
         * <li><strong>active:</strong> The domain name has a valid ICP number.</li>
         * <li><strong>unknown:</strong> The ICP filing status is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
