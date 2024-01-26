// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDesktopsResponseBody body;

    public static DeleteDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsResponse self = new DeleteDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDesktopsResponse setBody(DeleteDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDesktopsResponseBody getBody() {
        return this.body;
    }

}
