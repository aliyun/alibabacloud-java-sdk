// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePushProxyUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLivePushProxyUsageDataResponseBody body;

    public static DescribeLivePushProxyUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePushProxyUsageDataResponse self = new DescribeLivePushProxyUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLivePushProxyUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLivePushProxyUsageDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLivePushProxyUsageDataResponse setBody(DescribeLivePushProxyUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLivePushProxyUsageDataResponseBody getBody() {
        return this.body;
    }

}
