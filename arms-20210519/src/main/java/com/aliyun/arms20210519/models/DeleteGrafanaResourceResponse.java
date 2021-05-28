// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteGrafanaResourceResponse setBody(DeleteGrafanaResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGrafanaResourceResponseBody getBody() {
        return this.body;
    }

}
