// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteGlobalResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGlobalResourceResponseBody body;

    public static DeleteGlobalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalResourceResponse self = new DeleteGlobalResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalResourceResponse setBody(DeleteGlobalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalResourceResponseBody getBody() {
        return this.body;
    }

}
