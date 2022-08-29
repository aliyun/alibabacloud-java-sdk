// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetMpcPrivateIdJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMpcPrivateIdJobResponseBody body;

    public static GetMpcPrivateIdJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMpcPrivateIdJobResponse self = new GetMpcPrivateIdJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMpcPrivateIdJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMpcPrivateIdJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMpcPrivateIdJobResponse setBody(GetMpcPrivateIdJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMpcPrivateIdJobResponseBody getBody() {
        return this.body;
    }

}
