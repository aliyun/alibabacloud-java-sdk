// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster to which the instance belongs.</p>
     * <blockquote>
     * <p>This parameter will be deprecated soon. To ensure future compatibility, use other parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cls-bp67acfmxazb4p****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of vCPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T04:04Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The running mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information about instance performance, see <a href="~~59977#section-svb-w9d-dju~~">Performance mode</a>. </li>
     * <li>Unlimited: unlimited mode. For more information about instance performance, see <a href="~~59977#section-svb-w9d-dju~~">Performance mode</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The dedicated host attributes, which consist of the dedicated host cluster ID (DedicatedHostClusterId), dedicated host ID (DedicatedHostId), and dedicated host name (DedicatedHostName).</p>
     */
    @NameInMap("DedicatedHostAttribute")
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Elastic IP Address (EIP) binding information.</p>
     */
    @NameInMap("EipAddress")
    public DescribeInstanceAttributeResponseBodyEipAddress eipAddress;

    /**
     * <p>Indicates whether the Jumbo Frame feature is enabled for the ECS instance. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: not enabled.</p>
     * </li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>Indicates whether VPC network traffic encryption is enabled for the instance. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: not enabled.<blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableNetworkEncryption")
    public Boolean enableNetworkEncryption;

    /**
     * <p>The expiration time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T04:04Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The hostname of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The ID of the image that the instance is running.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1h46wfpjsjastc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InnerIpAddress")
    public DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-uf6f5trc95ug8t33****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance name</p>
     * 
     * <strong>example:</strong>
     * <p>testInstanceName</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type of the instance. Valid values: </p>
     * <ul>
     * <li>vpc: virtual private cloud (VPC).</li>
     * <li>classic: classic network. The classic network is deprecated. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Deprecation notice</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for public bandwidth. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as upper limits for bandwidths and are not guaranteed. When resource contention occurs, the peak bandwidths may be limited. If your workloads require guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Indicates whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li><p>optimized: I/O optimized.</p>
     * </li>
     * <li><p>none: not I/O optimized.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The memory size. Unit: MiB.</p>
     * 
     * <strong>example:</strong>
     * <p>16384</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The network-related attributes.</p>
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("NetworkOptions")
    public DescribeInstanceAttributeResponseBodyNetworkOptions networkOptions;

    @NameInMap("OperationLocks")
    public DescribeInstanceAttributeResponseBodyOperationLocks operationLocks;

    @NameInMap("PublicIpAddress")
    public DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupIds")
    public DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The serial number of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>51d1353b-22bf-4567-a176-8b3e12e4****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>Pending: being created.</li>
     * <li>Running: running.</li>
     * <li>Starting: being started.</li>
     * <li>Stopping: being stopped.</li>
     * <li>Stopped: stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the instance continues to be billed after it is stopped. Valid values:</p>
     * <ul>
     * <li>KeepCharging: The instance continues to be billed after it is stopped. Inventory resources are reserved for the instance.</li>
     * <li>StopCharging: The instance is not billed after it is stopped. After the instance is stopped, its resources such as vCPUs, memory, and public IP addresses are released. Whether the instance can be restarted depends on resource availability in the current region.</li>
     * <li>Not-applicable: The instance does not support the No Fees for Stopped Instances feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeepCharging</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    /**
     * <p>The VLAN ID of the instance.</p>
     * <blockquote>
     * <p>This parameter will be deprecated soon. To ensure future compatibility, use other parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The VPC attributes.</p>
     */
    @NameInMap("VpcAttributes")
    public DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstanceAttributeResponseBody setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeInstanceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeInstanceAttributeResponseBody setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public DescribeInstanceAttributeResponseBody setDedicatedHostAttribute(DescribeInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute) {
        this.dedicatedHostAttribute = dedicatedHostAttribute;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    public DescribeInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeInstanceAttributeResponseBody setEipAddress(DescribeInstanceAttributeResponseBodyEipAddress eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyEipAddress getEipAddress() {
        return this.eipAddress;
    }

    public DescribeInstanceAttributeResponseBody setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public DescribeInstanceAttributeResponseBody setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
        this.enableNetworkEncryption = enableNetworkEncryption;
        return this;
    }
    public Boolean getEnableNetworkEncryption() {
        return this.enableNetworkEncryption;
    }

    public DescribeInstanceAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeInstanceAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeInstanceAttributeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstanceAttributeResponseBody setInnerIpAddress(DescribeInstanceAttributeResponseBodyInnerIpAddress innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstanceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceAttributeResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstanceAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public DescribeInstanceAttributeResponseBody setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeInstanceAttributeResponseBody setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstanceAttributeResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeInstanceAttributeResponseBody setNetworkOptions(DescribeInstanceAttributeResponseBodyNetworkOptions networkOptions) {
        this.networkOptions = networkOptions;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyNetworkOptions getNetworkOptions() {
        return this.networkOptions;
    }

    public DescribeInstanceAttributeResponseBody setOperationLocks(DescribeInstanceAttributeResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeInstanceAttributeResponseBody setPublicIpAddress(DescribeInstanceAttributeResponseBodyPublicIpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyPublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DescribeInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setSecurityGroupIds(DescribeInstanceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeInstanceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeInstanceAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceAttributeResponseBody setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public DescribeInstanceAttributeResponseBody setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public DescribeInstanceAttributeResponseBody setVpcAttributes(DescribeInstanceAttributeResponseBodyVpcAttributes vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyVpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    public DescribeInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeInstanceAttributeResponseBodyDedicatedHostAttribute extends TeaModel {
        /**
         * <p>The ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-2ze7qrzz6lvbfhr0****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The name of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-autoui-create-ddh-temp</p>
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        public static DescribeInstanceAttributeResponseBodyDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyDedicatedHostAttribute self = new DescribeInstanceAttributeResponseBodyDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-wz9uilio26dfscamm****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The public bandwidth limit of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method for public bandwidth. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay-by-bandwidth.</li>
         * <li>PayByTraffic: pay-by-traffic.</li>
         * </ul>
         * <blockquote>
         * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as upper limits for bandwidths and are not guaranteed. When resource contention occurs, the peak bandwidths may be limited. If your workloads require guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p><code>30.21.**.**</code></p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        public static DescribeInstanceAttributeResponseBodyEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyEipAddress self = new DescribeInstanceAttributeResponseBodyEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeInstanceAttributeResponseBodyEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInnerIpAddress self = new DescribeInstanceAttributeResponseBodyInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyNetworkOptions extends TeaModel {
        /**
         * <p>The bandwidth weight.</p>
         * <p>Different instance types support different values. Call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the bandwidth weight values supported by the current instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc-L1</p>
         */
        @NameInMap("BandwidthWeighting")
        public String bandwidthWeighting;

        /**
         * <p>Indicates whether the Jumbo Frame feature is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: not enabled.</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <p>Indicates whether VPC network traffic encryption is enabled for the instance. Valid values:</p>
         * <ul>
         * <li>true: enabled.</li>
         * <li>false: not enabled.<blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("EnableNetworkEncryption")
        public Boolean enableNetworkEncryption;

        public static DescribeInstanceAttributeResponseBodyNetworkOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyNetworkOptions self = new DescribeInstanceAttributeResponseBodyNetworkOptions();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyNetworkOptions setBandwidthWeighting(String bandwidthWeighting) {
            this.bandwidthWeighting = bandwidthWeighting;
            return this;
        }
        public String getBandwidthWeighting() {
            return this.bandwidthWeighting;
        }

        public DescribeInstanceAttributeResponseBodyNetworkOptions setEnableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        public DescribeInstanceAttributeResponseBodyNetworkOptions setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
            this.enableNetworkEncryption = enableNetworkEncryption;
            return this;
        }
        public Boolean getEnableNetworkEncryption() {
            return this.enableNetworkEncryption;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocksLockReason self = new DescribeInstanceAttributeResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeInstanceAttributeResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyOperationLocks self = new DescribeInstanceAttributeResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyOperationLocks setLockReason(java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyPublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyPublicIpAddress self = new DescribeInstanceAttributeResponseBodyPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyPublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstanceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodySecurityGroupIds self = new DescribeInstanceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress self = new DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyVpcAttributes extends TeaModel {
        /**
         * <p>The IP address of the cloud service, which is used for network communication between VPC-connected cloud services.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.17.**.**</code></p>
         */
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("PrivateIpAddress")
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6ixacqz8osrwnqb****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9e4e9pmbcnj6ki6****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstanceAttributeResponseBodyVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyVpcAttributes self = new DescribeInstanceAttributeResponseBodyVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setPrivateIpAddress(DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseBodyVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
