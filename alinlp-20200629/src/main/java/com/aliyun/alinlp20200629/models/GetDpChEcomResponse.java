// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDpChEcomResponseBody body;

    public static GetDpChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDpChEcomResponse self = new GetDpChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetDpChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDpChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDpChEcomResponse setBody(GetDpChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDpChEcomResponseBody getBody() {
        return this.body;
    }

}
