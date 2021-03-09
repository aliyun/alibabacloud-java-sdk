// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityProjectRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("CheckFreqType")
    public Integer checkFreqType;

    @NameInMap("ScopeType")
    public Integer scopeType;

    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ChannelTouchType")
    public java.util.List<Integer> channelTouchType;

    @NameInMap("DepList")
    public java.util.List<Integer> depList;

    @NameInMap("GroupList")
    public java.util.List<Integer> groupList;

    @NameInMap("ServicerList")
    public java.util.List<String> servicerList;

    @NameInMap("AnalysisIds")
    public java.util.List<Integer> analysisIds;

    public static CreateQualityProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityProjectRequest self = new CreateQualityProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateQualityProjectRequest setCheckFreqType(Integer checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    public CreateQualityProjectRequest setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public Integer getScopeType() {
        return this.scopeType;
    }

    public CreateQualityProjectRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

    public CreateQualityProjectRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public CreateQualityProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQualityProjectRequest setChannelTouchType(java.util.List<Integer> channelTouchType) {
        this.channelTouchType = channelTouchType;
        return this;
    }
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

    public CreateQualityProjectRequest setDepList(java.util.List<Integer> depList) {
        this.depList = depList;
        return this;
    }
    public java.util.List<Integer> getDepList() {
        return this.depList;
    }

    public CreateQualityProjectRequest setGroupList(java.util.List<Integer> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<Integer> getGroupList() {
        return this.groupList;
    }

    public CreateQualityProjectRequest setServicerList(java.util.List<String> servicerList) {
        this.servicerList = servicerList;
        return this;
    }
    public java.util.List<String> getServicerList() {
        return this.servicerList;
    }

    public CreateQualityProjectRequest setAnalysisIds(java.util.List<Integer> analysisIds) {
        this.analysisIds = analysisIds;
        return this;
    }
    public java.util.List<Integer> getAnalysisIds() {
        return this.analysisIds;
    }

}
