// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBaselineRequest extends TeaModel {
    /**
     * <p>The alert margin threshold of the baseline. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>The name of the baseline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BaselineName</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>The ancestor nodes of nodes in the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>210001233239,210001236482</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The settings of the committed completion time of the baseline.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OvertimeSettings")
    public java.util.List<CreateBaselineRequestOvertimeSettings> overtimeSettings;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,3,5,7,8</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
        /**
         * <p>The cycle that corresponds to the committed completion time. For a day-level baseline, set this parameter to 1. For an hour-level baseline, set this parameter to a value that is no more than 24.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cycle")
        public Integer cycle;

        /**
         * <p>The committed completion time in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
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
