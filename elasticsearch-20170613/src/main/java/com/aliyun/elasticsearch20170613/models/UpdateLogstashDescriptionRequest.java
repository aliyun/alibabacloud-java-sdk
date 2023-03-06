// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashDescriptionRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashDescriptionRequest self = new UpdateLogstashDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLogstashDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
