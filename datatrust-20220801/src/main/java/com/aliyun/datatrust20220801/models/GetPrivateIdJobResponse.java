// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetPrivateIdJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPrivateIdJobResponseBody body;

    public static GetPrivateIdJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateIdJobResponse self = new GetPrivateIdJobResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateIdJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateIdJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrivateIdJobResponse setBody(GetPrivateIdJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateIdJobResponseBody getBody() {
        return this.body;
    }

}
