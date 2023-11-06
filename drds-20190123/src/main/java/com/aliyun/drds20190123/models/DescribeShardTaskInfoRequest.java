// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskInfoRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the table that you want to convert or shard.</p>
     */
    @NameInMap("SourceTableName")
    public String sourceTableName;

    /**
     * <p>The name of the table that is generated after you convert or shard the table.</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    public static DescribeShardTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskInfoRequest self = new DescribeShardTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeShardTaskInfoRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeShardTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeShardTaskInfoRequest setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    public DescribeShardTaskInfoRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

}
