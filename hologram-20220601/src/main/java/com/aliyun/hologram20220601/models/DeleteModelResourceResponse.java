// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteModelResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelResourceResponseBody body;

    public static DeleteModelResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelResourceResponse self = new DeleteModelResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelResourceResponse setBody(DeleteModelResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelResourceResponseBody getBody() {
        return this.body;
    }

}
