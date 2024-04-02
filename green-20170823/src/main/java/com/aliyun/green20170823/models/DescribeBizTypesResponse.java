// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizTypesResponseBody body;

    public static DescribeBizTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypesResponse self = new DescribeBizTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizTypesResponse setBody(DescribeBizTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizTypesResponseBody getBody() {
        return this.body;
    }

}
