// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ValidateShardTaskRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds23ds****</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region where the PolarDB-X 1.0 instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the table or table shard on which you want to perform the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>buyer</p>
     */
    @NameInMap("SourceTableName")
    public String sourceTableName;

    /**
     * <p>The name of the table or table shard on which you perform the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>buyer_new</p>
     */
    @NameInMap("TargetTableName")
    public String targetTableName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>SINGLE_TO_SHARD</strong>: converts a single table to a table shard.</li>
     * <li><strong>SHARD_TO_SINGLE</strong>: converts a table shard to a single table.</li>
     * <li><strong>SHARD_TO_SHARD</strong>: converts a table shard to another table shard.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SINGLE_TO_SHARD</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ValidateShardTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateShardTaskRequest self = new ValidateShardTaskRequest();
        return TeaModel.build(map, self);
    }

    public ValidateShardTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ValidateShardTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ValidateShardTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidateShardTaskRequest setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    public ValidateShardTaskRequest setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    public ValidateShardTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
