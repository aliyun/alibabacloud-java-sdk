// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteGlobalResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteGlobalResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGlobalResourceResponse setBody(DeleteGlobalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalResourceResponseBody getBody() {
        return this.body;
    }

}
