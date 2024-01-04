// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceMaintainTimeRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time of the maintenance window. The end time must be later than the start time. Specify the time in the HH:mmZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is no longer used.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time of the maintenance window. Specify the time in the HH:mmZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ModifyDBInstanceMaintainTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceMaintainTimeRequest self = new ModifyDBInstanceMaintainTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceMaintainTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceMaintainTimeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyDBInstanceMaintainTimeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBInstanceMaintainTimeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
