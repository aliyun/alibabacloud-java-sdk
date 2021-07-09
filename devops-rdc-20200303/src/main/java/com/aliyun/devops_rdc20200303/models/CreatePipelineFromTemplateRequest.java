// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreatePipelineFromTemplateRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    // 流水线模板的ID，可通过GetPipelineTemplates获取到该信息
    @NameInMap("PipelineTemplateId")
    public Long pipelineTemplateId;

    // 流水线名称
    @NameInMap("PipelineName")
    public String pipelineName;

    public static CreatePipelineFromTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineFromTemplateRequest self = new CreatePipelineFromTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineFromTemplateRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreatePipelineFromTemplateRequest setPipelineTemplateId(Long pipelineTemplateId) {
        this.pipelineTemplateId = pipelineTemplateId;
        return this;
    }
    public Long getPipelineTemplateId() {
        return this.pipelineTemplateId;
    }

    public CreatePipelineFromTemplateRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

}
