// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AcceptDataworksEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptDataworksEventResponseBody body;

    public static AcceptDataworksEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptDataworksEventResponse self = new AcceptDataworksEventResponse();
        return TeaModel.build(map, self);
    }

    public AcceptDataworksEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptDataworksEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptDataworksEventResponse setBody(AcceptDataworksEventResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptDataworksEventResponseBody getBody() {
        return this.body;
    }

}
