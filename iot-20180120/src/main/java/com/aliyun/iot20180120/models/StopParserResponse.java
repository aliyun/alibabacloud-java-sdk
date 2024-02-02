// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class StopParserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopParserResponseBody body;

    public static StopParserResponse build(java.util.Map<String, ?> map) throws Exception {
        StopParserResponse self = new StopParserResponse();
        return TeaModel.build(map, self);
    }

    public StopParserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopParserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopParserResponse setBody(StopParserResponseBody body) {
        this.body = body;
        return this;
    }
    public StopParserResponseBody getBody() {
        return this.body;
    }

}
