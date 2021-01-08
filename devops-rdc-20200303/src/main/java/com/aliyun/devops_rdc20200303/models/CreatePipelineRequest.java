// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Pipeline")
    public String pipeline;

    @NameInMap("UserPk")
    public String userPk;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreatePipelineRequest setPipeline(String pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public String getPipeline() {
        return this.pipeline;
    }

    public CreatePipelineRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
