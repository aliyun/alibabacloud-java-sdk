// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNerChEcomResponseBody body;

    public static GetNerChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNerChEcomResponse self = new GetNerChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetNerChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNerChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNerChEcomResponse setBody(GetNerChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNerChEcomResponseBody getBody() {
        return this.body;
    }

}
