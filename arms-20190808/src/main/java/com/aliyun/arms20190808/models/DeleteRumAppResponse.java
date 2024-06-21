// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRumAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRumAppResponseBody body;

    public static DeleteRumAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumAppResponse self = new DeleteRumAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRumAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRumAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRumAppResponse setBody(DeleteRumAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRumAppResponseBody getBody() {
        return this.body;
    }

}
