// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutTaskStatusRequest extends TeaModel {
    @NameInMap("body")
    public Task body;

    @NameInMap("force")
    public Boolean force;

    public static PutTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PutTaskStatusRequest self = new PutTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public PutTaskStatusRequest setBody(Task body) {
        this.body = body;
        return this;
    }
    public Task getBody() {
        return this.body;
    }

    public PutTaskStatusRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
