// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The information about the file systems.</p>
     */
    @NameInMap("FileSystems")
    public java.util.List<DescribeFileSystemsResponseBodyFileSystems> fileSystems;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponseBody self = new DescribeFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponseBody setFileSystems(java.util.List<DescribeFileSystemsResponseBodyFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<DescribeFileSystemsResponseBodyFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public DescribeFileSystemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileSystemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeFileSystemsResponseBodyFileSystemsMountTargets extends TeaModel {
        /**
         * <p>The path of the mount target.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The name of the mount target.</p>
         */
        @NameInMap("MountTargetName")
        public String mountTargetName;

        /**
         * <p>The ID of the network.</p>
         */
        @NameInMap("NetWorkId")
        public String netWorkId;

        /**
         * <p>The status of the mount target. Valid values:</p>
         * <br>
         * <p>*   active: The mount target is available.</p>
         * <p>*   inactive: The mount target is unavailable.</p>
         * <p>*   pending: The task is running.</p>
         * <p>*   deleting: The mount target is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeFileSystemsResponseBodyFileSystemsMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystemsMountTargets self = new DescribeFileSystemsResponseBodyFileSystemsMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystemsMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeFileSystemsResponseBodyFileSystemsMountTargets setMountTargetName(String mountTargetName) {
            this.mountTargetName = mountTargetName;
            return this;
        }
        public String getMountTargetName() {
            return this.mountTargetName;
        }

        public DescribeFileSystemsResponseBodyFileSystemsMountTargets setNetWorkId(String netWorkId) {
            this.netWorkId = netWorkId;
            return this;
        }
        public String getNetWorkId() {
            return this.netWorkId;
        }

        public DescribeFileSystemsResponseBodyFileSystemsMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeFileSystemsResponseBodyFileSystems extends TeaModel {
        /**
         * <p>The capacity of the file system. Unit: MiB.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The time when the file system was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The ID of the file system.</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The name of the file system.</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The storage usage of the file system. The value of this parameter is the maximum storage usage of the file system over the last hour. Unit: bytes.</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The information about mount targets.</p>
         */
        @NameInMap("MountTargets")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsMountTargets> mountTargets;

        /**
         * <p>The billing method. PostPaid is returned. PostPaid indicates the pay-as-you-go billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The protocol type of the file system. Valid values:</p>
         * <br>
         * <p>*   NFS: Network File System (NFS)</p>
         * <p>*   SMB: Server Message Block (SMB)</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The status of the file system. Valid values:</p>
         * <br>
         * <p>*   pending: The file system is being created or modified.</p>
         * <p>*   running: The file system is available. Before you create a mount target for the file system, make sure that the file system is in the running state.</p>
         * <p>*   stopped: The file system is unavailable.</p>
         * <p>*   extending: The file system is being scaled out.</p>
         * <p>*   stopping: The file system is being disabled.</p>
         * <p>*   deleting: The file system is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type. Valid values:</p>
         * <br>
         * <p>*   capacity: Capacity NAS file systems</p>
         * <p>*   performance: Performance NAS file systems</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystems self = new DescribeFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemsResponseBodyFileSystems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFileSystemsResponseBodyFileSystems setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeFileSystemsResponseBodyFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFileSystemsResponseBodyFileSystems setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public DescribeFileSystemsResponseBodyFileSystems setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeFileSystemsResponseBodyFileSystems setMountTargets(java.util.List<DescribeFileSystemsResponseBodyFileSystemsMountTargets> mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsMountTargets> getMountTargets() {
            return this.mountTargets;
        }

        public DescribeFileSystemsResponseBodyFileSystems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeFileSystemsResponseBodyFileSystems setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeFileSystemsResponseBodyFileSystems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFileSystemsResponseBodyFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
