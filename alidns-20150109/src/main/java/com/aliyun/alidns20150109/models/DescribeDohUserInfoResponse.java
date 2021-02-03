// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDohUserInfoResponseBody body;

    public static DescribeDohUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoResponse self = new DescribeDohUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDohUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDohUserInfoResponse setBody(DescribeDohUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDohUserInfoResponseBody getBody() {
        return this.body;
    }

}
