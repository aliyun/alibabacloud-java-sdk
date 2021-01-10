// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCasterVideoResourcesResponse setBody(DescribeCasterVideoResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterVideoResourcesResponseBody getBody() {
        return this.body;
    }

}
