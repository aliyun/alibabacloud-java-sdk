// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseManagedIndexRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static CloseManagedIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseManagedIndexRequest self = new CloseManagedIndexRequest();
        return TeaModel.build(map, self);
    }

    public CloseManagedIndexRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloseManagedIndexRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
