// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class RecoverCallInConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverCallInConfigResponseBody body;

    public static RecoverCallInConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverCallInConfigResponse self = new RecoverCallInConfigResponse();
        return TeaModel.build(map, self);
    }

    public RecoverCallInConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverCallInConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverCallInConfigResponse setBody(RecoverCallInConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverCallInConfigResponseBody getBody() {
        return this.body;
    }

}
