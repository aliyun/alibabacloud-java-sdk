// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CoachCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CoachCallResponseBody body;

    public static CoachCallResponse build(java.util.Map<String, ?> map) throws Exception {
        CoachCallResponse self = new CoachCallResponse();
        return TeaModel.build(map, self);
    }

    public CoachCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CoachCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CoachCallResponse setBody(CoachCallResponseBody body) {
        this.body = body;
        return this;
    }
    public CoachCallResponseBody getBody() {
        return this.body;
    }

}
