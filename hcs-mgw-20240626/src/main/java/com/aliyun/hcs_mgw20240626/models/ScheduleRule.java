// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ScheduleRule extends TeaModel {
    /**
     * <p>The maximum number of automatic scheduling rounds. Within this limit, a task execution ID is automatically scheduled based on the start and pause times. One round consists of a complete task execution from start to finish. If the limit is exceeded, automatic scheduling stops, but the task can still be executed manually.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxScheduleCount")
    public Long maxScheduleCount;

    /**
     * <p>The start time specified by a cron expression. The interval must be at least 1 hour.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 * * * ?</p>
     */
    @NameInMap("StartCronExpression")
    public String startCronExpression;

    /**
     * <p>The pause time specified by a cron expression. The interval must be at least 1 hour.</p>
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
