// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableCompaction extends TeaModel {
    @NameInMap("catalogId")
    public String catalogId;

    @NameInMap("lastCompactedFileTime")
    public Long lastCompactedFileTime;

    @NameInMap("maxLevel0FileCount")
    public String maxLevel0FileCount;

    @NameInMap("tableId")
    public String tableId;

    public static TableCompaction build(java.util.Map<String, ?> map) throws Exception {
        TableCompaction self = new TableCompaction();
        return TeaModel.build(map, self);
    }

    public TableCompaction setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public TableCompaction setLastCompactedFileTime(Long lastCompactedFileTime) {
        this.lastCompactedFileTime = lastCompactedFileTime;
        return this;
    }
    public Long getLastCompactedFileTime() {
        return this.lastCompactedFileTime;
    }

    public TableCompaction setMaxLevel0FileCount(String maxLevel0FileCount) {
        this.maxLevel0FileCount = maxLevel0FileCount;
        return this;
    }
    public String getMaxLevel0FileCount() {
        return this.maxLevel0FileCount;
    }

    public TableCompaction setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}
