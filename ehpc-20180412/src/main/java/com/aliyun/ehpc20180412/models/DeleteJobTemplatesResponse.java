// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJobTemplatesResponseBody body;

    public static DeleteJobTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobTemplatesResponse self = new DeleteJobTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobTemplatesResponse setBody(DeleteJobTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobTemplatesResponseBody getBody() {
        return this.body;
    }

}
