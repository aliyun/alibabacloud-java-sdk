// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The queried file systems.</p>
     */
    @NameInMap("FileSystemList")
    public ListCpfsFileSystemsResponseBodyFileSystemList fileSystemList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>2B900AFE-C938-4551-86E9-97E231BBC876</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The domain in which the mount target resides.</p>
         * 
         * <strong>example:</strong>
         * <p>c0967****.cn-hangzhou.cpfs.nas.aliyuncs.com</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status of the mount target. Valid values:</p>
         * <ul>
         * <li>Active: The mount target is available.</li>
         * <li>Inactive: The mount target is unavailable.</li>
         * <li>Pending: The mount target is being mounted.</li>
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
         * <p>The capacity of the file system. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>5120</p>
         */
        @NameInMap("Capacity")
        public String capacity;

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
         * <p>FilsDestription</p>
         */
        @NameInMap("Destription")
        public String destription;

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>096751****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The mount targets of the file systems.</p>
         */
        @NameInMap("MountTargetList")
        public ListCpfsFileSystemsResponseBodyFileSystemListFileSystemsMountTargetList mountTargetList;

        /**
         * <p>The protocol type that is applied to the mounted file system. Valid values:</p>
         * <ul>
         * <li>NFS</li>
         * <li>SMB</li>
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
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
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
