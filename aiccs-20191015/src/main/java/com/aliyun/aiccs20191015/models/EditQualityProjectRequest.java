// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectRequest extends TeaModel {
    /**
     * <p>The list of quality inspection rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AnalysisIds")
    public java.util.List<Long> analysisIds;

    /**
     * <p>The list of session channels.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelTouchType")
    public java.util.List<Integer> channelTouchType;

    /**
     * <p>The check frequency type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Periodic quality inspection.</li>
     * <li><strong>4</strong>: Temporary quality inspection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckFreqType")
    public Integer checkFreqType;

    /**
     * <p>The list of departments.</p>
     */
    @NameInMap("DepList")
    public java.util.List<Long> depList;

    /**
     * <p>The list of skill groups.</p>
     */
    @NameInMap("GroupList")
    public java.util.List<Long> groupList;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The Artificial Intelligence Cloud Call Service instance ID. You can obtain the ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the quality inspection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated quality inspection task</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The version of the quality inspection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectVersion")
    public Integer projectVersion;

    /**
     * <p>The quality inspection scope. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Instance (all skill groups).</li>
     * <li><strong>2</strong>: Department or skill group list.</li>
     * <li><strong>3</strong>: Customer service representative list.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScopeType")
    public Integer scopeType;

    /**
     * <p>The list of customer service representatives.</p>
     */
    @NameInMap("ServicerList")
    public java.util.List<String> servicerList;

    /**
     * <p>The end time of the temporary quality inspection session. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1619425576000</p>
     */
    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    /**
     * <p>The start time of the temporary quality inspection session. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1619424556000</p>
     */
    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    public static EditQualityProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        EditQualityProjectRequest self = new EditQualityProjectRequest();
        return TeaModel.build(map, self);
    }

    public EditQualityProjectRequest setAnalysisIds(java.util.List<Long> analysisIds) {
        this.analysisIds = analysisIds;
        return this;
    }
    public java.util.List<Long> getAnalysisIds() {
        return this.analysisIds;
    }

    public EditQualityProjectRequest setChannelTouchType(java.util.List<Integer> channelTouchType) {
        this.channelTouchType = channelTouchType;
        return this;
    }
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

    public EditQualityProjectRequest setCheckFreqType(Integer checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    public EditQualityProjectRequest setDepList(java.util.List<Long> depList) {
        this.depList = depList;
        return this;
    }
    public java.util.List<Long> getDepList() {
        return this.depList;
    }

    public EditQualityProjectRequest setGroupList(java.util.List<Long> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<Long> getGroupList() {
        return this.groupList;
    }

    public EditQualityProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditQualityProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public EditQualityProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public EditQualityProjectRequest setProjectVersion(Integer projectVersion) {
        this.projectVersion = projectVersion;
        return this;
    }
    public Integer getProjectVersion() {
        return this.projectVersion;
    }

    public EditQualityProjectRequest setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public Integer getScopeType() {
        return this.scopeType;
    }

    public EditQualityProjectRequest setServicerList(java.util.List<String> servicerList) {
        this.servicerList = servicerList;
        return this;
    }
    public java.util.List<String> getServicerList() {
        return this.servicerList;
    }

    public EditQualityProjectRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public EditQualityProjectRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

}
