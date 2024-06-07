// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreatePickUpWaybillPreQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePickUpWaybillPreQueryResponseBody body;

    public static CreatePickUpWaybillPreQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePickUpWaybillPreQueryResponse self = new CreatePickUpWaybillPreQueryResponse();
        return TeaModel.build(map, self);
    }

    public CreatePickUpWaybillPreQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePickUpWaybillPreQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePickUpWaybillPreQueryResponse setBody(CreatePickUpWaybillPreQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePickUpWaybillPreQueryResponseBody getBody() {
        return this.body;
    }

}
