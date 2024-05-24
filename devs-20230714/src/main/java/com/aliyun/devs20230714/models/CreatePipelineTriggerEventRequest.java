// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreatePipelineTriggerEventRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTriggerEvent body;

    public static CreatePipelineTriggerEventRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineTriggerEventRequest self = new CreatePipelineTriggerEventRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineTriggerEventRequest setBody(PipelineTriggerEvent body) {
        this.body = body;
        return this;
    }
    public PipelineTriggerEvent getBody() {
        return this.body;
    }

}
