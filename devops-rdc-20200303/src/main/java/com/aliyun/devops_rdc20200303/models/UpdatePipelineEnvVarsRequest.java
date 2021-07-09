// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdatePipelineEnvVarsRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    // 流水线id
    @NameInMap("PipelineId")
    public Long pipelineId;

    // 需要修改的环境变量和默认值，json形式
    @NameInMap("EnvVars")
    public String envVars;

    public static UpdatePipelineEnvVarsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineEnvVarsRequest self = new UpdatePipelineEnvVarsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineEnvVarsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdatePipelineEnvVarsRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public UpdatePipelineEnvVarsRequest setEnvVars(String envVars) {
        this.envVars = envVars;
        return this;
    }
    public String getEnvVars() {
        return this.envVars;
    }

}
