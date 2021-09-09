// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashChargeTypeRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashChargeTypeRequest self = new UpdateLogstashChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
