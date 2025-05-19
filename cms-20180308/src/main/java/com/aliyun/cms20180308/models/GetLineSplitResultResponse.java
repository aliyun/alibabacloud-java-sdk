// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLineSplitResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLineSplitResultResponseBody body;

    public static GetLineSplitResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLineSplitResultResponse self = new GetLineSplitResultResponse();
        return TeaModel.build(map, self);
    }

    public GetLineSplitResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLineSplitResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLineSplitResultResponse setBody(GetLineSplitResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLineSplitResultResponseBody getBody() {
        return this.body;
    }

}
