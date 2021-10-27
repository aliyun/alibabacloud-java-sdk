// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitTableShardingKeyModifyRequest extends TeaModel {
    @NameInMap("DbComputeLength")
    public String dbComputeLength;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbRightShiftOffset")
    public Integer dbRightShiftOffset;

    @NameInMap("DbShardingColumnList")
    public String dbShardingColumnList;

    @NameInMap("DbShardingFunction")
    public String dbShardingFunction;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("IsShard")
    public Boolean isShard;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SrcTableName")
    public String srcTableName;

    @NameInMap("TargetTableName")
    public String targetTableName;

    @NameInMap("TbComputeLength")
    public String tbComputeLength;

    @NameInMap("TbPartitions")
    public String tbPartitions;

    @NameInMap("TbRightShiftOffset")
    public String tbRightShiftOffset;

    @NameInMap("TbShardingColumnList")
    public String tbShardingColumnList;

    @NameInMap("TbShardingFunction")
    public String tbShardingFunction;

    public static SubmitTableShardingKeyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTableShardingKeyModifyRequest self = new SubmitTableShardingKeyModifyRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTableShardingKeyModifyRequest setDbComputeLength(String dbComputeLength) {
        this.dbComputeLength = dbComputeLength;
        return this;
    }
    public String getDbComputeLength() {
        return this.dbComputeLength;
    }

    public SubmitTableShardingKeyModifyRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitTableShardingKeyModifyRequest setDbRightShiftOffset(Integer dbRightShiftOffset) {
        this.dbRightShiftOffset = dbRightShiftOffset;
        return this;
    }
    public Integer getDbRightShiftOffset() {
        return this.dbRightShiftOffset;
    }

    public SubmitTableShardingKeyModifyRequest setDbShardingColumnList(String dbShardingColumnList) {
        this.dbShardingColumnList = dbShardingColumnList;
        return this;
    }
    public String getDbShardingColumnList() {
        return this.dbShardingColumnList;
    }

    public SubmitTableShardingKeyModifyRequest setDbShardingFunction(String dbShardingFunction) {
        this.dbShardingFunction = dbShardingFunction;
        return this;
    }
    public String getDbShardingFunction() {
        return this.dbShardingFunction;
    }

    public SubmitTableShardingKeyModifyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitTableShardingKeyModifyRequest setIsShard(Boolean isShard) {
        this.isShard = isShard;
        return this;
    }
    public Boolean getIsShard() {
        return this.isShard;
    }

    public SubmitTableShardingKeyModifyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitTableShardingKeyModifyRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public SubmitTableShardingKeyModifyRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public SubmitTableShardingKeyModifyRequest setTbComputeLength(String tbComputeLength) {
        this.tbComputeLength = tbComputeLength;
        return this;
    }
    public String getTbComputeLength() {
        return this.tbComputeLength;
    }

    public SubmitTableShardingKeyModifyRequest setTbPartitions(String tbPartitions) {
        this.tbPartitions = tbPartitions;
        return this;
    }
    public String getTbPartitions() {
        return this.tbPartitions;
    }

    public SubmitTableShardingKeyModifyRequest setTbRightShiftOffset(String tbRightShiftOffset) {
        this.tbRightShiftOffset = tbRightShiftOffset;
        return this;
    }
    public String getTbRightShiftOffset() {
        return this.tbRightShiftOffset;
    }

    public SubmitTableShardingKeyModifyRequest setTbShardingColumnList(String tbShardingColumnList) {
        this.tbShardingColumnList = tbShardingColumnList;
        return this;
    }
    public String getTbShardingColumnList() {
        return this.tbShardingColumnList;
    }

    public SubmitTableShardingKeyModifyRequest setTbShardingFunction(String tbShardingFunction) {
        this.tbShardingFunction = tbShardingFunction;
        return this;
    }
    public String getTbShardingFunction() {
        return this.tbShardingFunction;
    }

}
