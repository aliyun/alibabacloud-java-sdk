// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelDeletionRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static CancelDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDeletionRequest self = new CancelDeletionRequest();
        return TeaModel.build(map, self);
    }

    public CancelDeletionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
