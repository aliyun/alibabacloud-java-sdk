// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBaselineShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the alerting feature. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlertEnabled")
    public Boolean alertEnabled;

    /**
     * <p>The alert margin threshold of the baseline. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlertMarginThreshold")
    public Integer alertMarginThreshold;

    /**
     * <p>The alert settings of the baseline.</p>
     */
    @NameInMap("AlertSettings")
    public String alertSettingsShrink;

    /**
     * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000010800007</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    /**
     * <p>The name of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>BaselineName</p>
     */
    @NameInMap("BaselineName")
    public String baselineName;

    /**
     * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("BaselineType")
    public String baselineType;

    /**
     * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ancestor nodes of nodes in the baseline. Separate the ancestor nodes with commas (,). If a large number of ancestor nodes exist, we recommend that you create a zero load node and configure the zero load node as the descendant node of nodes in the baseline to facilitate node management.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The settings of the committed completion time of the baseline.</p>
     */
    @NameInMap("OvertimeSettings")
    public String overtimeSettingsShrink;

    /**
     * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
     * 
     * <strong>example:</strong>
     * <p>3726346****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/2261507.html">ListBaselines</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2043</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the node that you want to disassociate from the baseline. You can specify multiple node IDs. Separate multiple node IDs with commas (,).</p>
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
