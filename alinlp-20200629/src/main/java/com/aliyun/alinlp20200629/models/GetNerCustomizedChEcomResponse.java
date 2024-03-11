// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerCustomizedChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNerCustomizedChEcomResponseBody body;

    public static GetNerCustomizedChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNerCustomizedChEcomResponse self = new GetNerCustomizedChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetNerCustomizedChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNerCustomizedChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNerCustomizedChEcomResponse setBody(GetNerCustomizedChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNerCustomizedChEcomResponseBody getBody() {
        return this.body;
    }

}
