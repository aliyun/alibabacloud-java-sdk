// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIpSetsResponseBody extends TeaModel {
    /**
     * <p>The acceleration regions.</p>
     */
    @NameInMap("IpSets")
    public java.util.List<ListIpSetsResponseBodyIpSets> ipSets;

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
     * <p>A9B4E54C-9CCD-4002-91A9-D38C6C209192</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <ul>
         * <li><strong>Create</strong></li>
         * <li><strong>Update</strong></li>
         * <li><strong>Delete</strong></li>
         * <li><strong>Associate</strong></li>
         * <li><strong>UserUnmanaged</strong></li>
         * <li><strong>CreateChild</strong></li>
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
         * <p>Indicates whether the specified actions are managed.</p>
         * <ul>
         * <li><strong>true</strong>: The specified actions are managed, and users cannot perform the actions on the managed instance.****</li>
         * <li><strong>false</strong>: The specified actions are not managed, and users can perform the actions on the managed instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AccelerateRegionId")
        public String accelerateRegionId;

        /**
         * <p>The bandwidth that is allocated to the acceleration region. Unit: <strong>Mbit/s</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The accelerated IP addresses.</p>
         */
        @NameInMap("IpAddressList")
        public java.util.List<String> ipAddressList;

        /**
         * <p>The ID of the acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11r5jb8ogp122xl****</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>IPv6</strong></li>
         * <li><strong>DUAL_STACK</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>BGP</strong>: BGP (Multi-ISP) lines. This is the default value.</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("IspType")
        public String ispType;

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>true</strong>.</li>
         * <li>Users can perform only specific actions on a managed instance.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListIpSetsResponseBodyIpSetsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The status of the acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>init:</strong> The acceleration region is being initialized.</li>
         * <li><strong>active:</strong> The acceleration region is in the running state.</li>
         * <li><strong>updating:</strong> The acceleration region is being configured.</li>
         * <li><strong>deleting:</strong> The acceleration region is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
