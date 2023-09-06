// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    /**
     * <p>The list of file systems.</p>
     */
    @NameInMap("FileSystemList")
    public ListFileSystemWithMountTargetsResponseBodyFileSystemList fileSystemList;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values: 1 to 50. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFileSystemWithMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemWithMountTargetsResponseBody self = new ListFileSystemWithMountTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileSystemWithMountTargetsResponseBody setFileSystemList(ListFileSystemWithMountTargetsResponseBodyFileSystemList fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public ListFileSystemWithMountTargetsResponseBodyFileSystemList getFileSystemList() {
        return this.fileSystemList;
    }

    public ListFileSystemWithMountTargetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListFileSystemWithMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets extends TeaModel {
        /**
         * <p>Specifies whether to use the user default permission group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: ueses the default permission group. If you use the default permission group, access from all IP addresses are allowed. The default permission group and the permission rules in the default permission group cannot be deleted.</p>
         * <p>*   false: does not use the default permission group.</p>
         */
        @NameInMap("AccessGroup")
        public String accessGroup;

        /**
         * <p>The domain where the mount target resides.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type of the cluster. Valid values:</p>
         * <br>
         * <p>*   vpc: Virtual Private Cloud (VPC)</p>
         * <p>*   classic: the classic network</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target. Valid values:</p>
         * <br>
         * <p>*   Active: The mount target is available.</p>
         * <p>*   Inactive: The mount target is unavailable.</p>
         * <p>*   Pending: The mount target is being created or modified.</p>
         * <p>*   Deleting: The mount target is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VswId")
        public String vswId;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setAccessGroup(String accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public String getAccessGroup() {
            return this.accessGroup;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
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

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
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

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageListPackages extends TeaModel {
        /**
         * <p>The ID of the storage plan.</p>
         */
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

    public static class ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems extends TeaModel {
        /**
         * <p>The bandwidth of the file system. Unit: MB/s.</p>
         */
        @NameInMap("BandWidth")
        public Integer bandWidth;

        /**
         * <p>The capacity of the file system. Unit: GiB.</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The time at which the file system is created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         */
        @NameInMap("Destription")
        public String destription;

        /**
         * <p>Specifies whether to encrypt the data in the file system.</p>
         * <br>
         * <p>You can use keys that are managed by Key Management Service (KMS) to encrypt the data that is stored in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0 (default): The data in the file system is not encrypted.</p>
         * <p>*   1: NAS-managed keys are used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to standard or extreme.</p>
         * <p>*   2: KMS-managed keys are used to encrypt the data in the file system. This value is valid only if the FileSystemType parameter is set to extreme.</p>
         */
        @NameInMap("EncryptType")
        public Integer encryptType;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The type of the file system. Valid values:</p>
         * <br>
         * <p>*   standard: general-purpose NAS. extreme: Extreme NAS.</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The used storage of the NAS file system. Unit: byte.</p>
         */
        @NameInMap("MeteredSize")
        public Integer meteredSize;

        /**
         * <p>The mount targets.</p>
         */
        @NameInMap("MountTargetList")
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList;

        /**
         * <p>The list of storage plans.</p>
         */
        @NameInMap("PackageList")
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList packageList;

        /**
         * <p>The protocol type of the file system. Valid values:</p>
         * <br>
         * <p>*   NFS- SMB</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the file system. Valid values:</p>
         * <br>
         * <p>*   Pending: The file system is processing a task.</p>
         * <p>*   Running: The file system is available.</p>
         * <p>*   Stopped: The file system is unavailable.</p>
         * <p>*   Extending: The file system is being scaled out.</p>
         * <p>*   Stopping: The file system is being disabled.</p>
         * <p>*   Deleting: The file system is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type of the file system.</p>
         * <br>
         * <p>*   Valid values when FileSystemType is set to standard: Capacity and Performance. Valid values when FileSystemType is set to extreme: standard and advance.</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The VPC ID of the node.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems build(java.util.Map<String, ?> map) throws Exception {
            ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems self = new ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems();
            return TeaModel.build(map, self);
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
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

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
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

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setMountTargetList(ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsMountTargetList getMountTargetList() {
            return this.mountTargetList;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setPackageList(ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList packageList) {
            this.packageList = packageList;
            return this;
        }
        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystemsPackageList getPackageList() {
            return this.packageList;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListFileSystemWithMountTargetsResponseBodyFileSystemListFileSystems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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
