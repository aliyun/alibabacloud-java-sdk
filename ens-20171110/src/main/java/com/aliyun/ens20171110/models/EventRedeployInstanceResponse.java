// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRedeployInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EventRedeployInstanceResponseBody body;

    public static EventRedeployInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EventRedeployInstanceResponse self = new EventRedeployInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EventRedeployInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EventRedeployInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EventRedeployInstanceResponse setBody(EventRedeployInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EventRedeployInstanceResponseBody getBody() {
        return this.body;
    }

}
