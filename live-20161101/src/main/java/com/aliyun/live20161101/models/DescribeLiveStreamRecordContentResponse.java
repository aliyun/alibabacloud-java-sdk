// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamRecordContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamRecordContentResponseBody body;

    public static DescribeLiveStreamRecordContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamRecordContentResponse self = new DescribeLiveStreamRecordContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamRecordContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamRecordContentResponse setBody(DescribeLiveStreamRecordContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamRecordContentResponseBody getBody() {
        return this.body;
    }

}
