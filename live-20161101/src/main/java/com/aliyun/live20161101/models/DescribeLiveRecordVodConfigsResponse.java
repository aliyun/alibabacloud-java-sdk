// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveRecordVodConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveRecordVodConfigsResponseBody body;

    public static DescribeLiveRecordVodConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveRecordVodConfigsResponse self = new DescribeLiveRecordVodConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveRecordVodConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveRecordVodConfigsResponse setBody(DescribeLiveRecordVodConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveRecordVodConfigsResponseBody getBody() {
        return this.body;
    }

}
