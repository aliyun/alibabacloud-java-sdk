// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosEventListResponseBody body;

    public static DescribeDdosEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventListResponse self = new DescribeDdosEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosEventListResponse setBody(DescribeDdosEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosEventListResponseBody getBody() {
        return this.body;
    }

}
