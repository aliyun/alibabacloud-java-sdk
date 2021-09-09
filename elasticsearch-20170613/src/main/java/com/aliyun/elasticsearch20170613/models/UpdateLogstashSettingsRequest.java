// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashSettingsRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashSettingsRequest self = new UpdateLogstashSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
