// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteTransportLayerApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransportLayerApplicationResponseBody body;

    public static DeleteTransportLayerApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransportLayerApplicationResponse self = new DeleteTransportLayerApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransportLayerApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransportLayerApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransportLayerApplicationResponse setBody(DeleteTransportLayerApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransportLayerApplicationResponseBody getBody() {
        return this.body;
    }

}
