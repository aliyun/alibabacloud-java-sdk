// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumExceptionStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRumExceptionStackResponseBody body;

    public static GetRumExceptionStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRumExceptionStackResponse self = new GetRumExceptionStackResponse();
        return TeaModel.build(map, self);
    }

    public GetRumExceptionStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRumExceptionStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRumExceptionStackResponse setBody(GetRumExceptionStackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRumExceptionStackResponseBody getBody() {
        return this.body;
    }

}
