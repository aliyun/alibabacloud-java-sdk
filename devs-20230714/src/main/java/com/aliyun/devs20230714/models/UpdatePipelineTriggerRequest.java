// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class UpdatePipelineTriggerRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTrigger body;

    public static UpdatePipelineTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineTriggerRequest self = new UpdatePipelineTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineTriggerRequest setBody(PipelineTrigger body) {
        this.body = body;
        return this;
    }
    public PipelineTrigger getBody() {
        return this.body;
    }

}
