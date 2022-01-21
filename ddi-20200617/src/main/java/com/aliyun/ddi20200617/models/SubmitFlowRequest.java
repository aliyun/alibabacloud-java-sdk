// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowRequest extends TeaModel {
    // 配置信息{"key":"value"}格式。  本示例中cyctime表示实际调度运行的时间（长整型时间戳）。
    @NameInMap("Conf")
    public String conf;

    // 工作流ID。您可以调用ListFlowInstance查看工作流ID。
    @NameInMap("FlowId")
    public String flowId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static SubmitFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowRequest self = new SubmitFlowRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFlowRequest setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

    public SubmitFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SubmitFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
