// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMergeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamMergeResponseBody body;

    public static DescribeLiveStreamMergeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMergeResponse self = new DescribeLiveStreamMergeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMergeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamMergeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamMergeResponse setBody(DescribeLiveStreamMergeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamMergeResponseBody getBody() {
        return this.body;
    }

}
