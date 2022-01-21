// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ResumeFlowRequest extends TeaModel {
    // 工作流实例ID。您可以调用ListFlowInstance查看工作流ID。
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 区域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static ResumeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeFlowRequest self = new ResumeFlowRequest();
        return TeaModel.build(map, self);
    }

    public ResumeFlowRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public ResumeFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResumeFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
