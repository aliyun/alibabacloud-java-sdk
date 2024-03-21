// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDdosAllEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDdosAllEventListResponseBody body;

    public static DescribeDdosAllEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAllEventListResponse self = new DescribeDdosAllEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAllEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosAllEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDdosAllEventListResponse setBody(DescribeDdosAllEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosAllEventListResponseBody getBody() {
        return this.body;
    }

}
