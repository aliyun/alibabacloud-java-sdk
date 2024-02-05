// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormDataByIDResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFormDataByIDResponseBody body;

    public static GetFormDataByIDResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFormDataByIDResponse self = new GetFormDataByIDResponse();
        return TeaModel.build(map, self);
    }

    public GetFormDataByIDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFormDataByIDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFormDataByIDResponse setBody(GetFormDataByIDResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFormDataByIDResponseBody getBody() {
        return this.body;
    }

}
