// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePushProxyLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePushProxyLogResponseBody body;

    public static DescribeLivePushProxyLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePushProxyLogResponse self = new DescribeLivePushProxyLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePushProxyLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePushProxyLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePushProxyLogResponse setBody(DescribeLivePushProxyLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePushProxyLogResponseBody getBody() {
        return this.body;
    }

}
