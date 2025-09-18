// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableCompaction extends TeaModel {
    @NameInMap("catalogId")
    public String catalogId;

    @NameInMap("cuUsage")
    public Double cuUsage;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("lastCompactedFileTime")
    @Deprecated
    public Long lastCompactedFileTime;

    @NameInMap("latencyFileEarliestTime")
    public Long latencyFileEarliestTime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxLevel0FileCount")
    @Deprecated
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

    public TableCompaction setCuUsage(Double cuUsage) {
        this.cuUsage = cuUsage;
        return this;
    }
    public Double getCuUsage() {
        return this.cuUsage;
    }

    @Deprecated
    public TableCompaction setLastCompactedFileTime(Long lastCompactedFileTime) {
        this.lastCompactedFileTime = lastCompactedFileTime;
        return this;
    }
    public Long getLastCompactedFileTime() {
        return this.lastCompactedFileTime;
    }

    public TableCompaction setLatencyFileEarliestTime(Long latencyFileEarliestTime) {
        this.latencyFileEarliestTime = latencyFileEarliestTime;
        return this;
    }
    public Long getLatencyFileEarliestTime() {
        return this.latencyFileEarliestTime;
    }

    @Deprecated
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
