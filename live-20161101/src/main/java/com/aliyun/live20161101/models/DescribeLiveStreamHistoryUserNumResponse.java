// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamHistoryUserNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamHistoryUserNumResponseBody body;

    public static DescribeLiveStreamHistoryUserNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamHistoryUserNumResponse self = new DescribeLiveStreamHistoryUserNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamHistoryUserNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamHistoryUserNumResponse setBody(DescribeLiveStreamHistoryUserNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamHistoryUserNumResponseBody getBody() {
        return this.body;
    }

}
