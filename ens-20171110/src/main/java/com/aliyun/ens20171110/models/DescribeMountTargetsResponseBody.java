// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsResponseBody extends TeaModel {
    /**
     * <p>The information about mount targets.</p>
     */
    @NameInMap("MountTargets")
    public java.util.List<DescribeMountTargetsResponseBodyMountTargets> mountTargets;

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
     * <p>The total number of mount targets.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMountTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsResponseBody self = new DescribeMountTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsResponseBody setMountTargets(java.util.List<DescribeMountTargetsResponseBodyMountTargets> mountTargets) {
        this.mountTargets = mountTargets;
        return this;
    }
    public java.util.List<DescribeMountTargetsResponseBodyMountTargets> getMountTargets() {
        return this.mountTargets;
    }

    public DescribeMountTargetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMountTargetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMountTargetsResponseBodyMountTargets extends TeaModel {
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
         * <p>The state of the mount target. Valid values:</p>
         * <br>
         * <p>*   active: The mount target is available.</p>
         * <p>*   inactive: The mount target is unavailable.</p>
         * <p>*   pending: A task is being queued for the mount target.</p>
         * <p>*   deleting: The mount target is being deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeMountTargetsResponseBodyMountTargets build(java.util.Map<String, ?> map) throws Exception {
            DescribeMountTargetsResponseBodyMountTargets self = new DescribeMountTargetsResponseBodyMountTargets();
            return TeaModel.build(map, self);
        }

        public DescribeMountTargetsResponseBodyMountTargets setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeMountTargetsResponseBodyMountTargets setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeMountTargetsResponseBodyMountTargets setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeMountTargetsResponseBodyMountTargets setMountTargetName(String mountTargetName) {
            this.mountTargetName = mountTargetName;
            return this;
        }
        public String getMountTargetName() {
            return this.mountTargetName;
        }

        public DescribeMountTargetsResponseBodyMountTargets setNetWorkId(String netWorkId) {
            this.netWorkId = netWorkId;
            return this;
        }
        public String getNetWorkId() {
            return this.netWorkId;
        }

        public DescribeMountTargetsResponseBodyMountTargets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
