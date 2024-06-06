// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushItemDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushItemDataResponseBody body;

    public static PushItemDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushItemDataResponse self = new PushItemDataResponse();
        return TeaModel.build(map, self);
    }

    public PushItemDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushItemDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushItemDataResponse setBody(PushItemDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PushItemDataResponseBody getBody() {
        return this.body;
    }

}
