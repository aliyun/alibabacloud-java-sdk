// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowNodeInstanceContainerLogRequest extends TeaModel {
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("LogName")
    public String logName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowNodeInstanceContainerLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowNodeInstanceContainerLogRequest self = new DescribeFlowNodeInstanceContainerLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowNodeInstanceContainerLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setLogName(String logName) {
        this.logName = logName;
        return this;
    }
    public String getLogName() {
        return this.logName;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowNodeInstanceContainerLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
