// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutProjectRequest extends TeaModel {
    @NameInMap("body")
    public Project body;

    @NameInMap("force")
    public Boolean force;

    public static PutProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectRequest self = new PutProjectRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectRequest setBody(Project body) {
        this.body = body;
        return this;
    }
    public Project getBody() {
        return this.body;
    }

    public PutProjectRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
