// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUpVideoAudioInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveUpVideoAudioInfoResponseBody body;

    public static DescribeLiveUpVideoAudioInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUpVideoAudioInfoResponse self = new DescribeLiveUpVideoAudioInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUpVideoAudioInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveUpVideoAudioInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveUpVideoAudioInfoResponse setBody(DescribeLiveUpVideoAudioInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveUpVideoAudioInfoResponseBody getBody() {
        return this.body;
    }

}
