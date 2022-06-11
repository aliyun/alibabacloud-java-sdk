// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetworkWhiteIpsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdatePrivateNetworkWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetworkWhiteIpsRequest self = new UpdatePrivateNetworkWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetworkWhiteIpsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdatePrivateNetworkWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePrivateNetworkWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
