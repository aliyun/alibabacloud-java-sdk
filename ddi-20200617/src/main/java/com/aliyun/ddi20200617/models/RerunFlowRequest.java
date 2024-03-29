// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RerunFlowRequest extends TeaModel {
    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ReRunFail")
    public Boolean reRunFail;

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
