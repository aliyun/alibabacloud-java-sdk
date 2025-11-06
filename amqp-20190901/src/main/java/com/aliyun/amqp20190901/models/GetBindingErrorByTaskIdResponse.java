// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetBindingErrorByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBindingErrorByTaskIdResponseBody body;

    public static GetBindingErrorByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBindingErrorByTaskIdResponse self = new GetBindingErrorByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetBindingErrorByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBindingErrorByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBindingErrorByTaskIdResponse setBody(GetBindingErrorByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBindingErrorByTaskIdResponseBody getBody() {
        return this.body;
    }

}
