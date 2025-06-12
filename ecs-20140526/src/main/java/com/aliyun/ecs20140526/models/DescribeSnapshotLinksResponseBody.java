// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot chains.</p>
     */
    @NameInMap("SnapshotLinks")
    public DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnapshotLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksResponseBody self = new DescribeSnapshotLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotLinksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotLinksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotLinksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotLinksResponseBody setSnapshotLinks(DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks) {
        this.snapshotLinks = snapshotLinks;
        return this;
    }
    public DescribeSnapshotLinksResponseBodySnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    public DescribeSnapshotLinksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink extends TeaModel {
        /**
         * <p>The type of the snapshot chain. Valid values:</p>
         * <ul>
         * <li>standard: standard snapshot chain.</li>
         * <li>archive: archive snapshot chain.</li>
         * <li>flash: instant access snapshot chain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1h6jmbefj2cyqs****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The instant access feature is enabled. The feature can be enabled only for Enterprise SSDs (ESSDs).</li>
         * <li>false: The instant access feature is disabled. The snapshot is a standard snapshot for which the instant access feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is no longer used. By default, standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The region ID of the source disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the snapshot chain.</p>
         * 
         * <strong>example:</strong>
         * <p>sl-2ze0y1jwzpb1geqx****</p>
         */
        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        /**
         * <p>The ID of the source disk. This parameter is retained even if the source disk is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1d6tsvznfghy7y****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The name of the source disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testSourceDiskName</p>
         */
        @NameInMap("SourceDiskName")
        public String sourceDiskName;

        /**
         * <p>The capacity of the source disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SourceDiskSize")
        public Integer sourceDiskSize;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The total number of snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total size of all snapshots in the snapshot chain. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>2097152</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink self = new DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSnapshotLinkId(String snapshotLinkId) {
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskName(String sourceDiskName) {
            this.sourceDiskName = sourceDiskName;
            return this;
        }
        public String getSourceDiskName() {
            return this.sourceDiskName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskSize(Integer sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Integer getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinks extends TeaModel {
        @NameInMap("SnapshotLink")
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink;

        public static DescribeSnapshotLinksResponseBodySnapshotLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinks self = new DescribeSnapshotLinksResponseBodySnapshotLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinks setSnapshotLink(java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink) {
            this.snapshotLink = snapshotLink;
            return this;
        }
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> getSnapshotLink() {
            return this.snapshotLink;
        }

    }

}
