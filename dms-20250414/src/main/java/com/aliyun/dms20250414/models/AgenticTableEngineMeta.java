// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticTableEngineMeta extends TeaModel {
    @NameInMap("Checksum")
    public String checksum;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataBytes")
    public Long dataBytes;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("FullChecksum")
    public String fullChecksum;

    @NameInMap("IndexBytes")
    public Long indexBytes;

    @NameInMap("LastDdlTime")
    public String lastDdlTime;

    @NameInMap("NumRows")
    public Long numRows;

    @NameInMap("RefInfo")
    public String refInfo;

    @NameInMap("StorageCapacity")
    public Long storageCapacity;

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
