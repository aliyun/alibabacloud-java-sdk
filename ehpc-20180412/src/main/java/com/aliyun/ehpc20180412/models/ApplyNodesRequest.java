// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ApplyNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to allocate a public IP address to the compute nodes. Valid values:</p>
     * <br>
     * <p>*   true: A public IP address is allocated to the compute nodes.</p>
     * <p>*   false: A public IP address is not allocated to the compute nodes.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87126~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The maximum hourly price of the compute nodes. The value is a floating-point number that supports up to three decimal places. The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
     * <br>
     * <p>If ComputeSpotPriceLimit and InstanceTypeModel.N.MaxPrice are specified at the same time, compute nodes are created based on the smaller value of the two parameters.</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>The number of vCPUs. The parameter is required when the ResourceAmountType parameter is set to Cores.</p>
     * <br>
     * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
     */
    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>The prefix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
     */
    @NameInMap("HostNamePrefix")
    public String hostNamePrefix;

    /**
     * <p>The suffix of the hostname. You can specify the parameter to manage the compute nodes in an efficient manner.</p>
     */
    @NameInMap("HostNameSuffix")
    public String hostNameSuffix;

    /**
     * <p>The image ID of the compute nodes to be added. The parameter takes effect only when the TargetImageId parameter is not specified.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.</p>
     * <br>
     * <p>>  If you add multiple compute nodes, the TargetImageId parameter takes effect only on the nodes for which the TargetImageId parameter is specified.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The level of the instance family. The parameter takes effect only when Cores and Memory are specified. Valid values:</p>
     * <br>
     * <p>*   EntryLevel</p>
     * <p>*   EnterpriseLevel</p>
     * <p>*   CreditEntryLevel For more information, see [Overview of burstable instances](~~59977~~).</p>
     * <br>
     * <p>Default value: EnterpriseLevel.</p>
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
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic: pay-by-traffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <br>
     * <p>*   If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of the parameter are 1 to 10 and the default value is 10.</p>
     * <p>*   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased. The default value is the value of the InternetMaxBandWidthOut parameter.</p>
     */
    @NameInMap("InternetMaxBandWidthIn")
    public Integer internetMaxBandWidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <br>
     * <p>Default value: 0.</p>
     */
    @NameInMap("InternetMaxBandWidthOut")
    public Integer internetMaxBandWidthOut;

    /**
     * <p>The interval between two consecutive batches. Valid values: 60 to 600. Unit: seconds.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The queue to which the compute nodes are added.</p>
     * <br>
     * <p>You can call the [ListQueues](~~92176~~) operation to query the queue name.</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The memory capacity. The parameter is required when the ResourceAmountType parameter is set to Cores. Unit: GB.</p>
     * <br>
     * <p>You can set vCPU and Memory to query node specifications. For example, you can query the available compute nodes that have 2 vCPUs and 16 GB of memory by setting vCPU to 2 and Memory to 16. You can also query compute nodes by node specification and zone. Query results are sorted by price. The nodes that have the lowest price are created.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The application policy of the preemptible nodes. Valid values:</p>
     * <br>
     * <p>*   LowPriceResourcePlanning: Preemptible nodes are created based on the unit prices of vCPUs in ascending order. Preemptible nodes are created first when multiple preemptible instance types are specified.</p>
     * <p>*   CapacityOptResourcePlanning: Preemptible nodes are created based on the prices and release rates in ascending order.</p>
     * <p>*   CustomizedResourcePlanning: Nodes are added based on the predefined value of the ZoneIds.N parameter. Instances of a zone that has a higher priority are used first.</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The type of the resource that you want to add. Valid values:</p>
     * <br>
     * <p>*   Instances: the ECS instances that are used as compute nodes</p>
     * <p>*   Cores: vCPU and memory</p>
     * <br>
     * <p>Default value: Instances.</p>
     */
    @NameInMap("ResourceAmountType")
    public String resourceAmountType;

    /**
     * <p>The total number of batches to create nodes. Valid values: 1 to 10.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Round")
    public Integer round;

    /**
     * <p>Specifies whether to strictly meet the requirements of the TargetCapacity parameter. The parameter takes effect only when StrictSatisfiedTargetCapacity is set to true. Valid values:</p>
     * <br>
     * <p>*   true: Check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</p>
     * <p>*   false: Check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("StrictResourceProvision")
    public Boolean strictResourceProvision;

    /**
     * <p>Specifies whether to meet the requirements of the TargetCapacity parameter. Valid values:</p>
     * <br>
     * <p>*   true: If the available resources are fewer than the resources that you want to add, no compute nodes are created and an error is returned. If the available resources are more than the resources that you want to add, the following cases may occur:</p>
     * <br>
     * <p>    *   If StrictResourceProvision is set to true, check the inventory of the resources. Compute nodes are created based on the value of the TargetCapacity parameter only when the available resources are sufficient. Otherwise, no compute nodes are created.</p>
     * <p>    *   If StrictResourceProvision is set to false, check the inventory of the resources. Compute nodes are created only when the available resources are sufficient. However, some compute nodes may fail to be created because resources become insufficient after the inventory query.</p>
     * <br>
     * <p>*   false: If the available resources are insufficient, compute nodes are created based on the inventory of the resources.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("StrictSatisfiedTargetCapacity")
    public Boolean strictSatisfiedTargetCapacity;

    /**
     * <p>The performance level of the ESSD that you want to use as the system disk. Valid values:</p>
     * <br>
     * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50,000 IOPS of random read/write.</p>
     * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL0. For more information, see [ESSDs](~~122389~~).</p>
     */
    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
     * <br>
     * <p>Valid values: 40 to 500.</p>
     * <br>
     * <p>Default value: 40.</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk</p>
     * <p>*   cloud_ssd: SSD</p>
     * <p>*   cloud_essd: enhanced SSD (ESSD)</p>
     * <p>*   cloud: basic disk. Disks of this type are retired.</p>
     */
    @NameInMap("SystemDiskType")
    public String systemDiskType;

    /**
     * <p>The tag to add to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ApplyNodesRequestTag> tag;

    /**
     * <p>The amount of the resource that you want to add. The specific number depends on the value of the ResourceAmountType parameter:</p>
     * <br>
     * <p>*   If ResourceAmountType is set to Instance, the value range of TargetCapacity is 1 to 200.</p>
     * <p>*   If ResourceAmountType is set to Cores, the value range of TargetCapacity is 1 to 1,000.</p>
     */
    @NameInMap("TargetCapacity")
    public Integer targetCapacity;

    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The details of the zones. You can specify up to 10 zones.</p>
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
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum hourly price that you can pay for the preemptible node. The value is a floating-point number that supports up to three decimal places.</p>
         * <br>
         * <p>The parameter takes effect only when ComputeSpotStrategy is set to SpotWithPriceLimit.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The image ID of the compute node. You must select a Windows image.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
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
         * <p>The tag key of the compute node that you want to add. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the compute node that you want to add. You can specify 1 to 20 tag values. The tag value can be an empty string. It can be up to 128 characters in length and cannot start with acs: or contain http:// or https://.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
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
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone to which the node belongs. Valid values of N: 1 to 10.</p>
         * <br>
         * <p>>  Each zone ID must be unique.</p>
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
