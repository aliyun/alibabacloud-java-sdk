// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCasterConfigResponseBody body;

    public static DescribeCasterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterConfigResponse self = new DescribeCasterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasterConfigResponse setBody(DescribeCasterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterConfigResponseBody getBody() {
        return this.body;
    }

}
