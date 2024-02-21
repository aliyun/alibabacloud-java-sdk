// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnUserConfigsResponseBody body;

    public static DescribeCdnUserConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserConfigsResponse self = new DescribeCdnUserConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnUserConfigsResponse setBody(DescribeCdnUserConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserConfigsResponseBody getBody() {
        return this.body;
    }

}
