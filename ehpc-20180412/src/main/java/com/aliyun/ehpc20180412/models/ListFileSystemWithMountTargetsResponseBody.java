// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemList")
    public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemList> fileSystemList;

    public static ListFileSystemWithMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemWithMountTargetsResponseBody self = new ListFileSystemWithMountTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileSystemWithMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFileSystemWithMountTargetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileSystemWithMountTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileSystemWithMountTargetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFileSystemWithMountTargetsResponseBody setFileSystemList(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemList> fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemList> getFileSystemList() {
        return this.fileSystemList;
    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("AccessGroup")
        public String accessGroup;

        @NameInMap("VswId")
        public String vswId;

        @NameInMap("NetworkType")
        public String networkType;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList extends TeaModel {
        @NameInMap("PackageId")
        public String packageId;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("MountTargetList")
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList> mountTargetList;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PackageList")
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList> packageList;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("MeteredSize")
        public Integer meteredSize;

        @NameInMap("EncryptType")
        public Integer encryptType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Destription")
        public String destription;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setMountTargetList(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList> mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListMountTargetList> getMountTargetList() {
            return this.mountTargetList;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setPackageList(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList> packageList) {
            this.packageList = packageList;
            return this;
        }
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListPackageList> getPackageList() {
            return this.packageList;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setMeteredSize(Integer meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Integer getMeteredSize() {
            return this.meteredSize;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

    }

}
