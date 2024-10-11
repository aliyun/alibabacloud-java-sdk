// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceUpDownStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceUpDownStreamResponseBody body;

    public static GetInstanceUpDownStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpDownStreamResponse self = new GetInstanceUpDownStreamResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpDownStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceUpDownStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceUpDownStreamResponse setBody(GetInstanceUpDownStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceUpDownStreamResponseBody getBody() {
        return this.body;
    }

}
