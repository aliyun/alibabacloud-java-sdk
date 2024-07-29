// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class FinishCurrentProjectNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishCurrentProjectNodeResponseBody body;

    public static FinishCurrentProjectNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishCurrentProjectNodeResponse self = new FinishCurrentProjectNodeResponse();
        return TeaModel.build(map, self);
    }

    public FinishCurrentProjectNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishCurrentProjectNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishCurrentProjectNodeResponse setBody(FinishCurrentProjectNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishCurrentProjectNodeResponseBody getBody() {
        return this.body;
    }

}
