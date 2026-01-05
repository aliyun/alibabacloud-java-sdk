// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveTagResourcesResponseBody body;

    public static DescribeLiveTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTagResourcesResponse self = new DescribeLiveTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveTagResourcesResponse setBody(DescribeLiveTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveTagResourcesResponseBody getBody() {
        return this.body;
    }

}
