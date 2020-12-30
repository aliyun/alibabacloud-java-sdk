// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpBlackListConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetIpBlackListConfigResponseBody body;

    public static SetIpBlackListConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIpBlackListConfigResponse self = new SetIpBlackListConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetIpBlackListConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIpBlackListConfigResponse setBody(SetIpBlackListConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIpBlackListConfigResponseBody getBody() {
        return this.body;
    }

}
