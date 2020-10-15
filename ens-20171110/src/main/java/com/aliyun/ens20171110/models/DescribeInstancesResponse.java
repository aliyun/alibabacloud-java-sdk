// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeInstancesResponseInstances instances;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponse setInstances(DescribeInstancesResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseInstances getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseInstancesInstanceDataDiskDataDisk extends TeaModel {
        @NameInMap("device_type")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("storage")
        @Validation(required = true)
        public Integer storage;

        @NameInMap("uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("disk_type")
        @Validation(required = true)
        public String diskType;

        @NameInMap("name")
        @Validation(required = true)
        public String name;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        public static DescribeInstancesResponseInstancesInstanceDataDiskDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDataDiskDataDisk self = new DescribeInstancesResponseInstancesInstanceDataDiskDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseInstancesInstanceDataDiskDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceDataDisk extends TeaModel {
        @NameInMap("DataDisk")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceDataDiskDataDisk> dataDisk;

        public static DescribeInstancesResponseInstancesInstanceDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDataDisk self = new DescribeInstancesResponseInstancesInstanceDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceDataDisk setDataDisk(java.util.List<DescribeInstancesResponseInstancesInstanceDataDiskDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstanceDataDiskDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("GateWay")
        @Validation(required = true)
        public String gateWay;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        public static DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress self = new DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeInstancesResponseInstancesInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePublicIpAddresses self = new DescribeInstancesResponseInstancesInstancePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddresses setPublicIpAddress(java.util.List<DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstancePublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("GateWay")
        @Validation(required = true)
        public String gateWay;

        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        public static DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress self = new DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress setGateWay(String gateWay) {
            this.gateWay = gateWay;
            return this;
        }
        public String getGateWay() {
            return this.gateWay;
        }

        public DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePrivateIpAddresses extends TeaModel {
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress> privateIpAddress;

        public static DescribeInstancesResponseInstancesInstancePrivateIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePrivateIpAddresses self = new DescribeInstancesResponseInstancesInstancePrivateIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePrivateIpAddresses setPrivateIpAddress(java.util.List<DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstancePrivateIpAddressesPrivateIpAddress> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceSystemDisk extends TeaModel {
        @NameInMap("device_type")
        @Validation(required = true)
        public String deviceType;

        @NameInMap("storage")
        @Validation(required = true)
        public Integer storage;

        @NameInMap("uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("disk_type")
        @Validation(required = true)
        public String diskType;

        @NameInMap("name")
        @Validation(required = true)
        public String name;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Size")
        @Validation(required = true)
        public Integer size;

        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("DiskName")
        @Validation(required = true)
        public String diskName;

        public static DescribeInstancesResponseInstancesInstanceSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceSystemDisk self = new DescribeInstancesResponseInstancesInstanceSystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeInstancesResponseInstancesInstanceSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceSecurityGroupIds extends TeaModel {
        // SecurityGroupId
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceInnerIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstanceInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePublicIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePublicIpAddress self = new DescribeInstancesResponseInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstancePublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeInstancesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("Cpu")
        @Validation(required = true)
        public String cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        @NameInMap("Disk")
        @Validation(required = true)
        public Integer disk;

        @NameInMap("InternetMaxBandwidthIn")
        @Validation(required = true)
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(required = true)
        public Integer internetMaxBandwidthOut;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("InstanceResourceType")
        @Validation(required = true)
        public String instanceResourceType;

        @NameInMap("SpecName")
        @Validation(required = true)
        public String specName;

        @NameInMap("OSName")
        @Validation(required = true)
        public String OSName;

        @NameInMap("DataDisk")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceDataDisk dataDisk;

        @NameInMap("PublicIpAddresses")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstancePublicIpAddresses publicIpAddresses;

        @NameInMap("PrivateIpAddresses")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstancePrivateIpAddresses privateIpAddresses;

        @NameInMap("SystemDisk")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceSystemDisk systemDisk;

        @NameInMap("SecurityGroupIds")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("InnerIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceInnerIpAddress innerIpAddress;

        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstancePublicIpAddress publicIpAddress;

        public static DescribeInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstance self = new DescribeInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseInstancesInstance setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeInstancesResponseInstancesInstance setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseInstancesInstance setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeInstancesResponseInstancesInstance setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeInstancesResponseInstancesInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeInstancesResponseInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseInstancesInstance setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeInstancesResponseInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeInstancesResponseInstancesInstance setInstanceResourceType(String instanceResourceType) {
            this.instanceResourceType = instanceResourceType;
            return this;
        }
        public String getInstanceResourceType() {
            return this.instanceResourceType;
        }

        public DescribeInstancesResponseInstancesInstance setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

        public DescribeInstancesResponseInstancesInstance setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeInstancesResponseInstancesInstance setDataDisk(DescribeInstancesResponseInstancesInstanceDataDisk dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceDataDisk getDataDisk() {
            return this.dataDisk;
        }

        public DescribeInstancesResponseInstancesInstance setPublicIpAddresses(DescribeInstancesResponseInstancesInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeInstancesResponseInstancesInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeInstancesResponseInstancesInstance setPrivateIpAddresses(DescribeInstancesResponseInstancesInstancePrivateIpAddresses privateIpAddresses) {
            this.privateIpAddresses = privateIpAddresses;
            return this;
        }
        public DescribeInstancesResponseInstancesInstancePrivateIpAddresses getPrivateIpAddresses() {
            return this.privateIpAddresses;
        }

        public DescribeInstancesResponseInstancesInstance setSystemDisk(DescribeInstancesResponseInstancesInstanceSystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceSystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeInstancesResponseInstancesInstance setSecurityGroupIds(DescribeInstancesResponseInstancesInstanceSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeInstancesResponseInstancesInstance setInnerIpAddress(DescribeInstancesResponseInstancesInstanceInnerIpAddress innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstanceInnerIpAddress getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeInstancesResponseInstancesInstance setPublicIpAddress(DescribeInstancesResponseInstancesInstancePublicIpAddress publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public DescribeInstancesResponseInstancesInstancePublicIpAddress getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstance> instance;

        public static DescribeInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstances self = new DescribeInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstances setInstance(java.util.List<DescribeInstancesResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
