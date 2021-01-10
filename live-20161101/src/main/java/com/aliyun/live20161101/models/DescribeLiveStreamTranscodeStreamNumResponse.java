// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLiveStreamTranscodeStreamNumResponse setBody(DescribeLiveStreamTranscodeStreamNumResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamTranscodeStreamNumResponseBody getBody() {
        return this.body;
    }

}
