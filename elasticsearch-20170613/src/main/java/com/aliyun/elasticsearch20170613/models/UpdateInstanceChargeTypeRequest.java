// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceChargeTypeRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateInstanceChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceChargeTypeRequest self = new UpdateInstanceChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceChargeTypeRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateInstanceChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
