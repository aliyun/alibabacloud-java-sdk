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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <br>
         * <p>*   **Create**</p>
         * <p>*   **Update**</p>
         * <p>*   **Delete**</p>
         * <p>*   **Associate**</p>
         * <p>*   **UserUnmanaged**</p>
         * <p>*   **CreateChild**</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The type of the child resource. Valid values:</p>
         * <br>
         * <p>*   **Listener**: listener</p>
         * <p>*   **IpSet**: acceleration region</p>
         * <p>*   **EndpointGroup**: endpoint group</p>
         * <p>*   **ForwardingRule**: forwarding rule</p>
         * <p>*   **Endpoint**: endpoint</p>
         * <p>*   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener</p>
         * <p>*   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener</p>
         * <br>
         * <p>>  This parameter takes effect only if **Action** is set to **CreateChild**.</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified actions are managed. Valid values:</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.</p>
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
         * <p>The accelerated IP addresses.</p>
         */
        @NameInMap("IpAddressList")
        public java.util.List<String> ipAddressList;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("IpSetId")
        public String ipSetId;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **BGP** (default)</p>
         * <p>*   **BGP_PRO** If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
         * <br>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values is supported:</p>
         * <br>
         * <p>*   **ChinaTelecom**</p>
         * <p>*   **ChinaUnicom**</p>
         * <p>*   **ChinaMobile**</p>
         * <p>*   **ChinaTelecom_L2**</p>
         * <p>*   **ChinaUnicom_L2**</p>
         * <p>*   **ChinaMobile_L2**</p>
         * <br>
         * <p>>  The supported line types vary based on the acceleration region.</p>
         */
        @NameInMap("IspType")
        public String ispType;

        /**
         * <p>The service that manages the instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if **ServiceManaged** is set to **True**.</p>
         * <br>
         * <p>*   Users can perform only specific actions on a managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListIpSetsResponseBodyIpSetsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The status of the acceleration region. Valid values:</p>
         * <br>
         * <p>*   **init**</p>
         * <p>*   **active**</p>
         * <p>*   **updating**</p>
         * <p>*   **deleting**</p>
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
