// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreatePipelineTemplateRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTemplate body;

    public static CreatePipelineTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineTemplateRequest self = new CreatePipelineTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineTemplateRequest setBody(PipelineTemplate body) {
        this.body = body;
        return this;
    }
    public PipelineTemplate getBody() {
        return this.body;
    }

}
