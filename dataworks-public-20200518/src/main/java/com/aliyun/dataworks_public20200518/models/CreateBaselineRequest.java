// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBaselineRequest extends TeaModel {
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    @NameInMap("BaselineName")
    public String baselineName;

    @NameInMap("BaselineType")
    public String baselineType;

    @NameInMap("OvertimeSettings")
    public java.util.List<CreateBaselineRequestOvertimeSettings> overtimeSettings;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TaskIds")
    public String taskIds;

    public static CreateBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaselineRequest self = new CreateBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaselineRequest setAlertMarginThreshold(Integer alertMarginThreshold) {
        this.alertMarginThreshold = alertMarginThreshold;
        return this;
    }
    public Integer getAlertMarginThreshold() {
        return this.alertMarginThreshold;
    }

    public CreateBaselineRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public CreateBaselineRequest setBaselineType(String baselineType) {
        this.baselineType = baselineType;
        return this;
    }
    public String getBaselineType() {
        return this.baselineType;
    }

    public CreateBaselineRequest setOvertimeSettings(java.util.List<CreateBaselineRequestOvertimeSettings> overtimeSettings) {
        this.overtimeSettings = overtimeSettings;
        return this;
    }
    public java.util.List<CreateBaselineRequestOvertimeSettings> getOvertimeSettings() {
        return this.overtimeSettings;
    }

    public CreateBaselineRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateBaselineRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateBaselineRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateBaselineRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

    public static class CreateBaselineRequestOvertimeSettings extends TeaModel {
        @NameInMap("Cycle")
        public Integer cycle;

        @NameInMap("Time")
        public String time;

        public static CreateBaselineRequestOvertimeSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateBaselineRequestOvertimeSettings self = new CreateBaselineRequestOvertimeSettings();
            return TeaModel.build(map, self);
        }

        public CreateBaselineRequestOvertimeSettings setCycle(Integer cycle) {
            this.cycle = cycle;
            return this;
        }
        public Integer getCycle() {
            return this.cycle;
        }

        public CreateBaselineRequestOvertimeSettings setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
