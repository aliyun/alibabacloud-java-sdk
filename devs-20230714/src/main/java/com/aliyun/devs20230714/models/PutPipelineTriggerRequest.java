// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutPipelineTriggerRequest extends TeaModel {
    @NameInMap("body")
    public PipelineTrigger body;

    @NameInMap("force")
    public Boolean force;

    public static PutPipelineTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineTriggerRequest self = new PutPipelineTriggerRequest();
        return TeaModel.build(map, self);
    }

    public PutPipelineTriggerRequest setBody(PipelineTrigger body) {
        this.body = body;
        return this;
    }
    public PipelineTrigger getBody() {
        return this.body;
    }

    public PutPipelineTriggerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
