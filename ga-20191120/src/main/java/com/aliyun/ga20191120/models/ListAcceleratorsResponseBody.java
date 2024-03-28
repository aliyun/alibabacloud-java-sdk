// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsResponseBody extends TeaModel {
    /**
     * <p>The information about the GA instances.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<ListAcceleratorsResponseBodyAccelerators> accelerators;

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

    public static ListAcceleratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAcceleratorsResponseBody self = new ListAcceleratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAcceleratorsResponseBody setAccelerators(java.util.List<ListAcceleratorsResponseBodyAccelerators> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<ListAcceleratorsResponseBodyAccelerators> getAccelerators() {
        return this.accelerators;
    }

    public ListAcceleratorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAcceleratorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAcceleratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAcceleratorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The bandwidth type that is provided by the basic bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Basic**</p>
         * <p>*   **Enhanced**</p>
         * <p>*   **Advanced**</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the basic bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage self = new ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the cross-border acceleration bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-border acceleration bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage self = new ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <br>
         * <p>*   **UserDefine**: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</p>
         * <p>*   **Anycast**: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        public static ListAcceleratorsResponseBodyAcceleratorsIpSetConfig build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsIpSetConfig self = new ListAcceleratorsResponseBodyAcceleratorsIpSetConfig();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsIpSetConfig setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos extends TeaModel {
        /**
         * <p>The name of the action that is performed on the managed instance. Valid values:</p>
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
         * <p>>  This parameter takes effect only if the value of **Action** is **CreateChild**.</p>
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

        public static ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos self = new ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAcceleratorsResponseBodyAcceleratorsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsTags self = new ListAcceleratorsResponseBodyAcceleratorsTags();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAcceleratorsResponseBodyAcceleratorsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAcceleratorsResponseBodyAccelerators extends TeaModel {
        /**
         * <p>The ID of the GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The bandwidth of the GA instance. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The bandwidth metering method. Valid values:</p>
         * <br>
         * <p>*   **BandwidthPackage**: billed based on bandwidth plans.</p>
         * <p>*   **CDT**: billed based on data transfer.</p>
         */
        @NameInMap("BandwidthBillingType")
        public String bandwidthBillingType;

        /**
         * <p>The information about the basic bandwidth plan that is associated with the GA instance.</p>
         */
        @NameInMap("BasicBandwidthPackage")
        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage;

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the GA instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The timestamp that indicates when the GA instance was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of cross-border acceleration. This parameter is returned for GA instances whose bandwidth metering method is pay-by-data-transfer.</p>
         * <br>
         * <p>*   **bpgPro**: BGP (Multi-ISP) Pro lines.</p>
         * <p>*   **private**: cross-border Express Connect circuit.</p>
         */
        @NameInMap("CrossBorderMode")
        public String crossBorderMode;

        /**
         * <p>Indicates whether cross-border acceleration is enabled for the GA instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("CrossBorderStatus")
        public Boolean crossBorderStatus;

        /**
         * <p>The information about the cross-border acceleration bandwidth plan that is associated with the GA instance.</p>
         * <br>
         * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
         */
        @NameInMap("CrossDomainBandwidthPackage")
        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage;

        /**
         * <p>The ID of the Anti-DDoS Pro or Anti-DDOS Premium instance that is associated with the GA instance.</p>
         */
        @NameInMap("DdosId")
        public String ddosId;

        /**
         * <p>The description of the GA instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The CNAME that is assigned to the GA instance.</p>
         */
        @NameInMap("DnsName")
        public String dnsName;

        /**
         * <p>The timestamp that indicates when the GA instance expires.</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The billing method of the GA instance.</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The configurations of the acceleration area.</p>
         */
        @NameInMap("IpSetConfig")
        public ListAcceleratorsResponseBodyAcceleratorsIpSetConfig ipSetConfig;

        /**
         * <p>The name of the GA instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region where GA instance is deployed. Only **cn-hangzhou** may be returned.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The CNAME that is used to associate the GA instance with an Anti-DDoS Pro instance or an Anti-DDOS Premium instance.</p>
         */
        @NameInMap("SecondDnsName")
        public String secondDnsName;

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <br>
         * <p>>  This parameter takes effect only if the value of **ServiceManaged** is **true**.</p>
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
         * <p>> *   This parameter takes effect only if the value of **ServiceManaged** is **true**.</p>
         * <p>> *   Users can perform only specific actions on a managed instance.</p>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The specification of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **1**: Small Ⅰ.</p>
         * <p>*   **2**: Small Ⅱ.</p>
         * <p>*   **3**: Small Ⅲ.</p>
         * <p>*   **5**: Medium Ⅰ.</p>
         * <p>*   **8**: Medium Ⅱ.</p>
         * <p>*   **10**: Medium Ⅲ.</p>
         * <p>*   **20**: Large Ⅰ.</p>
         * <p>*   **30**: Large Ⅱ.</p>
         * <p>*   **40**: Large Ⅲ.</p>
         * <p>*   **50**: Large IV.</p>
         * <p>*   **60**: Large V.</p>
         * <p>*   **70**: Large VI.</p>
         * <p>*   **80**: Large VII.</p>
         * <p>*   **90**: Large VIII.</p>
         * <p>*   **100**: Super Large Ⅰ.</p>
         * <p>*   **200**: Super Large Ⅱ.</p>
         * <br>
         * <p>>  The Large Ⅲ specification and higher specifications are available only to accounts that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
         * <br>
         * <p>Different specifications provide different capabilities. For more information, see [Instance specifications](~~153127~~).</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the GA instance. Valid values:</p>
         * <br>
         * <p>*   **init**: The GA instance is being initialized.</p>
         * <p>*   **active**: The GA instance is available.</p>
         * <p>*   **configuring**: The GA instance is being configured.</p>
         * <p>*   **binding**: The GA instance is being associated.</p>
         * <p>*   **unbinding**: The GA instance is being disassociated.</p>
         * <p>*   **deleting**: The GA instance is being deleted.</p>
         * <p>*   **finacialLocked**: The GA instance is locked due to overdue payments.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tags that are added to the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsTags> tags;

        /**
         * <p>An invalid parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the GA instance can be upgraded. Valid values:</p>
         * <br>
         * <p>*   **notUpgradable**: The GA instance does not need to be upgraded.</p>
         * <p>*   **upgradable**: The GA instance can be upgraded to the latest version.</p>
         * <p>*   **upgradeFailed**: The GA instance failed to be upgraded.</p>
         */
        @NameInMap("UpgradableStatus")
        public String upgradableStatus;

        public static ListAcceleratorsResponseBodyAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAccelerators self = new ListAcceleratorsResponseBodyAccelerators();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListAcceleratorsResponseBodyAccelerators setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListAcceleratorsResponseBodyAccelerators setBandwidthBillingType(String bandwidthBillingType) {
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }
        public String getBandwidthBillingType() {
            return this.bandwidthBillingType;
        }

        public ListAcceleratorsResponseBodyAccelerators setBasicBandwidthPackage(ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }
        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        public ListAcceleratorsResponseBodyAccelerators setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListAcceleratorsResponseBodyAccelerators setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAcceleratorsResponseBodyAccelerators setCrossBorderMode(String crossBorderMode) {
            this.crossBorderMode = crossBorderMode;
            return this;
        }
        public String getCrossBorderMode() {
            return this.crossBorderMode;
        }

        public ListAcceleratorsResponseBodyAccelerators setCrossBorderStatus(Boolean crossBorderStatus) {
            this.crossBorderStatus = crossBorderStatus;
            return this;
        }
        public Boolean getCrossBorderStatus() {
            return this.crossBorderStatus;
        }

        public ListAcceleratorsResponseBodyAccelerators setCrossDomainBandwidthPackage(ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }
        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        public ListAcceleratorsResponseBodyAccelerators setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public ListAcceleratorsResponseBodyAccelerators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAcceleratorsResponseBodyAccelerators setDnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }
        public String getDnsName() {
            return this.dnsName;
        }

        public ListAcceleratorsResponseBodyAccelerators setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListAcceleratorsResponseBodyAccelerators setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListAcceleratorsResponseBodyAccelerators setIpSetConfig(ListAcceleratorsResponseBodyAcceleratorsIpSetConfig ipSetConfig) {
            this.ipSetConfig = ipSetConfig;
            return this;
        }
        public ListAcceleratorsResponseBodyAcceleratorsIpSetConfig getIpSetConfig() {
            return this.ipSetConfig;
        }

        public ListAcceleratorsResponseBodyAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAcceleratorsResponseBodyAccelerators setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAcceleratorsResponseBodyAccelerators setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAcceleratorsResponseBodyAccelerators setSecondDnsName(String secondDnsName) {
            this.secondDnsName = secondDnsName;
            return this;
        }
        public String getSecondDnsName() {
            return this.secondDnsName;
        }

        public ListAcceleratorsResponseBodyAccelerators setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListAcceleratorsResponseBodyAccelerators setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListAcceleratorsResponseBodyAccelerators setServiceManagedInfos(java.util.List<ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        public ListAcceleratorsResponseBodyAccelerators setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListAcceleratorsResponseBodyAccelerators setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAcceleratorsResponseBodyAccelerators setTags(java.util.List<ListAcceleratorsResponseBodyAcceleratorsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsTags> getTags() {
            return this.tags;
        }

        public ListAcceleratorsResponseBodyAccelerators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAcceleratorsResponseBodyAccelerators setUpgradableStatus(String upgradableStatus) {
            this.upgradableStatus = upgradableStatus;
            return this;
        }
        public String getUpgradableStatus() {
            return this.upgradableStatus;
        }

    }

}
