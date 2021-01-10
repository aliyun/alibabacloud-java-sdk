// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordIndexFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamRecordIndexFileResponseBody body;

    public static DescribeLiveStreamRecordIndexFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordIndexFileResponse self = new DescribeLiveStreamRecordIndexFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordIndexFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamRecordIndexFileResponse setBody(DescribeLiveStreamRecordIndexFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamRecordIndexFileResponseBody getBody() {
        return this.body;
    }

}
