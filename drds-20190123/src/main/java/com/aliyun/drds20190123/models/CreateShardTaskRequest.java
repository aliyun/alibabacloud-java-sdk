// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateShardTaskRequest extends TeaModel {
    /**
     * <p>The name of the DRDS database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region where the resource group resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the source table.</p>
     */
    @NameInMap("SourceTableName")
    public String sourceTableName;

    /**
     * <p>The name of the destination table.</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The type of the task. Valid values:`  SHARD_TO_SINGLE `,`  SINGLE_TO_SHARD `,`  SHARD_TO_SHARD `.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateShardTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShardTaskRequest self = new CreateShardTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateShardTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateShardTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateShardTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateShardTaskRequest setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    public CreateShardTaskRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public CreateShardTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
