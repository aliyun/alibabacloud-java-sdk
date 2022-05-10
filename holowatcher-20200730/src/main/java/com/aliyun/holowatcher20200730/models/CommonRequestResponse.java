// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CommonRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CommonRequestResponseBody body;

    public static CommonRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CommonRequestResponse self = new CommonRequestResponse();
        return TeaModel.build(map, self);
    }

    public CommonRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommonRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommonRequestResponse setBody(CommonRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CommonRequestResponseBody getBody() {
        return this.body;
    }

}
