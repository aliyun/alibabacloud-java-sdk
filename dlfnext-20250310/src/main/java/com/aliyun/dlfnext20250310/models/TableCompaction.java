// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableCompaction extends TeaModel {
    /**
     * <p>The catalog ID.</p>
     * 
     * <strong>example:</strong>
     * <p>clg-paimon-xxx</p>
     */
    @NameInMap("catalogId")
    public String catalogId;

    /**
     * <p>The total CU usage.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cuUsage")
    public Double cuUsage;

    /**
     * <p>The time when the last file was compacted.</p>
     * 
     * <strong>example:</strong>
     * <p>1759111660075</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("lastCompactedFileTime")
    @Deprecated
    public Long lastCompactedFileTime;

    /**
     * <p>The earliest creation time of uncompacted files.</p>
     * 
     * <strong>example:</strong>
     * <p>1760321763633</p>
     */
    @NameInMap("latencyFileEarliestTime")
    public Long latencyFileEarliestTime;

    /**
     * <p>The number of Level 0 files.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("maxLevel0FileCount")
    @Deprecated
    public String maxLevel0FileCount;

    /**
     * <p>The table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tbl-xxx</p>
     */
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
