// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClusterHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("HostList")
    public ListClusterHostResponseBodyHostList hostList;

    public static ListClusterHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterHostResponseBody self = new ListClusterHostResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterHostResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterHostResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterHostResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListClusterHostResponseBody setHostList(ListClusterHostResponseBodyHostList hostList) {
        this.hostList = hostList;
        return this;
    }
    public ListClusterHostResponseBodyHostList getHostList() {
        return this.hostList;
    }

    public static class ListClusterHostResponseBodyHostListHostDiskListDisk extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DiskMountPoint")
        public String diskMountPoint;

        @NameInMap("BlockMountPoint")
        public String blockMountPoint;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Event")
        public String event;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("DiskId")
        public String diskId;

        public static ListClusterHostResponseBodyHostListHostDiskListDisk build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostResponseBodyHostListHostDiskListDisk self = new ListClusterHostResponseBodyHostListHostDiskListDisk();
            return TeaModel.build(map, self);
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setDiskMountPoint(String diskMountPoint) {
            this.diskMountPoint = diskMountPoint;
            return this;
        }
        public String getDiskMountPoint() {
            return this.diskMountPoint;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setBlockMountPoint(String blockMountPoint) {
            this.blockMountPoint = blockMountPoint;
            return this;
        }
        public String getBlockMountPoint() {
            return this.blockMountPoint;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListClusterHostResponseBodyHostListHostDiskListDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

    }

    public static class ListClusterHostResponseBodyHostListHostDiskList extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<ListClusterHostResponseBodyHostListHostDiskListDisk> disk;

        public static ListClusterHostResponseBodyHostListHostDiskList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostResponseBodyHostListHostDiskList self = new ListClusterHostResponseBodyHostListHostDiskList();
            return TeaModel.build(map, self);
        }

        public ListClusterHostResponseBodyHostListHostDiskList setDisk(java.util.List<ListClusterHostResponseBodyHostListHostDiskListDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<ListClusterHostResponseBodyHostListHostDiskListDisk> getDisk() {
            return this.disk;
        }

    }

    public static class ListClusterHostResponseBodyHostListHost extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("DiskList")
        public ListClusterHostResponseBodyHostListHostDiskList diskList;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("HostInstanceId")
        public String hostInstanceId;

        @NameInMap("SupportIpV6")
        public Boolean supportIpV6;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("EmrExpiredTime")
        public String emrExpiredTime;

        @NameInMap("Role")
        public String role;

        public static ListClusterHostResponseBodyHostListHost build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostResponseBodyHostListHost self = new ListClusterHostResponseBodyHostListHost();
            return TeaModel.build(map, self);
        }

        public ListClusterHostResponseBodyHostListHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterHostResponseBodyHostListHost setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListClusterHostResponseBodyHostListHost setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListClusterHostResponseBodyHostListHost setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListClusterHostResponseBodyHostListHost setDiskList(ListClusterHostResponseBodyHostListHostDiskList diskList) {
            this.diskList = diskList;
            return this;
        }
        public ListClusterHostResponseBodyHostListHostDiskList getDiskList() {
            return this.diskList;
        }

        public ListClusterHostResponseBodyHostListHost setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterHostResponseBodyHostListHost setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClusterHostResponseBodyHostListHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListClusterHostResponseBodyHostListHost setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListClusterHostResponseBodyHostListHost setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClusterHostResponseBodyHostListHost setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public ListClusterHostResponseBodyHostListHost setSupportIpV6(Boolean supportIpV6) {
            this.supportIpV6 = supportIpV6;
            return this;
        }
        public Boolean getSupportIpV6() {
            return this.supportIpV6;
        }

        public ListClusterHostResponseBodyHostListHost setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListClusterHostResponseBodyHostListHost setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListClusterHostResponseBodyHostListHost setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListClusterHostResponseBodyHostListHost setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListClusterHostResponseBodyHostListHost setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListClusterHostResponseBodyHostListHost setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListClusterHostResponseBodyHostListHost setEmrExpiredTime(String emrExpiredTime) {
            this.emrExpiredTime = emrExpiredTime;
            return this;
        }
        public String getEmrExpiredTime() {
            return this.emrExpiredTime;
        }

        public ListClusterHostResponseBodyHostListHost setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ListClusterHostResponseBodyHostList extends TeaModel {
        @NameInMap("Host")
        public java.util.List<ListClusterHostResponseBodyHostListHost> host;

        public static ListClusterHostResponseBodyHostList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterHostResponseBodyHostList self = new ListClusterHostResponseBodyHostList();
            return TeaModel.build(map, self);
        }

        public ListClusterHostResponseBodyHostList setHost(java.util.List<ListClusterHostResponseBodyHostListHost> host) {
            this.host = host;
            return this;
        }
        public java.util.List<ListClusterHostResponseBodyHostListHost> getHost() {
            return this.host;
        }

    }

}
