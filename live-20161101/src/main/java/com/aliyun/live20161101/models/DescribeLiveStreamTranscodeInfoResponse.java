// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamTranscodeInfoResponseBody body;

    public static DescribeLiveStreamTranscodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoResponse self = new DescribeLiveStreamTranscodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamTranscodeInfoResponse setBody(DescribeLiveStreamTranscodeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamTranscodeInfoResponseBody getBody() {
        return this.body;
    }

}
