// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetNodeUpDownStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNodeUpDownStreamResponseBody body;

    public static GetNodeUpDownStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeUpDownStreamResponse self = new GetNodeUpDownStreamResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeUpDownStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeUpDownStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeUpDownStreamResponse setBody(GetNodeUpDownStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeUpDownStreamResponseBody getBody() {
        return this.body;
    }

}
