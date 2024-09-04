// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVideoDnaResponseBody body;

    public static DeleteVideoDnaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaResponse self = new DeleteVideoDnaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVideoDnaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVideoDnaResponse setBody(DeleteVideoDnaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVideoDnaResponseBody getBody() {
        return this.body;
    }

}
