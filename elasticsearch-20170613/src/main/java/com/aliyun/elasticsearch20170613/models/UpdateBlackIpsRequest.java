// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("esIPBlacklist")
    public java.util.List<String> esIPBlacklist;

    public static UpdateBlackIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackIpsRequest self = new UpdateBlackIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlackIpsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateBlackIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBlackIpsRequest setEsIPBlacklist(java.util.List<String> esIPBlacklist) {
        this.esIPBlacklist = esIPBlacklist;
        return this;
    }
    public java.util.List<String> getEsIPBlacklist() {
        return this.esIPBlacklist;
    }

}
