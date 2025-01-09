// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDDoSBpsListResponseBody body;

    public static DescribeDDoSBpsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsListResponse self = new DescribeDDoSBpsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDDoSBpsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDDoSBpsListResponse setBody(DescribeDDoSBpsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDDoSBpsListResponseBody getBody() {
        return this.body;
    }

}
