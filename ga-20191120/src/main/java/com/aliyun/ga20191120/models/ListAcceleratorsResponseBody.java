// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAcceleratorsResponseBody extends TeaModel {
    /**
     * <p>The details of the Global Accelerator instances.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<ListAcceleratorsResponseBodyAccelerators> accelerators;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The bandwidth of the basic bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth. Valid values:</p>
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
         * <p>The bandwidth of the cross-domain acceleration bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-domain acceleration bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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

    public static class ListAcceleratorsResponseBodyAcceleratorsDdosConfigList extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS Pro/Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-a8w4ekcb**</p>
         */
        @NameInMap("DdosId")
        public String ddosId;

        /**
         * <p>The region ID of the Anti-DDoS Pro/Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DdosRegionId")
        public String ddosRegionId;

        public static ListAcceleratorsResponseBodyAcceleratorsDdosConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListAcceleratorsResponseBodyAcceleratorsDdosConfigList self = new ListAcceleratorsResponseBodyAcceleratorsDdosConfigList();
            return TeaModel.build(map, self);
        }

        public ListAcceleratorsResponseBodyAcceleratorsDdosConfigList setDdosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }
        public String getDdosId() {
            return this.ddosId;
        }

        public ListAcceleratorsResponseBodyAcceleratorsDdosConfigList setDdosRegionId(String ddosRegionId) {
            this.ddosRegionId = ddosRegionId;
            return this;
        }
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

    }

    public static class ListAcceleratorsResponseBodyAcceleratorsIpSetConfig extends TeaModel {
        /**
         * <p>The access mode of the acceleration area. Valid values:</p>
         * <ul>
         * <li><p><strong>UserDefine</strong>: custom nearby access mode. You can select acceleration areas and regions based on your business needs. Global Accelerator provides a separate elastic IP address (EIP) for each acceleration region.</p>
         * </li>
         * <li><p><strong>Anycast</strong>: automatic nearby access mode. You do not need to configure an acceleration area. Global Accelerator provides an Anycast EIP for multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud network using the Anycast EIP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserDefine</p>
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
         * <p>The name of the action on the managed instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Create</strong>: create an instance.</p>
         * </li>
         * <li><p><strong>Update</strong>: update the current instance.</p>
         * </li>
         * <li><p><strong>Delete</strong>: delete the current instance.</p>
         * </li>
         * <li><p><strong>Associate</strong>: associate the instance with other resources.</p>
         * </li>
         * <li><p><strong>UserUnmanaged</strong>: disassociate the instance from the service.</p>
         * </li>
         * <li><p><strong>CreateChild</strong>: create a child resource in the instance.</p>
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
         * <li><p><strong>EndpointPolicy</strong>: traffic policy of an endpoint associated with a custom routing listener.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when <strong>Action</strong> is set to <strong>CreateChild</strong>.</p>
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
         * <li><p><strong>true</strong>: The specified action is managed, and you cannot perform the specified action on the managed instance.</p>
         * </li>
         * <li><p><strong>false</strong>: The specified action is not managed, and you can perform the specified action on the managed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tast-value</p>
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
         * <p>The ID of the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The bandwidth of the Global Accelerator instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method for the bandwidth.</p>
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
        public ListAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage;

        /**
         * <p>The Cloud Enterprise Network (CEN) instance that is bound to the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-hjfufhjfuwff****</p>
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
         * <p>The type of cross-border acceleration for the instance that uses the pay-by-data-transfer billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>bpgPro</strong>: premium bandwidth for cross-border acceleration.</p>
         * </li>
         * <li><p><strong>private</strong>: &lt;props=&quot;china&quot;&gt;China Unicom leased line for cross-border acceleration.&lt;props=&quot;intl&quot;&gt;Leased line for cross-domain acceleration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bpgPro</p>
         */
        @NameInMap("CrossBorderMode")
        public String crossBorderMode;

        /**
         * <p>Indicates whether cross-border data transfer is enabled for the Global Accelerator instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Cross-border data transfer is enabled, which can accelerate data transfer across borders.</p>
         * </li>
         * <li><p><strong>false</strong>: Cross-border data transfer is disabled, which cannot accelerate data transfer across borders.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CrossBorderStatus")
        public Boolean crossBorderStatus;

        /**
         * <p>The details of the cross-domain acceleration bandwidth plan that is associated with the Global Accelerator instance.</p>
         * <p>This array is returned only by the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
         */
        @NameInMap("CrossDomainBandwidthPackage")
        public ListAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage;

        /**
         * <p>The list of Anti-DDoS Pro/Premium configurations.</p>
         */
        @NameInMap("DdosConfigList")
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsDdosConfigList> ddosConfigList;

        /**
         * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the Global Accelerator instance.</p>
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
         * <p>The canonical name (CNAME) assigned to the Global Accelerator instance.</p>
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
        public ListAcceleratorsResponseBodyAcceleratorsIpSetConfig ipSetConfig;

        /**
         * <p>The name of the Global Accelerator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Accelerator</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the Global Accelerator instance. The value is set to <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        @Deprecated
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekztkx4zwc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The CNAME that is assigned to the Global Accelerator instance after it is associated with an Anti-DDoS Pro/Premium instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1f609c76zg6zuna****-1.aliyunga0047.com</p>
         */
        @NameInMap("SecondDnsName")
        public String secondDnsName;

        /**
         * <p>The ID of the service that manages the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
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
         * <li><p>This parameter is returned only when <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </li>
         * <li><p>When the instance is in a managed state, you have limited permissions to perform operations on the instance.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("ServiceManagedInfos")
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsServiceManagedInfos> serviceManagedInfos;

        /**
         * <p>The instance type of the Global Accelerator instance. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Small I</p>
         * </li>
         * <li><p><strong>2</strong>: Small II</p>
         * </li>
         * <li><p><strong>3</strong>: Small III</p>
         * </li>
         * <li><p><strong>5</strong>: Medium I</p>
         * </li>
         * <li><p><strong>8</strong>: Medium II</p>
         * </li>
         * <li><p><strong>10</strong>: Medium III</p>
         * </li>
         * <li><p><strong>20</strong>: Large I</p>
         * </li>
         * <li><p><strong>30</strong>: Large II</p>
         * </li>
         * <li><p><strong>40</strong>: Large III</p>
         * </li>
         * <li><p><strong>50</strong>: Large IV</p>
         * </li>
         * <li><p><strong>60</strong>: Large V</p>
         * </li>
         * <li><p><strong>70</strong>: Large VI</p>
         * </li>
         * <li><p><strong>80</strong>: Large VII</p>
         * </li>
         * <li><p><strong>90</strong>: Large VIII</p>
         * </li>
         * <li><p><strong>100</strong>: Extra Large I</p>
         * </li>
         * <li><p><strong>200</strong>: Extra Large II</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Currently, the Large III and higher instance types are available only to users on the whitelist. To use these instance types, contact your account manager.</p>
         * </blockquote>
         * <p>Different instance types have different definitions. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The state of the Global Accelerator instance. Valid values:</p>
         * <ul>
         * <li><p><strong>init</strong>: The instance is being initialized.</p>
         * </li>
         * <li><p><strong>active</strong>: The instance is active.</p>
         * </li>
         * <li><p><strong>configuring</strong>: The instance is being configured.</p>
         * </li>
         * <li><p><strong>binding</strong>: The instance is being bound.</p>
         * </li>
         * <li><p><strong>unbinding</strong>: The instance is being unbound.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
         * </li>
         * <li><p><strong>finacialLocked</strong>: The instance is locked due to an overdue payment.</p>
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
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsTags> tags;

        /**
         * <p>This parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The upgrade status of the Global Accelerator instance. Valid values:</p>
         * <ul>
         * <li><p><strong>notUpgradable</strong>: The instance does not need to be upgraded.</p>
         * </li>
         * <li><p><strong>upgradable</strong>: The instance can be upgraded to the latest version.</p>
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

        public ListAcceleratorsResponseBodyAccelerators setDdosConfigList(java.util.List<ListAcceleratorsResponseBodyAcceleratorsDdosConfigList> ddosConfigList) {
            this.ddosConfigList = ddosConfigList;
            return this;
        }
        public java.util.List<ListAcceleratorsResponseBodyAcceleratorsDdosConfigList> getDdosConfigList() {
            return this.ddosConfigList;
        }

        @Deprecated
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

        @Deprecated
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
