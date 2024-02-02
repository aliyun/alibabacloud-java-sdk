// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelStatusInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThingModelStatusInnerResponseBody body;

    public static GetThingModelStatusInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelStatusInnerResponse self = new GetThingModelStatusInnerResponse();
        return TeaModel.build(map, self);
    }

    public GetThingModelStatusInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingModelStatusInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThingModelStatusInnerResponse setBody(GetThingModelStatusInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingModelStatusInnerResponseBody getBody() {
        return this.body;
    }

}
