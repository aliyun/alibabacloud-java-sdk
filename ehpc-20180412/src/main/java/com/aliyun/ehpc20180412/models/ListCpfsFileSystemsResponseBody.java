// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("FileSystemList")
    public ListCpfsFileSystemsResponseBodyFileSystemList fileSystemList;

    public static ListCpfsFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCpfsFileSystemsResponseBody self = new ListCpfsFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCpfsFileSystemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCpfsFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCpfsFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCpfsFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCpfsFileSystemsResponseBody setFileSystemList(ListCpfsFileSystemsResponseBodyFileSystemList fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public ListCpfsFileSystemsResponseBodyFileSystemList getFileSystemList() {
        return this.fileSystemList;
    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VswId")
        public String vswId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        public static ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets self = new ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList extends TeaModel {
        @NameInMap("MountTargets")
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> mountTargets;

        public static ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList self = new ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList setMountTargets(java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> getMountTargets() {
            return this.mountTargets;
        }

    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemListFileSystems extends TeaModel {
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Destription")
        public String destription;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("MountTargetList")
        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList;

        public static ListCpfsFileSystemsResponseBodyFileSystemListFileSystems build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListFileSystems self = new ListCpfsFileSystemsResponseBodyFileSystemListFileSystems();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setMountTargetList(ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList getMountTargetList() {
            return this.mountTargetList;
        }

    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemList extends TeaModel {
        @NameInMap("FileSystems")
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystems> fileSystems;

        public static ListCpfsFileSystemsResponseBodyFileSystemList build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemList self = new ListCpfsFileSystemsResponseBodyFileSystemList();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setFileSystems(java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListFileSystems> getFileSystems() {
            return this.fileSystems;
        }

    }

}
