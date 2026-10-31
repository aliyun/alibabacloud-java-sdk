// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStreamTaskResponseBody body;

    public static GetStreamTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStreamTaskResponse self = new GetStreamTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetStreamTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStreamTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStreamTaskResponse setBody(GetStreamTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStreamTaskResponseBody getBody() {
        return this.body;
    }

}
