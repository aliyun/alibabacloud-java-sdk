// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreatePipelineTriggerRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTrigger body;

    public static CreatePipelineTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineTriggerRequest self = new CreatePipelineTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineTriggerRequest setBody(PipelineTrigger body) {
        this.body = body;
        return this;
    }
    public PipelineTrigger getBody() {
        return this.body;
    }

}
