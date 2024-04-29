// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosAllEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDosAllEventListResponseBody body;

    public static DescribeDDosAllEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosAllEventListResponse self = new DescribeDDosAllEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDosAllEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDosAllEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDosAllEventListResponse setBody(DescribeDDosAllEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDosAllEventListResponseBody getBody() {
        return this.body;
    }

}
