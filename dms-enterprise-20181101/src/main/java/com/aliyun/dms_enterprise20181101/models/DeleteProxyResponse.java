// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProxyResponseBody body;

    public static DeleteProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProxyResponse self = new DeleteProxyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProxyResponse setBody(DeleteProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProxyResponseBody getBody() {
        return this.body;
    }

}
