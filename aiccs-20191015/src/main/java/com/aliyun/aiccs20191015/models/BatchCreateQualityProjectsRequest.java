// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class BatchCreateQualityProjectsRequest extends TeaModel {
    /**
     * <p>The list of quality check rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AnalysisIds")
    public java.util.List<Long> analysisIds;

    /**
     * <p>The list of session channels.</p>
     */
    @NameInMap("ChannelTouchType")
    public java.util.List<Integer> channelTouchType;

    /**
     * <p>The check frequency type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: periodic quality check</li>
     * <li><strong>4</strong>: ad-hoc quality check</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CheckFreqType")
    public Integer checkFreqType;

    /**
     * <p>The list of instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    /**
     * <p>The name of the quality check task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Automated quality check task</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The end time of the ad-hoc quality check session. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1619425576000</p>
     */
    @NameInMap("TimeRangeEnd")
    public String timeRangeEnd;

    /**
     * <p>The start time of the ad-hoc quality check session. The value is a timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1619424556000</p>
     */
    @NameInMap("TimeRangeStart")
    public String timeRangeStart;

    public static BatchCreateQualityProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateQualityProjectsRequest self = new BatchCreateQualityProjectsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateQualityProjectsRequest setAnalysisIds(java.util.List<Long> analysisIds) {
        this.analysisIds = analysisIds;
        return this;
    }
    public java.util.List<Long> getAnalysisIds() {
        return this.analysisIds;
    }

    public BatchCreateQualityProjectsRequest setChannelTouchType(java.util.List<Integer> channelTouchType) {
        this.channelTouchType = channelTouchType;
        return this;
    }
    public java.util.List<Integer> getChannelTouchType() {
        return this.channelTouchType;
    }

    public BatchCreateQualityProjectsRequest setCheckFreqType(Integer checkFreqType) {
        this.checkFreqType = checkFreqType;
        return this;
    }
    public Integer getCheckFreqType() {
        return this.checkFreqType;
    }

    public BatchCreateQualityProjectsRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public BatchCreateQualityProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public BatchCreateQualityProjectsRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public BatchCreateQualityProjectsRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

}
