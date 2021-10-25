// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("FileSystemList")
    public ListFileSystemWithMountTargetsResponseBodyFileSystemList fileSystemList;

    public static ListFileSystemWithMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemWithMountTargetsResponseBody self = new ListFileSystemWithMountTargetsResponseBody();
        return TeaModel.build(map, self);
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

    public ListFileSystemWithMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFileSystemWithMountTargetsResponseBody setFileSystemList(ListFileSystemWithMountTargetsResponseBodyFileSystemList fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public ListFileSystemWithMountTargetsResponseBodyFileSystemList getFileSystemList() {
        return this.fileSystemList;
    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages extends TeaModel {
        @NameInMap("PackageId")
        public String packageId;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList extends TeaModel {
        @NameInMap("Packages")
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages> packages;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList setPackages(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages> getPackages() {
            return this.packages;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets extends TeaModel {
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

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList extends TeaModel {
        @NameInMap("MountTargets")
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> mountTargets;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList setMountTargets(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets> getMountTargets() {
            return this.mountTargets;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("MeteredSize")
        public Integer meteredSize;

        @NameInMap("EncryptType")
        public Integer encryptType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("Destription")
        public String destription;

        @NameInMap("PackageList")
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList packageList;

        @NameInMap("MountTargetList")
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setMeteredSize(Integer meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Integer getMeteredSize() {
            return this.meteredSize;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setPackageList(ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList packageList) {
            this.packageList = packageList;
            return this;
        }
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList getPackageList() {
            return this.packageList;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setMountTargetList(ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList getMountTargetList() {
            return this.mountTargetList;
        }

    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemList extends TeaModel {
        @NameInMap("FileSystems")
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems> fileSystems;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemList build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemList self = new ListFileSystemWithMountTargetsResponseBodyFileSystemList();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemList setFileSystems(java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }
        public java.util.List<ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems> getFileSystems() {
            return this.fileSystems;
        }

    }

}
