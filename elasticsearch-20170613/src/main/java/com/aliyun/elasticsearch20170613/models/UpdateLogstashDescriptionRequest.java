// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashDescriptionRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
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
