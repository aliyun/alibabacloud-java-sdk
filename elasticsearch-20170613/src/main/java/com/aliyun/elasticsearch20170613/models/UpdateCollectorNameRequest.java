// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateCollectorNameRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static UpdateCollectorNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectorNameRequest self = new UpdateCollectorNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCollectorNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
