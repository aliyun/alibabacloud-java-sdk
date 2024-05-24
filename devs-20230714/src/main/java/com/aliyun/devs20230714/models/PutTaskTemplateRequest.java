// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PutTaskTemplateRequest extends TeaModel {
    @NameInMap("body")
    public TaskTemplate body;

    @NameInMap("force")
    public Boolean force;

    public static PutTaskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PutTaskTemplateRequest self = new PutTaskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PutTaskTemplateRequest setBody(TaskTemplate body) {
        this.body = body;
        return this;
    }
    public TaskTemplate getBody() {
        return this.body;
    }

    public PutTaskTemplateRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
