// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDrivesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrivesResponseBody body;

    public static DescribeDrivesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrivesResponse self = new DescribeDrivesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrivesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrivesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrivesResponse setBody(DescribeDrivesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrivesResponseBody getBody() {
        return this.body;
    }

}
