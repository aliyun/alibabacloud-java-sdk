// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBaselineRequest extends TeaModel {
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OvertimeSettings")
    public java.util.List<CreateBaselineRequestOvertimeSettings> overtimeSettings;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

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

    public CreateBaselineRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
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
