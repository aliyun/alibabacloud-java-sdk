// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelinesRequest extends TeaModel {
    @NameInMap("trigger")
    public Boolean trigger;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdatePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinesRequest self = new UpdatePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinesRequest setTrigger(Boolean trigger) {
        this.trigger = trigger;
        return this;
    }
    public Boolean getTrigger() {
        return this.trigger;
    }

    public UpdatePipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
