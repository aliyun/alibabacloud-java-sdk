// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeWorkModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeWorkModeResponseBody body;

    public static ChangeWorkModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeWorkModeResponse self = new ChangeWorkModeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeWorkModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeWorkModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeWorkModeResponse setBody(ChangeWorkModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeWorkModeResponseBody getBody() {
        return this.body;
    }

}
