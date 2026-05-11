// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ScheduleRule extends TeaModel {
    /**
     * <p>The maximum number of times that the migration task is automatically scheduled. Each time the migration task is run, the execution ID increases by one until the task is run the specified number of times. The task is automatically scheduled based on the specified start time and pause time. The task is no longer automatically scheduled after the task is run the specified number of times. However, you can still manually start the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxScheduleCount")
    public Long maxScheduleCount;

    /**
     * <p>The time when the migration task started. You can use a CRON expression to specify the time. The interval at which the migration task is run is at least 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * * ?</p>
     */
    @NameInMap("StartCronExpression")
    public String startCronExpression;

    /**
     * <p>The time when the migration task paused. You can use a CRON expression to specify the time. The interval at which the migration task is run is at least 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * * ?</p>
     */
    @NameInMap("SuspendCronExpression")
    public String suspendCronExpression;

    public static ScheduleRule build(java.util.Map<String, ?> map) throws Exception {
        ScheduleRule self = new ScheduleRule();
        return TeaModel.build(map, self);
    }

    public ScheduleRule setMaxScheduleCount(Long maxScheduleCount) {
        this.maxScheduleCount = maxScheduleCount;
        return this;
    }
    public Long getMaxScheduleCount() {
        return this.maxScheduleCount;
    }

    public ScheduleRule setStartCronExpression(String startCronExpression) {
        this.startCronExpression = startCronExpression;
        return this;
    }
    public String getStartCronExpression() {
        return this.startCronExpression;
    }

    public ScheduleRule setSuspendCronExpression(String suspendCronExpression) {
        this.suspendCronExpression = suspendCronExpression;
        return this;
    }
    public String getSuspendCronExpression() {
        return this.suspendCronExpression;
    }

}
