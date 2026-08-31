// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeCpfsAccessPointsResponseBody extends TeaModel {
    /**
     * <p>The access point information.</p>
     */
    @NameInMap("AccessPoints")
    public java.util.List<DescribeCpfsAccessPointsResponseBodyAccessPoints> accessPoints;

    /**
     * <p>The page number of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page.
     * Valid values: 1 to 100.<br>Default value: 10.</p>
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
     * <p>A323836B-5BC6-45A6-8048-60675C23****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access points.</p>
     * 
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
         * <p>The root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        /**
         * <p>The current status of the root directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Unknown: The root path status is unknown.</li>
         * <li>NotExist: The root path does not exist. It may have been deleted by the user.</li>
         * <li>Ready: The root path status is normal.</li>
         * </ul>
         * 
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
         */
        @NameInMap("ARN")
        public String ARN;

        /**
         * <p>The access point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-ie15y*****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The time when the access point was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-28T06:32:14Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290r9c75fnb0il8d8v1</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The time when the access point was last modified. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-28T06:32:14Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The root directory information.</p>
         */
        @NameInMap("RootDirectory")
        public DescribeCpfsAccessPointsResponseBodyAccessPointsRootDirectory rootDirectory;

        /**
         * <p>The current status of the access point.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Active: available</li>
         * <li>Inactive: unavailable</li>
         * <li>Pending: being created</li>
         * <li>Deleting: being deleted</li>
         * </ul>
         * <blockquote>
         * <p>The file system can be mounted only when the status is Active.</p>
         * </blockquote>
         * 
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
