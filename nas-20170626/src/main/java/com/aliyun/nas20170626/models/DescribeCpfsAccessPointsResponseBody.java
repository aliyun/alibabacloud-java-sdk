// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeCpfsAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPoints")
    public java.util.List<DescribeCpfsAccessPointsResponseBodyAccessPoints> accessPoints;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>A323836B-5BC6-45A6-8048-60675C23****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCpfsAccessPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCpfsAccessPointsResponseBody self = new DescribeCpfsAccessPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCpfsAccessPointsResponseBody setAccessPoints(java.util.List<DescribeCpfsAccessPointsResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }
    public java.util.List<DescribeCpfsAccessPointsResponseBodyAccessPoints> getAccessPoints() {
        return this.accessPoints;
    }

    public DescribeCpfsAccessPointsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCpfsAccessPointsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCpfsAccessPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCpfsAccessPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/path</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("RootPathStatus")
        public String rootPathStatus;

        public static DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory build(java.util.Map<String, ?> map) throws Exception {
            DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory self = new DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory();
            return TeaModel.build(map, self);
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory setRootPathStatus(String rootPathStatus) {
            this.rootPathStatus = rootPathStatus;
            return this;
        }
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

    }

    public static class DescribeCpfsAccessPointsResponseBodyAccessPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
         */
        @NameInMap("ARN")
        public String ARN;

        /**
         * <strong>example:</strong>
         * <p>ap-ie15y*****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <strong>example:</strong>
         * <p>2026-03-28T06:32:14Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>bmcpfs-290r9c75fnb0il8d8v1</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>2025-03-28T06:32:14Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RootDirectory")
        public DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory rootDirectory;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCpfsAccessPointsResponseBodyAccessPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeCpfsAccessPointsResponseBodyAccessPoints self = new DescribeCpfsAccessPointsResponseBodyAccessPoints();
            return TeaModel.build(map, self);
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setARN(String ARN) {
            this.ARN = ARN;
            return this;
        }
        public String getARN() {
            return this.ARN;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setRootDirectory(DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory getRootDirectory() {
            return this.rootDirectory;
        }

        public DescribeCpfsAccessPointsResponseBodyAccessPoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
