// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCasterVideoResourcesResponseBody body;

    public static DescribeCasterVideoResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterVideoResourcesResponse self = new DescribeCasterVideoResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterVideoResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterVideoResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasterVideoResourcesResponse setBody(DescribeCasterVideoResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterVideoResourcesResponseBody getBody() {
        return this.body;
    }

}
