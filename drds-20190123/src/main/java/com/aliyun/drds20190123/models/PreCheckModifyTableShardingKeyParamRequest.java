// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckModifyTableShardingKeyParamRequest extends TeaModel {
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

    public static PreCheckModifyTableShardingKeyParamRequest build(java.util.Map<String, ?> map) throws Exception {
        PreCheckModifyTableShardingKeyParamRequest self = new PreCheckModifyTableShardingKeyParamRequest();
        return TeaModel.build(map, self);
    }

    public PreCheckModifyTableShardingKeyParamRequest setDbComputeLength(String dbComputeLength) {
        this.dbComputeLength = dbComputeLength;
        return this;
    }
    public String getDbComputeLength() {
        return this.dbComputeLength;
    }

    public PreCheckModifyTableShardingKeyParamRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public PreCheckModifyTableShardingKeyParamRequest setDbRightShiftOffset(Integer dbRightShiftOffset) {
        this.dbRightShiftOffset = dbRightShiftOffset;
        return this;
    }
    public Integer getDbRightShiftOffset() {
        return this.dbRightShiftOffset;
    }

    public PreCheckModifyTableShardingKeyParamRequest setDbShardingColumnList(String dbShardingColumnList) {
        this.dbShardingColumnList = dbShardingColumnList;
        return this;
    }
    public String getDbShardingColumnList() {
        return this.dbShardingColumnList;
    }

    public PreCheckModifyTableShardingKeyParamRequest setDbShardingFunction(String dbShardingFunction) {
        this.dbShardingFunction = dbShardingFunction;
        return this;
    }
    public String getDbShardingFunction() {
        return this.dbShardingFunction;
    }

    public PreCheckModifyTableShardingKeyParamRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public PreCheckModifyTableShardingKeyParamRequest setIsShard(Boolean isShard) {
        this.isShard = isShard;
        return this;
    }
    public Boolean getIsShard() {
        return this.isShard;
    }

    public PreCheckModifyTableShardingKeyParamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PreCheckModifyTableShardingKeyParamRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTbComputeLength(String tbComputeLength) {
        this.tbComputeLength = tbComputeLength;
        return this;
    }
    public String getTbComputeLength() {
        return this.tbComputeLength;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTbPartitions(String tbPartitions) {
        this.tbPartitions = tbPartitions;
        return this;
    }
    public String getTbPartitions() {
        return this.tbPartitions;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTbRightShiftOffset(String tbRightShiftOffset) {
        this.tbRightShiftOffset = tbRightShiftOffset;
        return this;
    }
    public String getTbRightShiftOffset() {
        return this.tbRightShiftOffset;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTbShardingColumnList(String tbShardingColumnList) {
        this.tbShardingColumnList = tbShardingColumnList;
        return this;
    }
    public String getTbShardingColumnList() {
        return this.tbShardingColumnList;
    }

    public PreCheckModifyTableShardingKeyParamRequest setTbShardingFunction(String tbShardingFunction) {
        this.tbShardingFunction = tbShardingFunction;
        return this;
    }
    public String getTbShardingFunction() {
        return this.tbShardingFunction;
    }

}
