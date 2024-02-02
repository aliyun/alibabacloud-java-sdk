// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class HoldCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HoldCallResponseBody body;

    public static HoldCallResponse build(java.util.Map<String, ?> map) throws Exception {
        HoldCallResponse self = new HoldCallResponse();
        return TeaModel.build(map, self);
    }

    public HoldCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HoldCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HoldCallResponse setBody(HoldCallResponseBody body) {
        this.body = body;
        return this;
    }
    public HoldCallResponseBody getBody() {
        return this.body;
    }

}
