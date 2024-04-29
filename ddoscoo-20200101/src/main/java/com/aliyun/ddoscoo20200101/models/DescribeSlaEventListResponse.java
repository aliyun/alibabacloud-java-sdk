// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlaEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlaEventListResponseBody body;

    public static DescribeSlaEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlaEventListResponse self = new DescribeSlaEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlaEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlaEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlaEventListResponse setBody(DescribeSlaEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlaEventListResponseBody getBody() {
        return this.body;
    }

}
