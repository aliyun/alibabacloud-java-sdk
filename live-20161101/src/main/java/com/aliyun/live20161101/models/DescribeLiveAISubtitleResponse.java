// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAISubtitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveAISubtitleResponseBody body;

    public static DescribeLiveAISubtitleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAISubtitleResponse self = new DescribeLiveAISubtitleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAISubtitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAISubtitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveAISubtitleResponse setBody(DescribeLiveAISubtitleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAISubtitleResponseBody getBody() {
        return this.body;
    }

}
