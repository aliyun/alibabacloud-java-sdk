// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventMaxResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSEventMaxResponseBody body;

    public static DescribeDDoSEventMaxResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventMaxResponse self = new DescribeDDoSEventMaxResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventMaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSEventMaxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSEventMaxResponse setBody(DescribeDDoSEventMaxResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSEventMaxResponseBody getBody() {
        return this.body;
    }

}
