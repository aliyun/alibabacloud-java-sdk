// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The returned service code. 0 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned instance information. It is an array that consists of InstanceAttributesType data.</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk extends TeaModel {
        /**
         * <p>The category of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>*   **file**: local disk.</p>
         * <p>*   **pangu**: ultra disk.</p>
         * <p>*   **local_hdd**: local HDD.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The size of the disk. Unit: MiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The extended field of the disk category. Valid values:</p>
         * <br>
         * <p>*   **file**: local disk.</p>
         * <p>*   **pangu**: ultra disk.</p>
         * <p>*   **local_hdd**: local HDD.</p>
         */
        @NameInMap("device_type")
        public String deviceType;

        /**
         * <p>The type of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>**system**: system disk. **data**: data disk.</p>
         */
        @NameInMap("disk_type")
        public String diskType;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The size of the disk. Unit: MiB.</p>
         */
        @NameInMap("storage")
        public Integer storage;

        /**
         * <p>The UUID of the disk.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk self = new DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDataDisk extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk> dataDisk;

        public static DescribeInstancesResponseBodyInstancesInstanceDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDataDisk self = new DescribeInstancesResponseBodyInstancesInstanceDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDisk setDataDisk(java.util.List<DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress self = new DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes extends TeaModel {
        /**
         * <p>The ID of the network.</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>Details of the private IP addresses.</p>
         */
        @NameInMap("PrivateIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress privateIpAddress;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes self = new DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes setPrivateIpAddress(DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress extends TeaModel {
        /**
         * <p>The gateway.</p>
         */
        @NameInMap("GateWay")
        public String gateWay;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ISP.</p>
         */
        @NameInMap("Isp")
        public String isp;

        public static DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress> privateIpAddress;

        public static DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses self = new DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses setPrivateIpAddress(java.util.List<DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        /**
         * <p>The gateway.</p>
         */
        @NameInMap("GateWay")
        public String gateWay;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The Internet service provider (ISP).</p>
         */
        @NameInMap("Isp")
        public String isp;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses setPublicIpAddress(java.util.List<DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceSystemDisk extends TeaModel {
        /**
         * <p>The category of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>*   **file**: local disk.</p>
         * <p>*   **pangu**: ultra disk.</p>
         * <p>*   **local_hdd**: local HDD.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The size of the disk. Unit: MiB.</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The extended field of the disk category. Valid values:</p>
         * <br>
         * <p>*   **file**: local disk.</p>
         * <p>*   **pangu**: ultra disk.</p>
         * <p>*   **local_hdd**: local HDD.</p>
         */
        @NameInMap("device_type")
        public String deviceType;

        /**
         * <p>The type of the cloud disk or local disk. Valid values:</p>
         * <br>
         * <p>*   **system**: system disk.</p>
         * <p>*   **data**: data disk.</p>
         */
        @NameInMap("disk_type")
        public String diskType;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The size of the disk. Unit: MiB.</p>
         */
        @NameInMap("storage")
        public Integer storage;

        /**
         * <p>The UUID of the disk.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static DescribeInstancesResponseBodyInstancesInstanceSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceSystemDisk self = new DescribeInstancesResponseBodyInstancesInstanceSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTagsTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInstancesResponseBodyInstancesInstanceTagsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTagsTags self = new DescribeInstancesResponseBodyInstancesInstanceTagsTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInstancesResponseBodyInstancesInstanceTagsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTags> tags;

        public static DescribeInstancesResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceTags self = new DescribeInstancesResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstanceTags setTags(java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstanceTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Details of the data disk.</p>
         */
        @NameInMap("DataDisk")
        public DescribeInstancesResponseBodyInstancesInstanceDataDisk dataDisk;

        /**
         * <p>The total size of the disk. Unit: MiB.</p>
         */
        @NameInMap("Disk")
        public Integer disk;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The expiration time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The hostname of the instance.</p>
         * <br>
         * <p>*   The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
         * <p>*   For a Windows instance, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot contain periods (.) or contain only digits.</p>
         * <p>*   For other operating systems: The hostname must be 2 to 64 characters in length and can contain letters, digits, and hyphens (-). It can be separated by periods (.).</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The private IP addresses of the instances.</p>
         */
        @NameInMap("InnerIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the virtual private cloud (VPC).</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <br>
         * <p>*   EnsInstance: ENS instances that you purchase.</p>
         * <p>*   EnsService: ENS instances that belong to edge services.</p>
         * <p>*   BuildMachine: ENS instances that are configured with image builders.</p>
         * <p>*   EnsPostPaidInstance: pay-as-you-go ENS instances that you purchase.</p>
         */
        @NameInMap("InstanceResourceType")
        public String instanceResourceType;

        /**
         * <p>The instance family. Valid values:</p>
         * <br>
         * <p>*   x86_vm: x86-based computing instance.</p>
         * <p>*   x86_pm: x86-based physical machine.</p>
         * <p>*   x86_bmi: x86-based bare metal instance.</p>
         * <p>*   x86_bm: bare metal instance with the SmartNIC.</p>
         * <p>*   pc_bmi: heterogeneous bare metal instance.</p>
         * <p>*   pc_vm: heterogeneous virtual machine.</p>
         * <p>*   arm_bmi: Arm-based computing instance.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The maximum outbound bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        /**
         * <p>The minimum inbound bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The memory size. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Details of the network.</p>
         */
        @NameInMap("NetworkAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes networkAttributes;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>Details of the private IP addresses.</p>
         */
        @NameInMap("PrivateIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses privateIpAddresses;

        /**
         * <p>The public IP addresses of the instances.</p>
         */
        @NameInMap("PublicIpAddress")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress;

        /**
         * <p>Details of the public IP addresses.</p>
         */
        @NameInMap("PublicIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses publicIpAddresses;

        /**
         * <p>The IDs of the security groups.</p>
         */
        @NameInMap("SecurityGroupIds")
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds;

        /**
         * <p>The code of the instance type.</p>
         */
        @NameInMap("SpecName")
        public String specName;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   Running</p>
         * <p>*   Expired</p>
         * <p>*   Stopped</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Details of the system disk.</p>
         */
        @NameInMap("SystemDisk")
        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk systemDisk;

        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesInstanceTags tags;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstance setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDataDisk(DescribeInstancesResponseBodyInstancesInstanceDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInnerIpAddress(DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceResourceType(String instanceResourceType) {
            this.instanceResourceType = instanceResourceType;
            return this;
        }
        public String getInstanceResourceType() {
            return this.instanceResourceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesInstance setNetworkAttributes(DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPrivateIpAddresses(DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses getPrivateIpAddresses() {
            return this.privateIpAddresses;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddress(DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddresses(DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSecurityGroupIds(DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSystemDisk(DescribeInstancesResponseBodyInstancesInstanceSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setTags(DescribeInstancesResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setInstance(java.util.List<DescribeInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
