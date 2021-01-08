// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceBuildNumberStatusRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("BuildNum")
    public Long buildNum;

    public static GetPipelineInstanceBuildNumberStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceBuildNumberStatusRequest self = new GetPipelineInstanceBuildNumberStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceBuildNumberStatusRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipelineInstanceBuildNumberStatusRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineInstanceBuildNumberStatusRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public GetPipelineInstanceBuildNumberStatusRequest setBuildNum(Long buildNum) {
        this.buildNum = buildNum;
        return this;
    }
    public Long getBuildNum() {
        return this.buildNum;
    }

}
