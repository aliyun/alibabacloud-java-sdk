// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableCompactionHistory extends TeaModel {
    @NameInMap("afterFilesCount")
    public Long afterFilesCount;

    @NameInMap("afterFilesSize")
    public Long afterFilesSize;

    @NameInMap("beforeFilesCount")
    public Long beforeFilesCount;

    @NameInMap("beforeFilesLastCreationTime")
    public Long beforeFilesLastCreationTime;

    @NameInMap("beforeFilesSize")
    public Long beforeFilesSize;

    @NameInMap("catalogId")
    public String catalogId;

    @NameInMap("commitTime")
    public Long commitTime;

    @NameInMap("snapshotId")
    public Long snapshotId;

    @NameInMap("tableId")
    public String tableId;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    public static TableCompactionHistory build(java.util.Map<String, ?> map) throws Exception {
        TableCompactionHistory self = new TableCompactionHistory();
        return TeaModel.build(map, self);
    }

    public TableCompactionHistory setAfterFilesCount(Long afterFilesCount) {
        this.afterFilesCount = afterFilesCount;
        return this;
    }
    public Long getAfterFilesCount() {
        return this.afterFilesCount;
    }

    public TableCompactionHistory setAfterFilesSize(Long afterFilesSize) {
        this.afterFilesSize = afterFilesSize;
        return this;
    }
    public Long getAfterFilesSize() {
        return this.afterFilesSize;
    }

    public TableCompactionHistory setBeforeFilesCount(Long beforeFilesCount) {
        this.beforeFilesCount = beforeFilesCount;
        return this;
    }
    public Long getBeforeFilesCount() {
        return this.beforeFilesCount;
    }

    public TableCompactionHistory setBeforeFilesLastCreationTime(Long beforeFilesLastCreationTime) {
        this.beforeFilesLastCreationTime = beforeFilesLastCreationTime;
        return this;
    }
    public Long getBeforeFilesLastCreationTime() {
        return this.beforeFilesLastCreationTime;
    }

    public TableCompactionHistory setBeforeFilesSize(Long beforeFilesSize) {
        this.beforeFilesSize = beforeFilesSize;
        return this;
    }
    public Long getBeforeFilesSize() {
        return this.beforeFilesSize;
    }

    public TableCompactionHistory setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public TableCompactionHistory setCommitTime(Long commitTime) {
        this.commitTime = commitTime;
        return this;
    }
    public Long getCommitTime() {
        return this.commitTime;
    }

    public TableCompactionHistory setSnapshotId(Long snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public Long getSnapshotId() {
        return this.snapshotId;
    }

    public TableCompactionHistory setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public TableCompactionHistory setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public TableCompactionHistory setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
