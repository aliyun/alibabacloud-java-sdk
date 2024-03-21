// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnRefreshTaskByIdResponseBody body;

    public static DescribeDcdnRefreshTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTaskByIdResponse self = new DescribeDcdnRefreshTaskByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTaskByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnRefreshTaskByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnRefreshTaskByIdResponse setBody(DescribeDcdnRefreshTaskByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnRefreshTaskByIdResponseBody getBody() {
        return this.body;
    }

}
