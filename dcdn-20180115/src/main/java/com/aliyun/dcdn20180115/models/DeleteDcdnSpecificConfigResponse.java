// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDcdnSpecificConfigResponseBody body;

    public static DeleteDcdnSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnSpecificConfigResponse self = new DeleteDcdnSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnSpecificConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDcdnSpecificConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDcdnSpecificConfigResponse setBody(DeleteDcdnSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDcdnSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
