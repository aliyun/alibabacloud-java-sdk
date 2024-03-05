// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to allocate a public IP address to the compute nodes. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("AllocatePublicAddress")
    public Boolean allocatePublicAddress;

    /**
     * <p>Specifies whether to enable auto-renewal. The parameter takes effect only when EcsChargeType is set to PrePaid. Valid values:</p>
     * <br>
     * <p>*   true: enables auto-renewal</p>
     * <p>*   false: disables auto-renewal</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
     * <br>
     * <p>*   Valid values when PeriodUnit is set to Week: 1, 2, and 3.</p>
     * <p>*   Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable hyper-threading for the compute node. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Valid values: 0 and 1. A value of 0 indicates that the preemptible instance has no protection period.</p>
     */
    @NameInMap("ComputeSpotDuration")
    public Integer computeSpotDuration;

    /**
     * <p>The interruption mode of the preemptible instance. Default value: Terminate. Set the value to Terminate, which indicates that the instance is released.</p>
     */
    @NameInMap("ComputeSpotInterruptionBehavior")
    public String computeSpotInterruptionBehavior;

    /**
     * <p>The maximum hourly price of the compute nodes. The value can be accurate to three decimal places. The parameter only takes effect when SpotStrategy is set to SpotWithPriceLimit.</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    /**
     * <p>The preemption policy of the compute nodes. The parameter only takes effect when EcsChargeType is set to PostPaid. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is a regular pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The policy applies to preemptible instances for which a maximum hourly price is specified.</p>
     * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>The number of compute nodes that you want to add. Valid values: 1 to 99. The value of this parameter is greater than that of the MinCount parameter.</p>
     * <br>
     * <p>*   If the number of available ECS instances is less than the value of the MinCount parameter, the compute nodes cannot be added.</p>
     * <p>*   If the number of available ECS instances is greater than the value of the MinCount parameter and less than that of the Count parameter, the compute nodes are added based on the value of the MinCount parameter.</p>
     * <p>*   If the number of available ECS instances is greater than the value of the Count parameter, the compute nodes are added based on the value of the Count parameter.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The mode in which the compute nodes are added. Valid values:</p>
     * <br>
     * <p>*   manual: The compute nodes are manually added.</p>
     * <p>*   autoscale: The compute nodes are automatically added.</p>
     * <br>
     * <p>Default value: manual.</p>
     */
    @NameInMap("CreateMode")
    public String createMode;

    /**
     * <p>The list of data disks.</p>
     */
    @NameInMap("DataDisks")
    public java.util.List<AddNodesRequestDataDisks> dataDisks;

    /**
     * <p>The information about Domain Name System (DNS) settings.</p>
     */
    @NameInMap("DnsConfig")
    public String dnsConfig;

    /**
     * <p>The billing method of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     * <br>
     * <p>If the parameter is set to PrePaid, auto-renewal is enabled by default. After the E-HPC cluster is released, auto-renewal is disabled.</p>
     */
    @NameInMap("EcsChargeType")
    public String ecsChargeType;

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
     * <p>The ID of the image that is specified for the compute nodes. The image must meet the following requirements:</p>
     * <br>
     * <p>*   The operating system that is specified by the image must be the same as that of the existing cluster nodes. For example, if the operating system of the cluster nodes is CentOS, you can select only a CentOS image.</p>
     * <br>
     * <p>> If you add nodes to a hybrid cloud cluster that supports multiple operating systems, you can select a Windows Server image or a CentOS image when the operating system of nodes is Windows.</p>
     * <br>
     * <p>*   The major version of the image specified for the compute nodes that you want to add is the same as that of the image of the cluster. For example, if the version of the cluster image is CentOS 7.x, the version of the image specified for the compute nodes must be CentOS 7.x.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the image ID.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
     * <br>
     * <p>Default value: system.</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The instance type of the compute nodes. The default value is the instance type that was specified when you created the E-HPC cluster or the last time when you added compute nodes.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

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
     * <p>*   If the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the amount of the outbound bandwidth that is purchased.</p>
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
     * <p>The queue to which the compute nodes are added.</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The minimum number of the compute nodes that you want to add. Valid values: 1 to 99. The value of the parameter is less than that of the Count parameter.</p>
     * <br>
     * <p>*   If the number of available ECS instances is less than the value of the MinCount parameter, the compute nodes cannot be added.</p>
     * <p>*   If the number of available ECS instances is greater than the value of the MinCount parameter and less than that of the Count parameter, the compute nodes are added based on the value of the MinCount parameter.</p>
     * <p>*   If the number of available ECS instances is greater than the value of the Count parameter, the compute nodes are added based on the value of the Count parameter.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("MinCount")
    public Integer minCount;

    /**
     * <p>The communication mode of the ENI. Valid values:</p>
     * <br>
     * <p>*   Standard: uses the TCP communication mode.</p>
     * <p>*   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The duration of the subscription. The unit of the duration is specified by the PeriodUnit parameter. The parameter only takes effect when InstanceChargeType is set to PrePaid. Valid values:</p>
     * <br>
     * <p>*   Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.</p>
     * <p>*   Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period of the resource. Valid values:</p>
     * <br>
     * <p>*   Week</p>
     * <p>*   Month</p>
     * <br>
     * <p>Default value: Month.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>Specifies whether to set this operation as a synchronous operation. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Sync")
    public Boolean sync;

    /**
     * <p>The performance level of the ESSD to be used as the system disk. Default value: PL1. Valid values:</p>
     * <br>
     * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
     * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL1.</p>
     * <br>
     * <p>For more information about ESSD performance parameters, see [ESSD](~~122389~~).</p>
     */
    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    /**
     * <p>The size of the system disk. Unit: GiB.</p>
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
     * <br>
     * <p>Default value: cloud_efficiency.</p>
     */
    @NameInMap("SystemDiskType")
    public String systemDiskType;

    /**
     * <p>The ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AddNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNodesRequest self = new AddNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddNodesRequest setAllocatePublicAddress(Boolean allocatePublicAddress) {
        this.allocatePublicAddress = allocatePublicAddress;
        return this;
    }
    public Boolean getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    public AddNodesRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public AddNodesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public AddNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddNodesRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public AddNodesRequest setComputeSpotDuration(Integer computeSpotDuration) {
        this.computeSpotDuration = computeSpotDuration;
        return this;
    }
    public Integer getComputeSpotDuration() {
        return this.computeSpotDuration;
    }

    public AddNodesRequest setComputeSpotInterruptionBehavior(String computeSpotInterruptionBehavior) {
        this.computeSpotInterruptionBehavior = computeSpotInterruptionBehavior;
        return this;
    }
    public String getComputeSpotInterruptionBehavior() {
        return this.computeSpotInterruptionBehavior;
    }

    public AddNodesRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public AddNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public AddNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AddNodesRequest setCreateMode(String createMode) {
        this.createMode = createMode;
        return this;
    }
    public String getCreateMode() {
        return this.createMode;
    }

    public AddNodesRequest setDataDisks(java.util.List<AddNodesRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<AddNodesRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public AddNodesRequest setDnsConfig(String dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }
    public String getDnsConfig() {
        return this.dnsConfig;
    }

    public AddNodesRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    public AddNodesRequest setHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }
    public String getHostNamePrefix() {
        return this.hostNamePrefix;
    }

    public AddNodesRequest setHostNameSuffix(String hostNameSuffix) {
        this.hostNameSuffix = hostNameSuffix;
        return this;
    }
    public String getHostNameSuffix() {
        return this.hostNameSuffix;
    }

    public AddNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddNodesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public AddNodesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public AddNodesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AddNodesRequest setInternetMaxBandWidthIn(Integer internetMaxBandWidthIn) {
        this.internetMaxBandWidthIn = internetMaxBandWidthIn;
        return this;
    }
    public Integer getInternetMaxBandWidthIn() {
        return this.internetMaxBandWidthIn;
    }

    public AddNodesRequest setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
        this.internetMaxBandWidthOut = internetMaxBandWidthOut;
        return this;
    }
    public Integer getInternetMaxBandWidthOut() {
        return this.internetMaxBandWidthOut;
    }

    public AddNodesRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public AddNodesRequest setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public AddNodesRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public AddNodesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AddNodesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AddNodesRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

    public AddNodesRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public AddNodesRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public AddNodesRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public AddNodesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public AddNodesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class AddNodesRequestDataDisks extends TeaModel {
        /**
         * <p>The type of the data disk. Valid values:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: SSD</p>
         * <p>*   cloud_essd: ESSD</p>
         * <p>*   cloud: basic disk</p>
         * <br>
         * <p>Default value: cloud_efficiency.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>Specifies whether the data disk is released when the node is released. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: true.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskDeleteWithInstance")
        public Boolean dataDiskDeleteWithInstance;

        /**
         * <p>Specifies whether to encrypt the data disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskEncrypted")
        public Boolean dataDiskEncrypted;

        /**
         * <p>The KMS key ID of the data disk.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskKMSKeyId")
        public String dataDiskKMSKeyId;

        /**
         * <p>The performance level of the ESSD used as the data disk. The parameter only takes effect only when the DataDisks.N.DataDiskCategory parameter is set to cloud_essd. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL1.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * <br>
         * <p>Valid values: 40 to 500.</p>
         * <br>
         * <p>Default value: 40.</p>
         * <br>
         * <p>Valid values of N: 0 to 16.</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        public static AddNodesRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            AddNodesRequestDataDisks self = new AddNodesRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public AddNodesRequestDataDisks setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public AddNodesRequestDataDisks setDataDiskDeleteWithInstance(Boolean dataDiskDeleteWithInstance) {
            this.dataDiskDeleteWithInstance = dataDiskDeleteWithInstance;
            return this;
        }
        public Boolean getDataDiskDeleteWithInstance() {
            return this.dataDiskDeleteWithInstance;
        }

        public AddNodesRequestDataDisks setDataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }
        public Boolean getDataDiskEncrypted() {
            return this.dataDiskEncrypted;
        }

        public AddNodesRequestDataDisks setDataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }
        public String getDataDiskKMSKeyId() {
            return this.dataDiskKMSKeyId;
        }

        public AddNodesRequestDataDisks setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public AddNodesRequestDataDisks setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

}
