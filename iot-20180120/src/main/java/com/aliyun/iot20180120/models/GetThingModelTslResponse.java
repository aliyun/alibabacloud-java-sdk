// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThingModelTslResponseBody body;

    public static GetThingModelTslResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslResponse self = new GetThingModelTslResponse();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingModelTslResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThingModelTslResponse setBody(GetThingModelTslResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingModelTslResponseBody getBody() {
        return this.body;
    }

}
