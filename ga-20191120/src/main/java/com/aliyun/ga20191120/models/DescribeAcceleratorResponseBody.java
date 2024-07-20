// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth metering method. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthPackage:</strong> billed based on bandwidth plans.</li>
     * <li><strong>CDT</strong>: billed based on data transfer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CDT</p>
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
     * 
     * <strong>example:</strong>
     * <p>cen-hjkduu767hc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The timestamp that indicates when the GA instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1650643200</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The type of cross-border acceleration. This parameter is returned for GA instances whose bandwidth metering method is pay-by-data-transfer (CDT).</p>
     * <p>Only <strong>bpgPro</strong> may be returned, which indicates BGP (Multi-ISP) Pro lines.</p>
     * 
     * <strong>example:</strong>
     * <p>bpgPro</p>
     */
    @NameInMap("CrossBorderMode")
    public String crossBorderMode;

    /**
     * <p>Indicates whether cross-border acceleration is enabled.</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossBorderStatus")
    public Boolean crossBorderStatus;

    /**
     * <p>The details about the cross-border acceleration bandwidth plan that is associated with the GA instance.</p>
     * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
     */
    @NameInMap("CrossDomainBandwidthPackage")
    public DescribeAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    /**
     * <p>Indicates whether cross-border acceleration is enabled.</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossPrivateState")
    public String crossPrivateState;

    /**
     * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-zz11vq7j****</p>
     */
    @NameInMap("DdosId")
    public String ddosId;

    /**
     * <p>The description of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The canonical name (CNAME) that is assigned to the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp15u1i2hmtbk8c3i****.aliyunga0019.com</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>The timestamp that indicates when the GA instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1653235200</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The billing method of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
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
     * 
     * <strong>example:</strong>
     * <p>Accelerator</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
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
     * <p>The CNAME that is used to integrate the GA instance with the Anti-DDoS service.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1f609c76zg6zuna****-1.aliyunga0047.com</p>
     */
    @NameInMap("SecondDnsName")
    public String secondDnsName;

    /**
     * <p>The ID of the service that manages the GA instance.</p>
     * <blockquote>
     * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
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
     * <p>The actions that you can perform on the managed instance.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
     * <li>You can perform only specific actions on a managed instance.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ServiceManagedInfos")
    public java.util.List<DescribeAcceleratorResponseBodyServiceManagedInfos> serviceManagedInfos;

    /**
     * <p>The specification of the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Small Ⅰ</li>
     * <li><strong>2</strong>: Small Ⅱ</li>
     * <li><strong>3</strong>: Small Ⅲ</li>
     * <li><strong>5</strong>: Medium Ⅰ</li>
     * <li><strong>8</strong>: Medium Ⅱ</li>
     * <li><strong>10</strong>: Medium Ⅲ</li>
     * <li><strong>20</strong>: Large Ⅰ</li>
     * <li><strong>30</strong>: Large Ⅱ</li>
     * <li><strong>40</strong>: Large Ⅲ</li>
     * <li><strong>50</strong>: Large Ⅳ</li>
     * <li><strong>60</strong>: Large Ⅴ</li>
     * <li><strong>70</strong>: Large Ⅵ</li>
     * <li><strong>80</strong>: Large VⅡ</li>
     * <li><strong>90</strong>: Large VⅢ</li>
     * <li><strong>100</strong>: Super Large Ⅰ</li>
     * <li><strong>200</strong>: Super Large Ⅱ</li>
     * </ul>
     * <blockquote>
     * <p> The Large Ⅲ specification and higher specifications are available only to users that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
     * </blockquote>
     * <p>Different specifications provide different capabilities. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance specifications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the GA instance. Valid values:</p>
     * <ul>
     * <li><strong>init</strong>: The GA instance is being initialized.</li>
     * <li><strong>active</strong>: The GA instance is available.</li>
     * <li><strong>configuring</strong>: The GA instance is being configured.</li>
     * <li><strong>binding</strong>: The GA instance is being associated.</li>
     * <li><strong>unbinding</strong>: The GA instance is being disassociated.</li>
     * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
     * <li><strong>finacialLocked</strong>: The GA instance is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
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
     * <ul>
     * <li><strong>notUpgradable:</strong> The GA instance does not need to be upgraded.</li>
     * <li><strong>upgradable:</strong> The GA instance can be upgraded to the latest version.</li>
     * <li><strong>upgradeFailed:</strong> The GA instance failed to be upgraded.</li>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth that is provided by the basic bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: basic</li>
         * <li><strong>Enhanced</strong>: enhanced</li>
         * <li><strong>Advanced</strong>: premium</li>
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
         * <p>The bandwidth that is provided by the cross-border acceleration bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-border acceleration bandwidth plan.</p>
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

    public static class DescribeAcceleratorResponseBodyIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <ul>
         * <li><strong>UserDefine</strong>: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</li>
         * <li><strong>Anycast</strong>: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</li>
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
         * <p>The name of the action performed on the managed instance. Valid values:</p>
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
         * <li><strong>Listener</strong>: a listener.</li>
         * <li><strong>IpSet</strong>: an acceleration region.</li>
         * <li><strong>EndpointGroup</strong>: an endpoint group.</li>
         * <li><strong>ForwardingRule</strong>: a forwarding rule.</li>
         * <li><strong>Endpoint</strong>: an endpoint.</li>
         * <li><strong>EndpointGroupDestination</strong>: a protocol mapping of an endpoint group associated with a custom routing listener.</li>
         * <li><strong>EndpointPolicy</strong>: a traffic policy of an endpoint associated with a custom routing listener.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the GA instance.</p>
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
