// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityProjectRequest extends TeaModel {
    @NameInMap("AnalysisIds")
    public java.util.List<Long> analysisIds;

    @NameInMap("ChannelTouchType")
    public java.util.List<Integer> channelTouchType;

    @NameInMap("CheckFreqType")
    public Integer checkFreqType;

    @NameInMap("DepList")
    public java.util.List<Long> depList;

    @NameInMap("GroupList")
    public java.util.List<Long> groupList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProjectVersion")
    public Integer projectVersion;

    @NameInMap("ScopeType")
    public Integer scopeType;

    @NameInMap("ServicerList")
    public java.util.List<String> servicerList;

    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

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
