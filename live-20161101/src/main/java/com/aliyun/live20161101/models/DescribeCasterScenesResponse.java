// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterScenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCasterScenesResponseBody body;

    public static DescribeCasterScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterScenesResponse self = new DescribeCasterScenesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterScenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCasterScenesResponse setBody(DescribeCasterScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterScenesResponseBody getBody() {
        return this.body;
    }

}
