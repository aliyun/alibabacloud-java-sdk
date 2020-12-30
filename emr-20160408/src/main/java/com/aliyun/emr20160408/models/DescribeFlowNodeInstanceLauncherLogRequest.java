// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceLauncherLogRequest extends TeaModel {
    @NameInMap("Start")
    public Integer start;

    @NameInMap("Lines")
    public Integer lines;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowNodeInstanceLauncherLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceLauncherLogRequest self = new DescribeFlowNodeInstanceLauncherLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setLines(Integer lines) {
        this.lines = lines;
        return this;
    }
    public Integer getLines() {
        return this.lines;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowNodeInstanceLauncherLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
