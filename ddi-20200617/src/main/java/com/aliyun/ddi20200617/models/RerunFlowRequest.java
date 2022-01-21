// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RerunFlowRequest extends TeaModel {
    // 工作流实例ID。您可以调用ListFlowInstance查看工作流实例ID。
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 是否只重试失败节点。
    @NameInMap("ReRunFail")
    public Boolean reRunFail;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static RerunFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunFlowRequest self = new RerunFlowRequest();
        return TeaModel.build(map, self);
    }

    public RerunFlowRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public RerunFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public RerunFlowRequest setReRunFail(Boolean reRunFail) {
        this.reRunFail = reRunFail;
        return this;
    }
    public Boolean getReRunFail() {
        return this.reRunFail;
    }

    public RerunFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
