// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDestinationResponseBody body;

    public static UpdateDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDestinationResponse self = new UpdateDestinationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDestinationResponse setBody(UpdateDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDestinationResponseBody getBody() {
        return this.body;
    }

}
