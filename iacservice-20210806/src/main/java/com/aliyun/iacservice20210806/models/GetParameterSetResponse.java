// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetParameterSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetParameterSetResponseBody body;

    public static GetParameterSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParameterSetResponse self = new GetParameterSetResponse();
        return TeaModel.build(map, self);
    }

    public GetParameterSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParameterSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParameterSetResponse setBody(GetParameterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParameterSetResponseBody getBody() {
        return this.body;
    }

}
