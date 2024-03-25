// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteServiceInCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteServiceInCenResponseBody body;

    public static DeleteRouteServiceInCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteServiceInCenResponse self = new DeleteRouteServiceInCenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteServiceInCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteServiceInCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteServiceInCenResponse setBody(DeleteRouteServiceInCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteServiceInCenResponseBody getBody() {
        return this.body;
    }

}
