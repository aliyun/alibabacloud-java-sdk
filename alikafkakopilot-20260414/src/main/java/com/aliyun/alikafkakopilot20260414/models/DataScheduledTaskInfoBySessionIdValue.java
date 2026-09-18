// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class DataScheduledTaskInfoBySessionIdValue extends TeaModel {
    /**
     * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-17T12:00:00Z</p>
     */
    @NameInMap("AsOf")
    public String asOf;

    /**
     * <p>The number of associated tasks in the ENABLED status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnabledCount")
    public Long enabledCount;

    /**
     * <p>Indicates whether the current session has associated scheduled tasks that are in the ENABLED, PAUSED, or NEEDS_AUTH status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasScheduledTask")
    public Boolean hasScheduledTask;

    /**
     * <p>The total number of associated tasks. Only tasks in the ENABLED, PAUSED, or NEEDS_AUTH status are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskCount")
    public Long taskCount;

    public static DataScheduledTaskInfoBySessionIdValue build(java.util.Map<String, ?> map) throws Exception {
        DataScheduledTaskInfoBySessionIdValue self = new DataScheduledTaskInfoBySessionIdValue();
        return TeaModel.build(map, self);
    }

    public DataScheduledTaskInfoBySessionIdValue setAsOf(String asOf) {
        this.asOf = asOf;
        return this;
    }
    public String getAsOf() {
        return this.asOf;
    }

    public DataScheduledTaskInfoBySessionIdValue setEnabledCount(Long enabledCount) {
        this.enabledCount = enabledCount;
        return this;
    }
    public Long getEnabledCount() {
        return this.enabledCount;
    }

    public DataScheduledTaskInfoBySessionIdValue setHasScheduledTask(Boolean hasScheduledTask) {
        this.hasScheduledTask = hasScheduledTask;
        return this;
    }
    public Boolean getHasScheduledTask() {
        return this.hasScheduledTask;
    }

    public DataScheduledTaskInfoBySessionIdValue setTaskCount(Long taskCount) {
        this.taskCount = taskCount;
        return this;
    }
    public Long getTaskCount() {
        return this.taskCount;
    }

}
