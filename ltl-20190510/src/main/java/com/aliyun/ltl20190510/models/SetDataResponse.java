// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class SetDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDataResponseBody body;

    public static SetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataResponse self = new SetDataResponse();
        return TeaModel.build(map, self);
    }

    public SetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataResponse setBody(SetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataResponseBody getBody() {
        return this.body;
    }

}
