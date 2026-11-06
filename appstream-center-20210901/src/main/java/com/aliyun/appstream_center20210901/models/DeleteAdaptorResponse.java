// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAdaptorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdaptorResponseBody body;

    public static DeleteAdaptorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdaptorResponse self = new DeleteAdaptorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdaptorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdaptorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdaptorResponse setBody(DeleteAdaptorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdaptorResponseBody getBody() {
        return this.body;
    }

}
