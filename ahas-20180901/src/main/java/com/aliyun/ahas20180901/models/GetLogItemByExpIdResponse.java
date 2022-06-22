// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetLogItemByExpIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogItemByExpIdResponseBody body;

    public static GetLogItemByExpIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogItemByExpIdResponse self = new GetLogItemByExpIdResponse();
        return TeaModel.build(map, self);
    }

    public GetLogItemByExpIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogItemByExpIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogItemByExpIdResponse setBody(GetLogItemByExpIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogItemByExpIdResponseBody getBody() {
        return this.body;
    }

}
