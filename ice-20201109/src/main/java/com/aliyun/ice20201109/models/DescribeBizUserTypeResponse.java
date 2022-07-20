// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeBizUserTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBizUserTypeResponseBody body;

    public static DescribeBizUserTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizUserTypeResponse self = new DescribeBizUserTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizUserTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizUserTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizUserTypeResponse setBody(DescribeBizUserTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizUserTypeResponseBody getBody() {
        return this.body;
    }

}
