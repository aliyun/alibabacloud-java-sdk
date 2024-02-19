// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSampleDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleDataResponseBody body;

    public static DescribeSampleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataResponse self = new DescribeSampleDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleDataResponse setBody(DescribeSampleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleDataResponseBody getBody() {
        return this.body;
    }

}
