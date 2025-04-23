// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponseBody extends TeaModel {
    /**
     * <p>The queried file systems.</p>
     */
    @NameInMap("FileSystemList")
    public ListFileSystemWithMountTargetsResponseBodyFileSystemList fileSystemList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25638B77-2F19-5DC5-B578-7790CE92052B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>Indicates whether the permission group is the default permission group of the user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The permission group is the default permission group. In this case, all IP addresses are allowed to access the permission group, and the user cannot delete the permission group and permission rules in the permission group.</li>
         * <li>false: The permission group is not the default permission group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        @NameInMap("AccessGroup")
        public String accessGroup;

        /**
         * <p>The domain in which the mount target resides.</p>
         * 
         * <strong>example:</strong>
         * <p>088b****-lj2.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>vpc</li>
         * <li>classic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target. Valid values:</p>
         * <ul>
         * <li>Active: The mount target is available.</li>
         * <li>Inactive: The mount target is unavailable.</li>
         * <li>Pending: The mount target is being created or modified.</li>
         * <li>Deleting: The mount target is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbvb34rtyh6xb3zrehs1****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb34rtyh6xb3zrehs1****</p>
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
         * 
         * <strong>example:</strong>
         * <p>naspackage-0be9c4b624-37****</p>
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
         * <p>The bandwidth of the file system. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("BandWidth")
        public Integer bandWidth;

        /**
         * <p>The capacity of the file system. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("Capacity")
        public Integer capacity;

        /**
         * <p>The time when the file system was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-26 16:36:27</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>FilesDescription</p>
         */
        @NameInMap("Destription")
        public String destription;

        /**
         * <p>Indicates whether data in the file system is encrypted.</p>
         * <p>You can use keys that are managed by Key Management Service (KMS) to encrypt the data in a file system. When you read and write the encrypted data, the data is automatically decrypted.</p>
         * <p>Default value: 0. Valid values:</p>
         * <ul>
         * <li>0: The data in the file system is not encrypted.</li>
         * <li>1: The data in the file system is encrypted by using a NAS-managed key. This parameter is valid if FileSystemType is set to standard or extreme.</li>
         * <li>2: The data in the file system is encrypted by using a KMS-managed key. This parameter is valid only if FileSystemType is set to extreme.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EncryptType")
        public Integer encryptType;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>088b****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The type of the file system. Valid value:</p>
         * <ul>
         * <li>standard: general-purpose network-attached storage (NAS) file systems.</li>
         * <li>extreme: extreme NAS file systems.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The used capacity of the NAS file system. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1216816455</p>
         */
        @NameInMap("MeteredSize")
        public Integer meteredSize;

        /**
         * <p>The list of mount targets.</p>
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
         * <ul>
         * <li>NFS- SMB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the file system. Valid values:</p>
         * <ul>
         * <li>Pending: The file system is being created or modified.</li>
         * <li>Running: The file system is available.</li>
         * <li>Stopped: The file system is unavailable.</li>
         * <li>Extending: The file system is being scaled up.</li>
         * <li>Stopping: The file system is being disabled.</li>
         * <li>Deleting: The file system is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type of the file system.</p>
         * <ul>
         * <li>Valid values if FileSystemType is set to standard: Capacity and Performance.</li>
         * <li>Valid values if FileSystemType is set to extreme: standard and advance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp132kgui8n0targbn1cm</p>
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
