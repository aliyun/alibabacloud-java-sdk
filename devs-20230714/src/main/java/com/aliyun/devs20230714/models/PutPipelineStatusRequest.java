// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutPipelineStatusRequest extends TeaModel {
    @NameInMap("body")
    public Pipeline body;

    @NameInMap("force")
    public Boolean force;

    public static PutPipelineStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PutPipelineStatusRequest self = new PutPipelineStatusRequest();
        return TeaModel.build(map, self);
    }

    public PutPipelineStatusRequest setBody(Pipeline body) {
        this.body = body;
        return this;
    }
    public Pipeline getBody() {
        return this.body;
    }

    public PutPipelineStatusRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
