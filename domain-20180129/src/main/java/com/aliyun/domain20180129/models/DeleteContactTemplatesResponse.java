// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactTemplatesResponseBody body;

    public static DeleteContactTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesResponse self = new DeleteContactTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactTemplatesResponse setBody(DeleteContactTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactTemplatesResponseBody getBody() {
        return this.body;
    }

}
