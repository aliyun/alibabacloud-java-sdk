// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class WhiteIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WhiteIpListResponseBody body;

    public static WhiteIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpListResponse self = new WhiteIpListResponse();
        return TeaModel.build(map, self);
    }

    public WhiteIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WhiteIpListResponse setBody(WhiteIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public WhiteIpListResponseBody getBody() {
        return this.body;
    }

}
