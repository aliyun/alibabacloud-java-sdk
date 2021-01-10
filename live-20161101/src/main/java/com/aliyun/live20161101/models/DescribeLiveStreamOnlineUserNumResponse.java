// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOnlineUserNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamOnlineUserNumResponseBody body;

    public static DescribeLiveStreamOnlineUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOnlineUserNumResponse self = new DescribeLiveStreamOnlineUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOnlineUserNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamOnlineUserNumResponse setBody(DescribeLiveStreamOnlineUserNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamOnlineUserNumResponseBody getBody() {
        return this.body;
    }

}
