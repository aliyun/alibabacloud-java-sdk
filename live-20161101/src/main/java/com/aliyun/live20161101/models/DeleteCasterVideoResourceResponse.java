// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterVideoResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCasterVideoResourceResponseBody body;

    public static DeleteCasterVideoResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterVideoResourceResponse self = new DeleteCasterVideoResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterVideoResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterVideoResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCasterVideoResourceResponse setBody(DeleteCasterVideoResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

}
