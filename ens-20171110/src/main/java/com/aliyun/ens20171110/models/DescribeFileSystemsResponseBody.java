// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The collection of file system information.</p>
     */
    @NameInMap("FileSystems")
    public java.util.List<DescribeFileSystemsResponseBodyFileSystems> fileSystems;

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
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>762DD527-358B-1E48-8005-CCE3ED4EB9E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The mount target path.</p>
         * 
         * <strong>example:</strong>
         * <p><em>.</em>.<em>.</em>:/${FileSystemName}/{MountTargetName}</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The mount target name.</p>
         * 
         * <strong>example:</strong>
         * <p>target1</p>
         */
        @NameInMap("MountTargetName")
        public String mountTargetName;

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n-****</p>
         */
        @NameInMap("NetWorkId")
        public String netWorkId;

        /**
         * <p>The mount target status. Valid values:</p>
         * <ul>
         * <li>active: Available.</li>
         * <li>inactive: Unavailable.</li>
         * <li>pending: Processing a task.</li>
         * <li>deleting: Being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
         * <p>The capacity. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The time when the file system was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31 12:00:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c50f8*****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The file system name.</p>
         * 
         * <strong>example:</strong>
         * <p>FileSystem1</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The file system usage.
         * Non-real-time usage. It indicates the maximum usage in the previous hour. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("MeteredSize")
        public Long meteredSize;

        /**
         * <p>The collection of mount target information.</p>
         */
        @NameInMap("MountTargets")
        public java.util.List<DescribeFileSystemsResponseBodyFileSystemsMountTargets> mountTargets;

        /**
         * <p>The billing method. Valid values: PostPaid (pay-as-you-go).</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The file system protocol type. Valid values:</p>
         * <ul>
         * <li>NFS: NFS protocol.</li>
         * <li>SMB: SMB protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The file system status. Valid values:</p>
         * <ul>
         * <li>pending: The file system is processing a node.</li>
         * <li>running: The file system is active. You can perform What to do next, such as creating a mount target, only when the status is running.</li>
         * <li>stopped: The file system is unavailable.</li>
         * <li>extending: The file system is being expanded.</li>
         * <li>stopping: The file system is being stopped.</li>
         * <li>deleting: The file system is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>capacity: Storage-optimized.</li>
         * <li>performance: Extreme.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>capacity</p>
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

        public DescribeFileSystemsResponseBodyFileSystems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
