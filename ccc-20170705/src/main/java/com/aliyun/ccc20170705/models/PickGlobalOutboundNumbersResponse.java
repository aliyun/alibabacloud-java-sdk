// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickGlobalOutboundNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PickGlobalOutboundNumbersResponseBody body;

    public static PickGlobalOutboundNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        PickGlobalOutboundNumbersResponse self = new PickGlobalOutboundNumbersResponse();
        return TeaModel.build(map, self);
    }

    public PickGlobalOutboundNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PickGlobalOutboundNumbersResponse setBody(PickGlobalOutboundNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public PickGlobalOutboundNumbersResponseBody getBody() {
        return this.body;
    }

}
