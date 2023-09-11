// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth metering method. Valid values:</p>
     * <br>
     * <p>*   **BandwidthPackage:** billed based on bandwidth plans.</p>
     * <p>*   **CDT**: billed based on data transfer.</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The details about the basic bandwidth plan that is associated with the GA instance.</p>
     */
    @NameInMap("BasicBandwidthPackage")
    public DescribeAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance with which the GA instance is associated.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The timestamp that indicates when the GA instance is created.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The type of cross-border acceleration. This parameter is returned for GA instances whose bandwidth metering method is pay-by-data-transfer (CDT).</p>
     * <br>
     * <p>Only **bpgPro** may be returned, which indicates BGP (Multi-ISP) Pro lines.</p>
     */
    @NameInMap("CrossBorderMode")
    public String crossBorderMode;

    /**
     * <p>Indicates whether cross-border acceleration is enabled.</p>
     * <p>- **true**: yes</p>
     * <p>- **false**: no</p>
     */
    @NameInMap("CrossBorderStatus")
    public Boolean crossBorderStatus;

    /**
     * <p>The details about the cross-border acceleration bandwidth plan that is associated with the GA instance.</p>
     * <br>
     * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
     */
    @NameInMap("CrossDomainBandwidthPackage")
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    /**
     * <p>Indicates whether cross-border acceleration is enabled.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CrossPrivateState")
    public String crossPrivateState;

    /**
     * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
     */
    @NameInMap("DdosId")
    public String ddosId;

    /**
     * <p>The description of the GA instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The canonical name (CNAME) that is assigned to the GA instance.</p>
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
    public DescribeAcceleratorResponseBodyIpSetConfig ipSetConfig;

    /**
     * <p>The name of the GA instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the GA instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The CNAME that is used to integrate the GA instance with the Anti-DDoS service.</p>
     */
    @NameInMap("SecondDnsName")
    public String secondDnsName;

    /**
     * <p>托管实例所属的服务方ID。</p>
     * <p>> 仅在**ServiceManaged**参数为**True**时有效。</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>是否为托管实例。取值：</p>
     * <br>
     * <p>- **true**：是托管实例。</p>
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
    public java.util.List<DescribeAcceleratorResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <br>
     * <p>*   **1**: Small Ⅰ</p>
     * <p>*   **2**: Small Ⅱ</p>
     * <p>*   **3**: Small Ⅲ</p>
     * <p>*   **5**: Medium Ⅰ</p>
     * <p>*   **8**: Medium Ⅱ</p>
     * <p>*   **10**: Medium Ⅲ</p>
     * <p>*   **20**: Large Ⅰ</p>
     * <p>*   **30**: Large Ⅱ</p>
     * <p>*   **40**: Large Ⅲ</p>
     * <p>*   **50**: Large Ⅳ</p>
     * <p>*   **60**: Large Ⅴ</p>
     * <p>*   **70**: Large Ⅵ</p>
     * <p>*   **80**: Large VⅡ</p>
     * <p>*   **90**: Large VⅢ</p>
     * <p>*   **100**: Super Large Ⅰ</p>
     * <p>*   **200**: Super Large Ⅱ</p>
     * <br>
     * <p>>  The Large Ⅲ specification and higher specifications are available only to users that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
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
     * <p>The tags of the GA instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeAcceleratorResponseBodyTags> tags;

    /**
     * <p>Indicates whether the GA instance can be upgraded. Valid values:</p>
     * <br>
     * <p>*   **notUpgradable:** The GA instance does not need to be upgraded.</p>
     * <p>*   **upgradable:** The GA instance can be upgraded to the latest version.</p>
     * <p>*   **upgradeFailed:** The GA instance failed to be upgraded.</p>
     */
    @NameInMap("UpgradableStatus")
    public String upgradableStatus;

    public static DescribeAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorResponseBody self = new DescribeAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeAcceleratorResponseBody setBandwidthBillingType(String bandwidthBillingType) {
        this.bandwidthBillingType = bandwidthBillingType;
        return this;
    }
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    public DescribeAcceleratorResponseBody setBasicBandwidthPackage(DescribeAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage) {
        this.basicBandwidthPackage = basicBandwidthPackage;
        return this;
    }
    public DescribeAcceleratorResponseBodyBasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    public DescribeAcceleratorResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeAcceleratorResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeAcceleratorResponseBody setCrossBorderMode(String crossBorderMode) {
        this.crossBorderMode = crossBorderMode;
        return this;
    }
    public String getCrossBorderMode() {
        return this.crossBorderMode;
    }

    public DescribeAcceleratorResponseBody setCrossBorderStatus(Boolean crossBorderStatus) {
        this.crossBorderStatus = crossBorderStatus;
        return this;
    }
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
    }

    public DescribeAcceleratorResponseBody setCrossDomainBandwidthPackage(DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
        this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
        return this;
    }
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    public DescribeAcceleratorResponseBody setCrossPrivateState(String crossPrivateState) {
        this.crossPrivateState = crossPrivateState;
        return this;
    }
    public String getCrossPrivateState() {
        return this.crossPrivateState;
    }

    public DescribeAcceleratorResponseBody setDdosId(String ddosId) {
        this.ddosId = ddosId;
        return this;
    }
    public String getDdosId() {
        return this.ddosId;
    }

    public DescribeAcceleratorResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeAcceleratorResponseBody setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public DescribeAcceleratorResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeAcceleratorResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAcceleratorResponseBody setIpSetConfig(DescribeAcceleratorResponseBodyIpSetConfig ipSetConfig) {
        this.ipSetConfig = ipSetConfig;
        return this;
    }
    public DescribeAcceleratorResponseBodyIpSetConfig getIpSetConfig() {
        return this.ipSetConfig;
    }

    public DescribeAcceleratorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAcceleratorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAcceleratorResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAcceleratorResponseBody setSecondDnsName(String secondDnsName) {
        this.secondDnsName = secondDnsName;
        return this;
    }
    public String getSecondDnsName() {
        return this.secondDnsName;
    }

    public DescribeAcceleratorResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeAcceleratorResponseBody setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeAcceleratorResponseBody setServiceManagedInfos(java.util.List<DescribeAcceleratorResponseBodyServiceManagedInfos> serviceManagedInfos) {
        this.serviceManagedInfos = serviceManagedInfos;
        return this;
    }
    public java.util.List<DescribeAcceleratorResponseBodyServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    public DescribeAcceleratorResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeAcceleratorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeAcceleratorResponseBody setTags(java.util.List<DescribeAcceleratorResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeAcceleratorResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeAcceleratorResponseBody setUpgradableStatus(String upgradableStatus) {
        this.upgradableStatus = upgradableStatus;
        return this;
    }
    public String getUpgradableStatus() {
        return this.upgradableStatus;
    }

    public static class DescribeAcceleratorResponseBodyBasicBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth that is provided by the basic bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Basic**: basic</p>
         * <p>*   **Enhanced**: enhanced</p>
         * <p>*   **Advanced**: premium</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the basic bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeAcceleratorResponseBodyBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyBasicBandwidthPackage self = new DescribeAcceleratorResponseBodyBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeAcceleratorResponseBodyBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth that is provided by the cross-border acceleration bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-border acceleration bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage self = new DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeAcceleratorResponseBodyIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <br>
         * <p>*   **UserDefine**: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</p>
         * <p>*   **Anycast**: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        public static DescribeAcceleratorResponseBodyIpSetConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyIpSetConfig self = new DescribeAcceleratorResponseBodyIpSetConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyIpSetConfig setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

    }

    public static class DescribeAcceleratorResponseBodyServiceManagedInfos extends TeaModel {
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

        public static DescribeAcceleratorResponseBodyServiceManagedInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyServiceManagedInfos self = new DescribeAcceleratorResponseBodyServiceManagedInfos();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyServiceManagedInfos setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeAcceleratorResponseBodyServiceManagedInfos setChildType(String childType) {
            this.childType = childType;
            return this;
        }
        public String getChildType() {
            return this.childType;
        }

        public DescribeAcceleratorResponseBodyServiceManagedInfos setIsManaged(Boolean isManaged) {
            this.isManaged = isManaged;
            return this;
        }
        public Boolean getIsManaged() {
            return this.isManaged;
        }

    }

    public static class DescribeAcceleratorResponseBodyTags extends TeaModel {
        /**
         * <p>The key of tag N that is added to the GA instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the GA instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAcceleratorResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyTags self = new DescribeAcceleratorResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAcceleratorResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
