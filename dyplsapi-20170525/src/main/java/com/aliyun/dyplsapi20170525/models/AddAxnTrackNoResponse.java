// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class AddAxnTrackNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAxnTrackNoResponseBody body;

    public static AddAxnTrackNoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAxnTrackNoResponse self = new AddAxnTrackNoResponse();
        return TeaModel.build(map, self);
    }

    public AddAxnTrackNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAxnTrackNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAxnTrackNoResponse setBody(AddAxnTrackNoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAxnTrackNoResponseBody getBody() {
        return this.body;
    }

}
