// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcTunnelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcTunnelResponseBody body;

    public static DescribeCcTunnelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcTunnelResponse self = new DescribeCcTunnelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcTunnelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcTunnelResponse setBody(DescribeCcTunnelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcTunnelResponseBody getBody() {
        return this.body;
    }

}
