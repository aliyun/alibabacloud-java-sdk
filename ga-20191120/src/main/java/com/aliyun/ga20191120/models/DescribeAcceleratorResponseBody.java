// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth of the standard Global Accelerator instance. Unit: Mbps.</p>
     * <blockquote>
     * <p>This parameter is valid only when the access mode of the acceleration area is Anycast.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The billing method of the bandwidth. Valid values:</p>
     * <ul>
     * <li><p><strong>BandwidthPackage</strong>: pay-by-bandwidth-plan.</p>
     * </li>
     * <li><p><strong>CDT</strong>: pay-by-data-transfer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CDT</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The details of the basic bandwidth plan that is associated with the Global Accelerator instance.</p>
     */
    @NameInMap("BasicBandwidthPackage")
    public DescribeAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance that is associated with the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-hjkduu767hc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The timestamp that indicates when the Global Accelerator instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1650643200</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The type of cross-border acceleration. This parameter is returned for pay-by-data-transfer instances.</p>
     * <p><strong>bpgPro</strong>: premium bandwidth for cross-border acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>bpgPro</p>
     */
    @NameInMap("CrossBorderMode")
    public String crossBorderMode;

    /**
     * <p>Indicates whether the cross-border line feature is enabled for the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The cross-border line feature is enabled. You can use Global Accelerator to accelerate data transmission across borders.</p>
     * </li>
     * <li><p><strong>false</strong>: The cross-border line feature is disabled. You cannot use Global Accelerator to accelerate data transmission across borders.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossBorderStatus")
    public Boolean crossBorderStatus;

    /**
     * <p>The details of the cross-region bandwidth plan that is associated with the Global Accelerator instance.</p>
     * <p>This parameter is returned only by the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     */
    @NameInMap("CrossDomainBandwidthPackage")
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    /**
     * <p>Indicates whether cross-border bandwidth is enabled.</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossPrivateState")
    public String crossPrivateState;

    /**
     * <p>The list of Anti-DDoS instances that are associated with the Global Accelerator instance.</p>
     */
    @NameInMap("DdosConfigList")
    public java.util.List<DescribeAcceleratorResponseBodyDdosConfigList> ddosConfigList;

    /**
     * <p>The ID of the Anti-DDoS instance that is associated with the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zz11vq7j****</p>
     */
    @NameInMap("DdosId")
    @Deprecated
    public String ddosId;

    /**
     * <p>The description of the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The canonical name (CNAME) that is assigned to the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp15u1i2hmtbk8c3i****.aliyunga0019.com</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>The timestamp that indicates when the Global Accelerator instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1653235200</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The billing method of the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The configuration of the acceleration area.</p>
     */
    @NameInMap("IpSetConfig")
    public DescribeAcceleratorResponseBodyIpSetConfig ipSetConfig;

    /**
     * <p>The name of the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region where the Global Accelerator instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw2vwdbujqbq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The CNAME of the Anti-DDoS instance that is associated with the Global Accelerator instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1f609c76zg6zuna****-1.aliyunga0047.com</p>
     */
    @NameInMap("SecondDnsName")
    public String secondDnsName;

    /**
     * <p>The ID of the service that manages the instance.</p>
     * <blockquote>
     * <p>This parameter is valid only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ALB</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>Indicates whether the instance is a managed instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is a managed instance.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is not a managed instance.</p>
     * </li>
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
     * <ul>
     * <li><p>This parameter is valid only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
     * </li>
     * <li><p>When the instance is managed, you cannot perform some operations on the instance.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeAcceleratorResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The specification of the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Small I.</p>
     * </li>
     * <li><p><strong>2</strong>: Small II.</p>
     * </li>
     * <li><p><strong>3</strong>: Small III.</p>
     * </li>
     * <li><p><strong>5</strong>: Medium I.</p>
     * </li>
     * <li><p><strong>8</strong>: Medium II.</p>
     * </li>
     * <li><p><strong>10</strong>: Medium III.</p>
     * </li>
     * <li><p><strong>20</strong>: Large I.</p>
     * </li>
     * <li><p><strong>30</strong>: Large II.</p>
     * </li>
     * <li><p><strong>40</strong>: Large III.</p>
     * </li>
     * <li><p><strong>50</strong>: Large IV.</p>
     * </li>
     * <li><p><strong>60</strong>: Large V.</p>
     * </li>
     * <li><p><strong>70</strong>: Large VI.</p>
     * </li>
     * <li><p><strong>80</strong>: Large VII.</p>
     * </li>
     * <li><p><strong>90</strong>: Large VIII.</p>
     * </li>
     * <li><p><strong>100</strong>: Super Large I.</p>
     * </li>
     * <li><p><strong>200</strong>: Super Large II.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The Large III and higher specifications are available only to users on the whitelist. To use these specifications, contact your account manager.</p>
     * </blockquote>
     * <p>The definitions of different specifications vary. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance specifications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>init</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>active</strong>: The instance is available.</p>
     * </li>
     * <li><p><strong>configuring</strong>: The instance is being configured.</p>
     * </li>
     * <li><p><strong>binding</strong>: The instance is being associated.</p>
     * </li>
     * <li><p><strong>unbinding</strong>: The instance is being disassociated.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>finacialLocked</strong>: The instance is financially locked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeAcceleratorResponseBodyTags> tags;

    /**
     * <p>The upgrade status of the Global Accelerator instance. Valid values:</p>
     * <ul>
     * <li><p><strong>notUpgradable</strong>: The instance does not need to be upgraded.</p>
     * </li>
     * <li><p><strong>upgradable</strong>: The instance can be upgraded.</p>
     * </li>
     * <li><p><strong>upgradeFailed</strong>: The instance failed to be upgraded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>notUpgradable</p>
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

    public DescribeAcceleratorResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
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

    public DescribeAcceleratorResponseBody setDdosConfigList(java.util.List<DescribeAcceleratorResponseBodyDdosConfigList> ddosConfigList) {
        this.ddosConfigList = ddosConfigList;
        return this;
    }
    public java.util.List<DescribeAcceleratorResponseBodyDdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    @Deprecated
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

    @Deprecated
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
         * <p>The bandwidth of the basic bandwidth plan. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth of the basic bandwidth plan. Valid values:</p>
         * <ul>
         * <li><p><strong>Basic</strong>: standard acceleration bandwidth.</p>
         * </li>
         * <li><p><strong>Enhanced</strong>: enhanced acceleration bandwidth.</p>
         * </li>
         * <li><p><strong>Advanced</strong>: premium acceleration bandwidth.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the basic bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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
         * <p>The bandwidth of the cross-region bandwidth plan. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-region bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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

    public static class DescribeAcceleratorResponseBodyDdosConfigList extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS instance that is associated with the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        @NameInMap("DdosId")
        public String ddosId;

        /**
         * <p>The region where the Anti-DDoS instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("DdosRegionId")
        public String ddosRegionId;

        public static DescribeAcceleratorResponseBodyDdosConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAcceleratorResponseBodyDdosConfigList self = new DescribeAcceleratorResponseBodyDdosConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeAcceleratorResponseBodyDdosConfigList setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public DescribeAcceleratorResponseBodyDdosConfigList setDdosRegionId(String ddosRegionId) {
            this.ddosRegionId = ddosRegionId;
            return this;
        }
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

    }

    public static class DescribeAcceleratorResponseBodyIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefine</strong>: custom. You can select acceleration areas and regions based on your business needs. Global Accelerator provides a separate elastic IP address (EIP) for each acceleration region.</p>
         * </li>
         * <li><p><strong>Anycast</strong>: automatic. You do not need to configure an acceleration area. Global Accelerator provides an Anycast EIP for multiple regions. Users can connect to the nearest access point of the Alibaba Cloud network using the Anycast EIP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefine</p>
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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Create</strong>: creates an instance.</p>
         * </li>
         * <li><p><strong>Update</strong>: updates the current instance.</p>
         * </li>
         * <li><p><strong>Delete</strong>: deletes the current instance.</p>
         * </li>
         * <li><p><strong>Associate</strong>: associates the instance with other resources.</p>
         * </li>
         * <li><p><strong>UserUnmanaged</strong>: unmanages the instance.</p>
         * </li>
         * <li><p><strong>CreateChild</strong>: creates a child resource in the instance.</p>
         * </li>
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
         * <li><p><strong>Listener</strong>: listener.</p>
         * </li>
         * <li><p><strong>IpSet</strong>: acceleration region.</p>
         * </li>
         * <li><p><strong>EndpointGroup</strong>: endpoint group.</p>
         * </li>
         * <li><p><strong>ForwardingRule</strong>: forwarding rule.</p>
         * </li>
         * <li><p><strong>Endpoint</strong>: endpoint.</p>
         * </li>
         * <li><p><strong>EndpointGroupDestination</strong>: protocol mapping of an endpoint group associated with a custom routing listener.</p>
         * </li>
         * <li><p><strong>EndpointPolicy</strong>: access policy of an endpoint associated with a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Listener</p>
         */
        @NameInMap("ChildType")
        public String childType;

        /**
         * <p>Indicates whether the specified action is managed. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The action is managed. You cannot perform the specified action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The action is not managed. You can perform the specified action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
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
