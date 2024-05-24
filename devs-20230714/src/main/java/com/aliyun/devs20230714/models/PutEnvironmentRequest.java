// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutEnvironmentRequest extends TeaModel {
    @NameInMap("body")
    public Environment body;

    @NameInMap("force")
    public Boolean force;

    public static PutEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentRequest self = new PutEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentRequest setBody(Environment body) {
        this.body = body;
        return this;
    }
    public Environment getBody() {
        return this.body;
    }

    public PutEnvironmentRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
