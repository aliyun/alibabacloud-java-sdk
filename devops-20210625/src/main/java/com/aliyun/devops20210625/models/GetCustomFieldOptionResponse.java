// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCustomFieldOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomFieldOptionResponseBody body;

    public static GetCustomFieldOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldOptionResponse self = new GetCustomFieldOptionResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomFieldOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomFieldOptionResponse setBody(GetCustomFieldOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomFieldOptionResponseBody getBody() {
        return this.body;
    }

}
