// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to allocate a public IP address to the compute nodes. Valid values:</p>
     * <ul>
     * <li>true: A public IP address is allocated to the compute nodes.</li>
     * <li>false: A public IP address is not allocated to the compute nodes.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87126.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum hourly price of the compute nodes. The value is a floating-point number that supports up to three decimal places. The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
     * <p>If ComputeSpotPriceLimit and InstanceTypeModel.N.MaxPrice are specified at the same time, compute nodes are created based on the smaller value of the two parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>0.68</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <ul>
     * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>The number of vCPUs. The parameter is required when the ResourceAmountType parameter is set to Cores.</p>
     * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The prefix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    /**
     * <p>The suffix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    /**
     * <p>The image ID of the compute nodes to be added. The parameter takes effect only when the TargetImageId parameter is not specified.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the image ID.</p>
     * <blockquote>
     * <p> If you add multiple compute nodes, the TargetImageId parameter takes effect only on the nodes for which the TargetImageId parameter is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos_7_06_64_20G_alibase_20190711.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The level of the instance family. The parameter takes effect only when Cores and Memory are specified. Valid values:</p>
     * <ul>
     * <li>EntryLevel</li>
     * <li>EnterpriseLevel</li>
     * <li>CreditEntryLevel For more information, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * </ul>
     * <p>Default value: EnterpriseLevel.</p>
     * 
     * <strong>example:</strong>
     * <p>EntryLevel</p>
     */
    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    /**
     * <p>The information about the preemptible instance.</p>
     */
    @NameInMap("InstanceTypeModel")
    public java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel;

    /**
     * <p>The billing method of the elastic IP address (EIP). Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth</li>
     * <li>PayByTraffic: pay-by-traffic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of the parameter are 1 to 10 and the default value is 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased. The default value is the value of the InternetMaxBandWidthOut parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    /**
     * <p>The interval between two consecutive batches. Valid values: 60 to 600. Unit: seconds.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The queue to which the compute nodes are added.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/92176.html">ListQueues</a> operation to query the queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>workq</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The memory capacity. The parameter is required when the ResourceAmountType parameter is set to Cores. Unit: GB.</p>
     * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The application policy of the preemptible nodes. Valid values:</p>
     * <ul>
     * <li>LowPriceResourcePlanning: Preemptible nodes are created based on the unit prices of vCPUs in ascending order. Preemptible nodes are created first when multiple preemptible instance types are specified.</li>
     * <li>CapacityOptResourcePlanning: Preemptible nodes are created based on the prices and release rates in ascending order.</li>
     * <li>CustomizedResourcePlanning: Nodes are added based on the predefined value of the ZoneIds.N parameter. Instances of a zone that has a higher priority are used first.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LowPriceResourcePlanning</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The type of the resource that you want to add. Valid values:</p>
     * <ul>
     * <li>Instances: the ECS instances that are used as compute nodes</li>
     * <li>Cores: vCPU and memory</li>
     * </ul>
     * <p>Default value: Instances.</p>
     * 
     * <strong>example:</strong>
     * <p>Instances</p>
     */
    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    /**
     * <p>The total number of batches to create nodes. Valid values: 1 to 10.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Round")
    public Integer round;

    /**
     * <p>Specifies whether to strictly meet the requirements of the TargetCapacity parameter. The parameter takes effect only when StrictSatisfiedTargetCapacity is set to true. Valid values:</p>
     * <ul>
     * <li>true: Check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</li>
     * <li>false: Check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("StrictResourceProvision")
    public Boolean strictResourceProvision;

    /**
     * <p>Specifies whether to meet the requirements of the TargetCapacity parameter. Valid values:</p>
     * <ul>
     * <li><p>true: If the available resources are fewer than the resources that you want to add, no compute nodes are created and an error is returned. If the available resources are more than the resources that you want to add, the following cases may occur:</p>
     * <ul>
     * <li>If StrictResourceProvision is set to true, check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</li>
     * <li>If StrictResourceProvision is set to false, check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</li>
     * </ul>
     * </li>
     * <li><p>false: If the available resources are insufficient, compute nodes are created based on the inventory of the resources.</p>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StrictSatisfiedTargetCapacity")
    public Boolean strictSatisfiedTargetCapacity;

    /**
     * <p>The performance level of the ESSD that you want to use as the system disk. Valid values:</p>
     * <ul>
     * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.</li>
     * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL0. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
     * <p>Valid values: 40 to 500.</p>
     * <p>Default value: 40.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: SSD</li>
     * <li>cloud_essd: enhanced SSD (ESSD)</li>
     * <li>cloud: basic disk. Disks of this type are retired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskType")
    public String systemDiskType;

    /**
     * <p>The details about the tags that are added to the nodes.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ApplyNodesRequestTag> tag;

    /**
     * <p>The amount of the resource that you want to add. The specific number depends on the value of the ResourceAmountType parameter:</p>
     * <ul>
     * <li>If ResourceAmountType is set to Instance, the value range of TargetCapacity is 1 to 200.</li>
     * <li>If ResourceAmountType is set to Cores, the value range of TargetCapacity is 1 to 1,000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    /**
     * <p>The user data of the instance. The user data must be Base64-encoded. The raw data can be up to 16 KB in size. Linux operating systems support shell scripts. Windows operating systems support bat and Powershell scripts. Before you perform Base64 encoding, make sure that the content to be encoded includes [bat] or [powershell] as the first row.</p>
     * <blockquote>
     * <p> We recommend that you do not pass in confidential information, such as passwords or private keys, in plaintext as user data. This is because the system does not encrypt UserData values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64, and then decode and decrypt the information in the same way inside the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The details of the zones. You can specify up to 10 zones.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneInfos")
    public java.util.List<ApplyNodesRequestZoneInfos> zoneInfos;

    public static ApplyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyNodesRequest self = new ApplyNodesRequest();
        return TeaModel.build(map, self);
    }

    public ApplyNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    public ApplyNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ApplyNodesRequest setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public ApplyNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public ApplyNodesRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public ApplyNodesRequest setHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    public ApplyNodesRequest setHostNameSuffix(String hostNameSuffix) {
        this.hostNameSuffix = hostNameSuffix;
        return this;
    }
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    public ApplyNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ApplyNodesRequest setInstanceFamilyLevel(String instanceFamilyLevel) {
        this.instanceFamilyLevel = instanceFamilyLevel;
        return this;
    }
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    public ApplyNodesRequest setInstanceTypeModel(java.util.List<ApplyNodesRequestInstanceTypeModel> instanceTypeModel) {
        this.instanceTypeModel = instanceTypeModel;
        return this;
    }
    public java.util.List<ApplyNodesRequestInstanceTypeModel> getInstanceTypeModel() {
        return this.instanceTypeModel;
    }

    public ApplyNodesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ApplyNodesRequest setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
        this.internetMaxBandWidthIn = internetMaxBandWidthIn;
        return this;
    }
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    public ApplyNodesRequest setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
        this.internetMaxBandWidthOut = internetMaxBandWidthOut;
        return this;
    }
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    public ApplyNodesRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ApplyNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public ApplyNodesRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ApplyNodesRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public ApplyNodesRequest setResourceAmountType(String resourceAmountType) {
        this.resourceAmountType = resourceAmountType;
        return this;
    }
    public String getResourceAmountType() {
        return this.resourceAmountType;
    }

    public ApplyNodesRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

    public ApplyNodesRequest setStrictResourceProvision(Boolean strictResourceProvision) {
        this.strictResourceProvision = strictResourceProvision;
        return this;
    }
    public Boolean getStrictResourceProvision() {
        return this.strictResourceProvision;
    }

    public ApplyNodesRequest setStrictSatisfiedTargetCapacity(Boolean strictSatisfiedTargetCapacity) {
        this.strictSatisfiedTargetCapacity = strictSatisfiedTargetCapacity;
        return this;
    }
    public Boolean getStrictSatisfiedTargetCapacity() {
        return this.strictSatisfiedTargetCapacity;
    }

    public ApplyNodesRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public ApplyNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public ApplyNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public ApplyNodesRequest setTag(java.util.List<ApplyNodesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ApplyNodesRequestTag> getTag() {
        return this.tag;
    }

    public ApplyNodesRequest setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }
    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    public ApplyNodesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ApplyNodesRequest setZoneInfos(java.util.List<ApplyNodesRequestZoneInfos> zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public java.util.List<ApplyNodesRequestZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static class ApplyNodesRequestInstanceTypeModel extends TeaModel {
        /**
         * <p>The instance type of the compute node. The default value is the instance type that was specified when you created the cluster or the last time you added compute nodes.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price that you can pay for the preemptible node. The value is a floating-point number that supports up to three decimal places.</p>
         * <p>The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>0.034</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The image ID of the compute node. You must select a Windows image.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>win2016_1607_x64_dtc_zh-cn_40G_alibase_20210516.vhd</p>
         */
        @NameInMap("TargetImageId")
        public String targetImageId;

        public static ApplyNodesRequestInstanceTypeModel build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestInstanceTypeModel self = new ApplyNodesRequestInstanceTypeModel();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestInstanceTypeModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ApplyNodesRequestInstanceTypeModel setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ApplyNodesRequestInstanceTypeModel setTargetImageId(String targetImageId) {
            this.targetImageId = targetImageId;
            return this;
        }
        public String getTargetImageId() {
            return this.targetImageId;
        }

    }

    public static class ApplyNodesRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * <p>Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.</p>
         * <p>Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ApplyNodesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestTag self = new ApplyNodesRequestTag();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ApplyNodesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ApplyNodesRequestZoneInfos extends TeaModel {
        /**
         * <p>The ID of the vSwitch. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e47optm9g58zcu****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone to which the node belongs. Valid values of N: 1 to 10.</p>
         * <blockquote>
         * <p> Each zone ID must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ApplyNodesRequestZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            ApplyNodesRequestZoneInfos self = new ApplyNodesRequestZoneInfos();
            return TeaModel.build(map, self);
        }

        public ApplyNodesRequestZoneInfos setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ApplyNodesRequestZoneInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
