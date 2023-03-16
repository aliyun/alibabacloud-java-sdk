// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The list of file systems.</p>
     */
    @NameInMap("FileSystemList")
    public ListCpfsFileSystemsResponseBodyFileSystemList fileSystemList;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCpfsFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCpfsFileSystemsResponseBody self = new ListCpfsFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCpfsFileSystemsResponseBody setFileSystemList(ListCpfsFileSystemsResponseBodyFileSystemList fileSystemList) {
        this.fileSystemList = fileSystemList;
        return this;
    }
    public ListCpfsFileSystemsResponseBodyFileSystemList getFileSystemList() {
        return this.fileSystemList;
    }

    public ListCpfsFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListCpfsFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets extends TeaModel {
        /**
         * <p>The domain where the mount target resides.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target. Valid values:</p>
         * <br>
         * <p>*   Active: The mount target is available.</p>
         * <p>*   Inactive: The mount target is unavailable.</p>
         * <p>*   Pending: The mount target is being mounted.</p>
         * <p>*   Deleting: The mount target is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID of the instance.</p>
         */
        @NameInMap("VswId")
        public String vswId;

        public static ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets self = new ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets();
            return TeaModel.build(map, self);
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetListMountTargets setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
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
        /**
         * <p>The capacity of the file system. Unit: GiB.</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The time when the file system was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the file system.</p>
         */
        @NameInMap("Destription")
        public String destription;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The mount targets.</p>
         */
        @NameInMap("MountTargetList")
        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList;

        /**
         * <p>The protocol type that is applied to the mounted file system. Valid values:</p>
         * <br>
         * <p>*   NFS</p>
         * <p>*   SMB</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListCpfsFileSystemsResponseBodyFileSystemListFileSystems build(java.util.Map<String, ?> map) throws Exception {
            ListCpfsFileSystemsResponseBodyFileSystemListFileSystems self = new ListCpfsFileSystemsResponseBodyFileSystemListFileSystems();
            return TeaModel.build(map, self);
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

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setDestription(String destription) {
            this.destription = destription;
            return this;
        }
        public String getDestription() {
            return this.destription;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setMountTargetList(ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList) {
            this.mountTargetList = mountTargetList;
            return this;
        }
        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList getMountTargetList() {
            return this.mountTargetList;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
