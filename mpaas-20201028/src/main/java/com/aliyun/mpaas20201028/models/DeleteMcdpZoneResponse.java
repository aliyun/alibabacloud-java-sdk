// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcdpZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMcdpZoneResponseBody body;

    public static DeleteMcdpZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcdpZoneResponse self = new DeleteMcdpZoneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMcdpZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMcdpZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMcdpZoneResponse setBody(DeleteMcdpZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMcdpZoneResponseBody getBody() {
        return this.body;
    }

}
