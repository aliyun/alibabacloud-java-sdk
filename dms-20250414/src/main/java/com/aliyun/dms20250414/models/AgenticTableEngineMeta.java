// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableEngineMeta extends TeaModel {
    /**
     * <p>A checksum to verify the table\&quot;s data integrity.</p>
     */
    @NameInMap("Checksum")
    public String checksum;

    /**
     * <p>The time the table was created, in UTC format (<code>YYYY-MM-DDThh:mm:ssZ</code>).</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The total size of the table\&quot;s data, in bytes.</p>
     */
    @NameInMap("DataBytes")
    public Long dataBytes;

    /**
     * <p>The character encoding of the table.</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>The table\&quot;s storage engine, such as <code>InnoDB</code>.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>A checksum of the table\&quot;s data and indexes.</p>
     */
    @NameInMap("FullChecksum")
    public String fullChecksum;

    /**
     * <p>The total size of the table\&quot;s indexes, in bytes.</p>
     */
    @NameInMap("IndexBytes")
    public Long indexBytes;

    /**
     * <p>The timestamp of the last DDL (Data Definition Language) operation, in UTC format (<code>YYYY-MM-DDThh:mm:ssZ</code>).</p>
     */
    @NameInMap("LastDdlTime")
    public String lastDdlTime;

    /**
     * <p>The number of rows in the table.</p>
     */
    @NameInMap("NumRows")
    public Long numRows;

    /**
     * <p>The table\&quot;s reference information.</p>
     */
    @NameInMap("RefInfo")
    public String refInfo;

    /**
     * <p>The table\&quot;s total storage capacity, in bytes.</p>
     */
    @NameInMap("StorageCapacity")
    public Long storageCapacity;

    /**
     * <p>The name of the table schema.</p>
     */
    @NameInMap("TableSchemaName")
    public String tableSchemaName;

    public static AgenticTableEngineMeta build(java.util.Map<String, ?> map) throws Exception {
        AgenticTableEngineMeta self = new AgenticTableEngineMeta();
        return TeaModel.build(map, self);
    }

    public AgenticTableEngineMeta setChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }
    public String getChecksum() {
        return this.checksum;
    }

    public AgenticTableEngineMeta setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AgenticTableEngineMeta setDataBytes(Long dataBytes) {
        this.dataBytes = dataBytes;
        return this;
    }
    public Long getDataBytes() {
        return this.dataBytes;
    }

    public AgenticTableEngineMeta setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public AgenticTableEngineMeta setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AgenticTableEngineMeta setFullChecksum(String fullChecksum) {
        this.fullChecksum = fullChecksum;
        return this;
    }
    public String getFullChecksum() {
        return this.fullChecksum;
    }

    public AgenticTableEngineMeta setIndexBytes(Long indexBytes) {
        this.indexBytes = indexBytes;
        return this;
    }
    public Long getIndexBytes() {
        return this.indexBytes;
    }

    public AgenticTableEngineMeta setLastDdlTime(String lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
        return this;
    }
    public String getLastDdlTime() {
        return this.lastDdlTime;
    }

    public AgenticTableEngineMeta setNumRows(Long numRows) {
        this.numRows = numRows;
        return this;
    }
    public Long getNumRows() {
        return this.numRows;
    }

    public AgenticTableEngineMeta setRefInfo(String refInfo) {
        this.refInfo = refInfo;
        return this;
    }
    public String getRefInfo() {
        return this.refInfo;
    }

    public AgenticTableEngineMeta setStorageCapacity(Long storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

    public AgenticTableEngineMeta setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

}
