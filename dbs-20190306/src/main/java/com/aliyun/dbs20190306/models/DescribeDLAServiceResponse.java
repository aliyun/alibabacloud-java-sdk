// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeDLAServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDLAServiceResponseBody body;

    public static DescribeDLAServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDLAServiceResponse self = new DescribeDLAServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDLAServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDLAServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDLAServiceResponse setBody(DescribeDLAServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDLAServiceResponseBody getBody() {
        return this.body;
    }

}
