// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesRequest extends TeaModel {
    @NameInMap("trigger")
    public Boolean trigger;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreatePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinesRequest self = new CreatePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelinesRequest setTrigger(Boolean trigger) {
        this.trigger = trigger;
        return this;
    }
    public Boolean getTrigger() {
        return this.trigger;
    }

    public CreatePipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
