// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePullStreamConfigResponseBody body;

    public static DescribeLivePullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigResponse self = new DescribeLivePullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePullStreamConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePullStreamConfigResponse setBody(DescribeLivePullStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePullStreamConfigResponseBody getBody() {
        return this.body;
    }

}
