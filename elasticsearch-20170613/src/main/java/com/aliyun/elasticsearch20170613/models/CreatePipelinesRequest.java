// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    @NameInMap("trigger")
    public Boolean trigger;

    public static CreatePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinesRequest self = new CreatePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePipelinesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreatePipelinesRequest setTrigger(Boolean trigger) {
        this.trigger = trigger;
        return this;
    }
    public Boolean getTrigger() {
        return this.trigger;
    }

}
