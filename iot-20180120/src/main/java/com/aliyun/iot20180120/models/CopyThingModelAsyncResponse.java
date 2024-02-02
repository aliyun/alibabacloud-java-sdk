// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyThingModelAsyncResponseBody body;

    public static CopyThingModelAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyThingModelAsyncResponse self = new CopyThingModelAsyncResponse();
        return TeaModel.build(map, self);
    }

    public CopyThingModelAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyThingModelAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyThingModelAsyncResponse setBody(CopyThingModelAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyThingModelAsyncResponseBody getBody() {
        return this.body;
    }

}
