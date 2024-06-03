// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashSettingsRequest self = new UpdateLogstashSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateLogstashSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
