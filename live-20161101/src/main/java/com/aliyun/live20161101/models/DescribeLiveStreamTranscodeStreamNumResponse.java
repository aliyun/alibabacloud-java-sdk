// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamTranscodeStreamNumResponseBody body;

    public static DescribeLiveStreamTranscodeStreamNumResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumResponse self = new DescribeLiveStreamTranscodeStreamNumResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamTranscodeStreamNumResponse setBody(DescribeLiveStreamTranscodeStreamNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamTranscodeStreamNumResponseBody getBody() {
        return this.body;
    }

}
