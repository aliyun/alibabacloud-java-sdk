// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

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

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk extends TeaModel {
        @NameInMap("device_type")
        public String deviceType;

        @NameInMap("disk_type")
        public String diskType;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("uuid")
        public String uuid;

        @NameInMap("storage")
        public Integer storage;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("Category")
        public String category;

        @NameInMap("name")
        public String name;

        public static DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk self = new DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk();
            return TeaModel.build(map, self);
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

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseBodyInstancesInstanceDataDiskDataDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("GateWay")
        public String gateWay;

        @NameInMap("Isp")
        public String isp;

        public static DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddressesPublicIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
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

    public static class DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("GateWay")
        public String gateWay;

        @NameInMap("Isp")
        public String isp;

        public static DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress self = new DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddressesPrivateIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
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

    public static class DescribeInstancesResponseBodyInstancesInstanceSystemDisk extends TeaModel {
        @NameInMap("device_type")
        public String deviceType;

        @NameInMap("disk_type")
        public String diskType;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("uuid")
        public String uuid;

        @NameInMap("storage")
        public Integer storage;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("Category")
        public String category;

        @NameInMap("name")
        public String name;

        public static DescribeInstancesResponseBodyInstancesInstanceSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstanceSystemDisk self = new DescribeInstancesResponseBodyInstancesInstanceSystemDisk();
            return TeaModel.build(map, self);
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

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("PrivateIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress privateIpAddress;

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

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes setPrivateIpAddress(DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SpecName")
        public String specName;

        @NameInMap("InstanceResourceType")
        public String instanceResourceType;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Disk")
        public Integer disk;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("OSName")
        public String OSName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("DataDisk")
        public DescribeInstancesResponseBodyInstancesInstanceDataDisk dataDisk;

        @NameInMap("PublicIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses publicIpAddresses;

        @NameInMap("PrivateIpAddresses")
        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses privateIpAddresses;

        @NameInMap("SecurityGroupIds")
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("InnerIpAddress")
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress;

        @NameInMap("PublicIpAddress")
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress;

        @NameInMap("SystemDisk")
        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk systemDisk;

        @NameInMap("NetworkAttributes")
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes networkAttributes;

        public static DescribeInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesInstance self = new DescribeInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceResourceType(String instanceResourceType) {
            this.instanceResourceType = instanceResourceType;
            return this;
        }
        public String getInstanceResourceType() {
            return this.instanceResourceType;
        }

        public DescribeInstancesResponseBodyInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

        public DescribeInstancesResponseBodyInstancesInstance setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseBodyInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstancesInstance setDataDisk(DescribeInstancesResponseBodyInstancesInstanceDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddresses(DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPrivateIpAddresses(DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePrivateIpAddresses getPrivateIpAddresses() {
            return this.privateIpAddresses;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSecurityGroupIds(DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseBodyInstancesInstance setInnerIpAddress(DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setPublicIpAddress(DescribeInstancesResponseBodyInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeInstancesResponseBodyInstancesInstance setSystemDisk(DescribeInstancesResponseBodyInstancesInstanceSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeInstancesResponseBodyInstancesInstance setNetworkAttributes(DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesInstanceNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
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
