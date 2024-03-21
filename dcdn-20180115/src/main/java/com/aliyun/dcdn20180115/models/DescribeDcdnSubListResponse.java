// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSubListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnSubListResponseBody body;

    public static DescribeDcdnSubListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSubListResponse self = new DescribeDcdnSubListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSubListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnSubListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnSubListResponse setBody(DescribeDcdnSubListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnSubListResponseBody getBody() {
        return this.body;
    }

}
