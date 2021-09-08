// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetThingModelTslPublishedResponse setBody(GetThingModelTslPublishedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingModelTslPublishedResponseBody getBody() {
        return this.body;
    }

}
