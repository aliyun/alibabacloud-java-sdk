// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteCollectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectorRequest self = new DeleteCollectorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCollectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
