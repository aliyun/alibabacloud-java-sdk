// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableEngineMeta extends TeaModel {
    /**
     * <p>The checksum of the table metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>9f86d081884c7d65****</p>
     */
    @NameInMap("Checksum")
    public String checksum;

    /**
     * <p>The time when the table was created. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01 10:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The data size of the table. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>786432</p>
     */
    @NameInMap("DataBytes")
    public Long dataBytes;

    /**
     * <p>The character set encoding of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8mb4</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>The storage engine of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>InnoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The full checksum of the table metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>2c26b46b68ffc68f****</p>
     */
    @NameInMap("FullChecksum")
    public String fullChecksum;

    /**
     * <p>The index size of the table. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("IndexBytes")
    public Long indexBytes;

    /**
     * <p>The time when the last DDL operation was executed on the table. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 10:00:00</p>
     */
    @NameInMap("LastDdlTime")
    public String lastDdlTime;

    /**
     * <p>The number of rows in the table.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("NumRows")
    public Long numRows;

    /**
     * <p>The reference information of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>order_db.orders_view</p>
     */
    @NameInMap("RefInfo")
    public String refInfo;

    /**
     * <p>The storage capacity of the table. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("StorageCapacity")
    public Long storageCapacity;

    /**
     * <p>The name of the schema to which the table belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
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
