// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThingModelTslPublishedResponseBody body;

    public static GetThingModelTslPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslPublishedResponse self = new GetThingModelTslPublishedResponse();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslPublishedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingModelTslPublishedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThingModelTslPublishedResponse setBody(GetThingModelTslPublishedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingModelTslPublishedResponseBody getBody() {
        return this.body;
    }

}
