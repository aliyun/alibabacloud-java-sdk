// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsTotalCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveStreamsTotalCountResponseBody body;

    public static DescribeLiveStreamsTotalCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsTotalCountResponse self = new DescribeLiveStreamsTotalCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsTotalCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveStreamsTotalCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveStreamsTotalCountResponse setBody(DescribeLiveStreamsTotalCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveStreamsTotalCountResponseBody getBody() {
        return this.body;
    }

}
