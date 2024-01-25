// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetDeliverableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeliverableResponseBody body;

    public static GetDeliverableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliverableResponse self = new GetDeliverableResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliverableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliverableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliverableResponse setBody(GetDeliverableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliverableResponseBody getBody() {
        return this.body;
    }

}
