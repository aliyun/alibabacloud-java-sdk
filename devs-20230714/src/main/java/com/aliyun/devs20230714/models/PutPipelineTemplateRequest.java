// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutPipelineTemplateRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTemplate body;

    @NameInMap("force")
    public Boolean force;

    public static PutPipelineTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineTemplateRequest self = new PutPipelineTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PutPipelineTemplateRequest setBody(PipelineTemplate body) {
        this.body = body;
        return this;
    }
    public PipelineTemplate getBody() {
        return this.body;
    }

    public PutPipelineTemplateRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
