// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaTableEngineMeta extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataBytes")
    public Long dataBytes;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("Engine")
    public String engine;

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

    public static OneMetaTableEngineMeta build(java.util.Map<String, ?> map) throws Exception {
        OneMetaTableEngineMeta self = new OneMetaTableEngineMeta();
        return TeaModel.build(map, self);
    }

    public OneMetaTableEngineMeta setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OneMetaTableEngineMeta setDataBytes(Long dataBytes) {
        this.dataBytes = dataBytes;
        return this;
    }
    public Long getDataBytes() {
        return this.dataBytes;
    }

    public OneMetaTableEngineMeta setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public OneMetaTableEngineMeta setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public OneMetaTableEngineMeta setIndexBytes(Long indexBytes) {
        this.indexBytes = indexBytes;
        return this;
    }
    public Long getIndexBytes() {
        return this.indexBytes;
    }

    public OneMetaTableEngineMeta setLastDdlTime(String lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
        return this;
    }
    public String getLastDdlTime() {
        return this.lastDdlTime;
    }

    public OneMetaTableEngineMeta setNumRows(Long numRows) {
        this.numRows = numRows;
        return this;
    }
    public Long getNumRows() {
        return this.numRows;
    }

    public OneMetaTableEngineMeta setRefInfo(String refInfo) {
        this.refInfo = refInfo;
        return this;
    }
    public String getRefInfo() {
        return this.refInfo;
    }

    public OneMetaTableEngineMeta setStorageCapacity(Long storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

    public OneMetaTableEngineMeta setTableSchemaName(String tableSchemaName) {
        this.tableSchemaName = tableSchemaName;
        return this;
    }
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

}
