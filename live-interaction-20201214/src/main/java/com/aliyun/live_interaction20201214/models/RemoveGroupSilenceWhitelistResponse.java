// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RemoveGroupSilenceWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveGroupSilenceWhitelistResponseBody body;

    public static RemoveGroupSilenceWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveGroupSilenceWhitelistResponse self = new RemoveGroupSilenceWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public RemoveGroupSilenceWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveGroupSilenceWhitelistResponse setBody(RemoveGroupSilenceWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveGroupSilenceWhitelistResponseBody getBody() {
        return this.body;
    }

}
