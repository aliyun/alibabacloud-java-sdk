// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullToPushListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePullToPushListResponseBody body;

    public static DescribeLivePullToPushListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullToPushListResponse self = new DescribeLivePullToPushListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullToPushListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePullToPushListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePullToPushListResponse setBody(DescribeLivePullToPushListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePullToPushListResponseBody getBody() {
        return this.body;
    }

}
