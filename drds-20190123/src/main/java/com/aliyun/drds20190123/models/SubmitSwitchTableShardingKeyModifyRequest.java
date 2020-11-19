// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSwitchTableShardingKeyModifyRequest extends TeaModel {
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

    public static SubmitSwitchTableShardingKeyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSwitchTableShardingKeyModifyRequest self = new SubmitSwitchTableShardingKeyModifyRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSwitchTableShardingKeyModifyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitSwitchTableShardingKeyModifyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSwitchTableShardingKeyModifyRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSwitchTableShardingKeyModifyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
