// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteStudioLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStudioLayoutResponseBody body;

    public static DeleteStudioLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStudioLayoutResponse self = new DeleteStudioLayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStudioLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStudioLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStudioLayoutResponse setBody(DeleteStudioLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStudioLayoutResponseBody getBody() {
        return this.body;
    }

}
