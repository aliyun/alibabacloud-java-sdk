// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DeleteSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSpecificConfigResponseBody body;

    public static DeleteSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpecificConfigResponse self = new DeleteSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpecificConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpecificConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSpecificConfigResponse setBody(DeleteSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
