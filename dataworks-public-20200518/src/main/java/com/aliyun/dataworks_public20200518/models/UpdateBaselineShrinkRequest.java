// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether alerting is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    /**
     * <p>The baseline alert margin. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>The baseline alert configurations.</p>
     */
    @NameInMap("AlertSettings")
    public String alertSettingsShrink;

    /**
     * <p>The ID of the baseline. You can call <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000010800007</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The baseline name.</p>
     * 
     * <strong>example:</strong>
     * <p>BaselineName</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The baseline type. Valid values:</p>
     * <ul>
     * <li>DAILY: daily baseline.</li>
     * <li>HOURLY: hourly baseline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>Specifies whether the baseline is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The list of upstream node IDs for the baseline, separated by commas. If there are many nodes, we recommend that you add a virtual node downstream for easier management.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The baseline committed time configurations.</p>
     */
    @NameInMap("OvertimeSettings")
    public String overtimeSettingsShrink;

    /**
     * <p>The Alibaba Cloud UID of the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The priority of the baseline. Valid values: 1, 3, 5, 7, and 8.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The project ID. You can call <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2043</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The IDs of nodes to remove from the baseline. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>123,456</p>
     */
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
