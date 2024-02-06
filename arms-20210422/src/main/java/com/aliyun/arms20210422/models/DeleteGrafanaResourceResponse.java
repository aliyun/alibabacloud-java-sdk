// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGrafanaResourceResponseBody body;

    public static DeleteGrafanaResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaResourceResponse self = new DeleteGrafanaResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGrafanaResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGrafanaResourceResponse setBody(DeleteGrafanaResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGrafanaResourceResponseBody getBody() {
        return this.body;
    }

}
