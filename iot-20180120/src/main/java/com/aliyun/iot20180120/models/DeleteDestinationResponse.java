// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDestinationResponseBody body;

    public static DeleteDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDestinationResponse self = new DeleteDestinationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDestinationResponse setBody(DeleteDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDestinationResponseBody getBody() {
        return this.body;
    }

}
