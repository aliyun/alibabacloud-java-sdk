// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeIpSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the acceleration region.</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth that is allocated to the acceleration region. Unit: Mbit/s.</p>
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
     * <p>The IP version. Valid values:</p>
     * <br>
     * <p>*   **IPv4**</p>
     * <p>*   **IPv6**</p>
     * <p>*   **DUAL_STACK**</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **BGP**: BGP (Multi-ISP) lines. This is the default value.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines.</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <br>
     * <p>>  This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
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
     * <p>> *   This parameter is returned only if the value of **ServiceManaged** is **true**.</p>
     * <p>>*   Users can perform only specific actions on a managed instance.</p>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeIpSetResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The status of the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **init**: The acceleration region is being initialized.</p>
     * <p>*   **active**: The acceleration region is in the running state.</p>
     * <p>*   **updating**: The acceleration region is being configured.</p>
     * <p>*   **deleting**: The GA instance is being deleted.</p>
     */
    @NameInMap("State")
    public String state;

    public static DescribeIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpSetResponseBody self = new DescribeIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpSetResponseBody setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public DescribeIpSetResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeIpSetResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeIpSetResponseBody setIpAddressList(java.util.List<String> ipAddressList) {
        this.ipAddressList = ipAddressList;
        return this;
    }
    public java.util.List<String> getIpAddressList() {
        return this.ipAddressList;
    }

    public DescribeIpSetResponseBody setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public DescribeIpSetResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeIpSetResponseBody setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

    public DescribeIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpSetResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeIpSetResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeIpSetResponseBody setServiceManagedInfos(java.util.List<DescribeIpSetResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeIpSetResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeIpSetResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public static class DescribeIpSetResponseBodyServiceManagedInfos extends TeaModel {
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
         * <p>Indicates whether the specified actions are managed.</p>
         * <br>
         * <p>*   **true**: The specified actions are managed, and users cannot perform the actions on the managed instance.</p>
         * <p>*   **false**: The specified actions are not managed, and users can perform the actions on the managed instance.</p>
         */
        @NameInMap("IsManaged")
        public Boolean isManaged;

        public static DescribeIpSetResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpSetResponseBodyServiceManagedInfos self = new DescribeIpSetResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIpSetResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeIpSetResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeIpSetResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

}
