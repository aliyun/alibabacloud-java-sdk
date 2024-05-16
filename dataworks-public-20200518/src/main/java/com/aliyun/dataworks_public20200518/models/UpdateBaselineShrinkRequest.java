// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineShrinkRequest extends TeaModel {
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    @NameInMap("AlertSettings")
    public String alertSettingsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    @NameInMap("BaselineName")
    public String baselineName;

    @NameInMap("BaselineType")
    public String baselineType;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("NodeIds")
    public String nodeIds;

    @NameInMap("OvertimeSettings")
    public String overtimeSettingsShrink;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RemoveNodeIds")
    public String removeNodeIds;

    public static UpdateBaselineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaselineShrinkRequest self = new UpdateBaselineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaselineShrinkRequest setAlertEnabled(Boolean alertEnabled) {
        this.alertEnabled = alertEnabled;
        return this;
    }
    public Boolean getAlertEnabled() {
        return this.alertEnabled;
    }

    public UpdateBaselineShrinkRequest setAlertMarginThreshold(Integer alertMarginThreshold) {
        this.alertMarginThreshold = alertMarginThreshold;
        return this;
    }
    public Integer getAlertMarginThreshold() {
        return this.alertMarginThreshold;
    }

    public UpdateBaselineShrinkRequest setAlertSettingsShrink(String alertSettingsShrink) {
        this.alertSettingsShrink = alertSettingsShrink;
        return this;
    }
    public String getAlertSettingsShrink() {
        return this.alertSettingsShrink;
    }

    public UpdateBaselineShrinkRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public UpdateBaselineShrinkRequest setBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }
    public String getBaselineName() {
        return this.baselineName;
    }

    public UpdateBaselineShrinkRequest setBaselineType(String baselineType) {
        this.baselineType = baselineType;
        return this;
    }
    public String getBaselineType() {
        return this.baselineType;
    }

    public UpdateBaselineShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateBaselineShrinkRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateBaselineShrinkRequest setOvertimeSettingsShrink(String overtimeSettingsShrink) {
        this.overtimeSettingsShrink = overtimeSettingsShrink;
        return this;
    }
    public String getOvertimeSettingsShrink() {
        return this.overtimeSettingsShrink;
    }

    public UpdateBaselineShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateBaselineShrinkRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateBaselineShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateBaselineShrinkRequest setRemoveNodeIds(String removeNodeIds) {
        this.removeNodeIds = removeNodeIds;
        return this;
    }
    public String getRemoveNodeIds() {
        return this.removeNodeIds;
    }

}
