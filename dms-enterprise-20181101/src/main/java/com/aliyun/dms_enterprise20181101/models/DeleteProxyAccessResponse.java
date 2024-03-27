// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteProxyAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProxyAccessResponseBody body;

    public static DeleteProxyAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProxyAccessResponse self = new DeleteProxyAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProxyAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProxyAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProxyAccessResponse setBody(DeleteProxyAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProxyAccessResponseBody getBody() {
        return this.body;
    }

}
