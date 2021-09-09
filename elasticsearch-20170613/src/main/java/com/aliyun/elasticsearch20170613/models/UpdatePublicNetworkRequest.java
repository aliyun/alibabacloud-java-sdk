// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdatePublicNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkRequest self = new UpdatePublicNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
