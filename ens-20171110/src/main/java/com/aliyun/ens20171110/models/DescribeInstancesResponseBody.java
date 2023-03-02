// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("device_type")
        public String deviceType;

        @NameInMap("disk_type")
        public String diskType;

        @NameInMap("name")
        public String name;

        @NameInMap("storage")
        public Integer storage;

        /**
         * <p>UUID。</p>
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
        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("PrivateIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress privateIpAddress;

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
        @NameInMap("GateWay")
        public String gateWay;

        @NameInMap("Ip")
        public String ip;

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
        @NameInMap("GateWay")
        public String gateWay;

        @NameInMap("Ip")
        public String ip;

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
        @NameInMap("Category")
        public String category;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("device_type")
        public String deviceType;

        @NameInMap("disk_type")
        public String diskType;

        @NameInMap("name")
        public String name;

        @NameInMap("storage")
        public Integer storage;

        /**
         * <p>UUID。</p>
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

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DataDisk")
        public DescribeInstancesResponseBodyInstancesInstanceDataDisk dataDisk;

        @NameInMap("Disk")
        public Integer disk;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InnerIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceResourceType")
        public String instanceResourceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Schema of Response</p>
         */
        @NameInMap("NetworkAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes networkAttributes;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("PrivateIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses privateIpAddresses;

        @NameInMap("PublicIpAddress")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress;

        @NameInMap("PublicIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses publicIpAddresses;

        @NameInMap("SecurityGroupIds")
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("Status")
        public String status;

        /**
         * <p>Schema of Response</p>
         */
        @NameInMap("SystemDisk")
        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk systemDisk;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
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
