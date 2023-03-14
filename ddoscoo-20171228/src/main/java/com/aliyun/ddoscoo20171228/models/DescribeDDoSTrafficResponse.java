// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDDoSTrafficResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDDoSTrafficResponseBody body;

    public static DescribeDDoSTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSTrafficResponse self = new DescribeDDoSTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSTrafficResponse setBody(DescribeDDoSTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSTrafficResponseBody getBody() {
        return this.body;
    }

}
