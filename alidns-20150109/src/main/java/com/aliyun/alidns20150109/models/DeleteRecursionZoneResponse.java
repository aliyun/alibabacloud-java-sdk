// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteRecursionZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecursionZoneResponseBody body;

    public static DeleteRecursionZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecursionZoneResponse self = new DeleteRecursionZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecursionZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecursionZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecursionZoneResponse setBody(DeleteRecursionZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecursionZoneResponseBody getBody() {
        return this.body;
    }

}
