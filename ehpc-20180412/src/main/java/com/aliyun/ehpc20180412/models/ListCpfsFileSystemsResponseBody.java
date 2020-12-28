// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemList")
    public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemList> fileSystemList;

    public static ListCpfsFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCpfsFileSystemsResponseBody self = new ListCpfsFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCpfsFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListCpfsFileSystemsResponseBody setFileSystemList(java.util.List<ListCpfsFileSystemsResponseBodyFileSystemList> fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemList> getFileSystemList() {
        return this.fileSystemList;
    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("VswId")
        public String vswId;

        @NameInMap("NetworkType")
        public String networkType;

        public static ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList self = new ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemList extends TeaModel {
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("Capacity")
        public String capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MountTargetList")
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList> mountTargetList;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Destription")
        public String destription;

        @NameInMap("RegionId")
        public String regionId;

        public static ListCpfsFileSystemsResponseBodyFileSystemList build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemList self = new ListCpfsFileSystemsResponseBodyFileSystemList();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setMountTargetList(java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList> mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public java.util.List<ListCpfsFileSystemsResponseBodyFileSystemListMountTargetList> getMountTargetList() {
            return this.mountTargetList;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
