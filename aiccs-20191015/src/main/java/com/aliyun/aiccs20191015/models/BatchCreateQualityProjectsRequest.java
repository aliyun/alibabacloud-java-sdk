// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class BatchCreateQualityProjectsRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("CheckFreqType")
    public Integer checkFreqType;

    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    @NameInMap("AnalysisIds")
    public java.util.List<Long> analysisIds;

    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    @NameInMap("ChannelTouchType")
    public java.util.List<Integer> channelTouchType;

    public static BatchCreateQualityProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateQualityProjectsRequest self = new BatchCreateQualityProjectsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateQualityProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchCreateQualityProjectsRequest setCheckFreqType(Integer checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    public BatchCreateQualityProjectsRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

    public BatchCreateQualityProjectsRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public BatchCreateQualityProjectsRequest setAnalysisIds(java.util.List<Long> analysisIds) {
        this.analysisIds = analysisIds;
        return this;
    }
    public java.util.List<Long> getAnalysisIds() {
        return this.analysisIds;
    }

    public BatchCreateQualityProjectsRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public BatchCreateQualityProjectsRequest setChannelTouchType(java.util.List<Integer> channelTouchType) {
        this.channelTouchType = channelTouchType;
        return this;
    }
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

}
