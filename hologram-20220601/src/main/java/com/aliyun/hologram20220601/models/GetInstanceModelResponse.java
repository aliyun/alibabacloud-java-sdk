// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetInstanceModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceModelResponseBody body;

    public static GetInstanceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceModelResponse self = new GetInstanceModelResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceModelResponse setBody(GetInstanceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceModelResponseBody getBody() {
        return this.body;
    }

}
