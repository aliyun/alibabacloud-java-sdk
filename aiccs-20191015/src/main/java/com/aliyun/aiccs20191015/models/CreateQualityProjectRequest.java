// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateQualityProjectRequest extends TeaModel {
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

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ScopeType")
    public Integer scopeType;

    @NameInMap("ServicerList")
    public java.util.List<String> servicerList;

    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    public static CreateQualityProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityProjectRequest self = new CreateQualityProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateQualityProjectRequest setAnalysisIds(java.util.List<Long> analysisIds) {
        this.analysisIds = analysisIds;
        return this;
    }
    public java.util.List<Long> getAnalysisIds() {
        return this.analysisIds;
    }

    public CreateQualityProjectRequest setChannelTouchType(java.util.List<Integer> channelTouchType) {
        this.channelTouchType = channelTouchType;
        return this;
    }
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

    public CreateQualityProjectRequest setCheckFreqType(Integer checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    public CreateQualityProjectRequest setDepList(java.util.List<Long> depList) {
        this.depList = depList;
        return this;
    }
    public java.util.List<Long> getDepList() {
        return this.depList;
    }

    public CreateQualityProjectRequest setGroupList(java.util.List<Long> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<Long> getGroupList() {
        return this.groupList;
    }

    public CreateQualityProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateQualityProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateQualityProjectRequest setScopeType(Integer scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public Integer getScopeType() {
        return this.scopeType;
    }

    public CreateQualityProjectRequest setServicerList(java.util.List<String> servicerList) {
        this.servicerList = servicerList;
        return this;
    }
    public java.util.List<String> getServicerList() {
        return this.servicerList;
    }

    public CreateQualityProjectRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public CreateQualityProjectRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

}
