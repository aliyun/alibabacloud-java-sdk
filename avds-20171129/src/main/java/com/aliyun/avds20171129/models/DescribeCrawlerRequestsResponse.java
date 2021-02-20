// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeCrawlerRequestsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCrawlerRequestsResponseBody body;

    public static DescribeCrawlerRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrawlerRequestsResponse self = new DescribeCrawlerRequestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrawlerRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrawlerRequestsResponse setBody(DescribeCrawlerRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrawlerRequestsResponseBody getBody() {
        return this.body;
    }

}
