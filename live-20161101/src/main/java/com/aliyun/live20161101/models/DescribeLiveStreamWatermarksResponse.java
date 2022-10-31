// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamWatermarksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveStreamWatermarksResponseBody body;

    public static DescribeLiveStreamWatermarksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamWatermarksResponse self = new DescribeLiveStreamWatermarksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamWatermarksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamWatermarksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamWatermarksResponse setBody(DescribeLiveStreamWatermarksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamWatermarksResponseBody getBody() {
        return this.body;
    }

}
