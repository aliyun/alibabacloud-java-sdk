// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListSnapshotResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Snapshots")
    public java.util.List<ListSnapshotResponseBodySnapshots> snapshots;

    public static ListSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotResponseBody self = new ListSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListSnapshotResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSnapshotResponseBody setSnapshots(java.util.List<ListSnapshotResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<ListSnapshotResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public static class ListSnapshotResponseBodySnapshots extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SourceFsSize")
        public Integer sourceFsSize;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourceFsId")
        public String sourceFsId;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Category")
        public String category;

        public static ListSnapshotResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotResponseBodySnapshots self = new ListSnapshotResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public ListSnapshotResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSnapshotResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListSnapshotResponseBodySnapshots setSourceFsSize(Integer sourceFsSize) {
            this.sourceFsSize = sourceFsSize;
            return this;
        }
        public Integer getSourceFsSize() {
            return this.sourceFsSize;
        }

        public ListSnapshotResponseBodySnapshots setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public ListSnapshotResponseBodySnapshots setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public ListSnapshotResponseBodySnapshots setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public ListSnapshotResponseBodySnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSnapshotResponseBodySnapshots setSourceFsId(String sourceFsId) {
            this.sourceFsId = sourceFsId;
            return this;
        }
        public String getSourceFsId() {
            return this.sourceFsId;
        }

        public ListSnapshotResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ListSnapshotResponseBodySnapshots setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
