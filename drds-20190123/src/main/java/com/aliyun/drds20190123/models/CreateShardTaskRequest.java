// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateShardTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("SourceTableName")
    public String sourceTableName;

    @NameInMap("TargetTableName")
    public String targetTableName;

    @NameInMap("TaskType")
    public String taskType;

    public static CreateShardTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShardTaskRequest self = new CreateShardTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateShardTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateShardTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateShardTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
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
