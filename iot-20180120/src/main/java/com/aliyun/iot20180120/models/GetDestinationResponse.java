// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDestinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDestinationResponseBody body;

    public static GetDestinationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDestinationResponse self = new GetDestinationResponse();
        return TeaModel.build(map, self);
    }

    public GetDestinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDestinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDestinationResponse setBody(GetDestinationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDestinationResponseBody getBody() {
        return this.body;
    }

}
