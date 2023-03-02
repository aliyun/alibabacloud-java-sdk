// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSAuthorizedInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPCoSAuthorizedInfoResponseBody body;

    public static DescribeMPCoSAuthorizedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSAuthorizedInfoResponse self = new DescribeMPCoSAuthorizedInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSAuthorizedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPCoSAuthorizedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMPCoSAuthorizedInfoResponse setBody(DescribeMPCoSAuthorizedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPCoSAuthorizedInfoResponseBody getBody() {
        return this.body;
    }

}
