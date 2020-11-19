// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitRollbackShardingKeyModifyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static SubmitRollbackShardingKeyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRollbackShardingKeyModifyRequest self = new SubmitRollbackShardingKeyModifyRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRollbackShardingKeyModifyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitRollbackShardingKeyModifyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitRollbackShardingKeyModifyRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitRollbackShardingKeyModifyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
