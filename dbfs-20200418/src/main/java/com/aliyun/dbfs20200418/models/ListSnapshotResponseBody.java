// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotResponseBody extends TeaModel {
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotResponseBodySnapshots> snapshots;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotResponseBody self = new ListSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSnapshotResponseBody setSnapshots(java.util.List<ListSnapshotResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListSnapshotResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public ListSnapshotResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSnapshotResponseBodySnapshots extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>1609330367000</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1609330367000</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <strong>example:</strong>
         * <p>dbfs-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceFsId")
        public String sourceFsId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SourceFsSize")
        public Integer sourceFsSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceFsStripeWidth")
        public Integer sourceFsStripeWidth;

        /**
         * <strong>example:</strong>
         * <p>accomplished</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSnapshotResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotResponseBodySnapshots self = new ListSnapshotResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotResponseBodySnapshots setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListSnapshotResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSnapshotResponseBodySnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSnapshotResponseBodySnapshots setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListSnapshotResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSnapshotResponseBodySnapshots setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public ListSnapshotResponseBodySnapshots setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public ListSnapshotResponseBodySnapshots setSourceFsId(String sourceFsId) {
            this.sourceFsId = sourceFsId;
            return this;
        }
        public String getSourceFsId() {
            return this.sourceFsId;
        }

        public ListSnapshotResponseBodySnapshots setSourceFsSize(Integer sourceFsSize) {
            this.sourceFsSize = sourceFsSize;
            return this;
        }
        public Integer getSourceFsSize() {
            return this.sourceFsSize;
        }

        public ListSnapshotResponseBodySnapshots setSourceFsStripeWidth(Integer sourceFsStripeWidth) {
            this.sourceFsStripeWidth = sourceFsStripeWidth;
            return this;
        }
        public Integer getSourceFsStripeWidth() {
            return this.sourceFsStripeWidth;
        }

        public ListSnapshotResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
