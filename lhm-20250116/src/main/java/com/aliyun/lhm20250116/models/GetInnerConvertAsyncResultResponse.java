// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetInnerConvertAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInnerConvertAsyncResultResponseBody body;

    public static GetInnerConvertAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInnerConvertAsyncResultResponse self = new GetInnerConvertAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetInnerConvertAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInnerConvertAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInnerConvertAsyncResultResponse setBody(GetInnerConvertAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInnerConvertAsyncResultResponseBody getBody() {
        return this.body;
    }

}
