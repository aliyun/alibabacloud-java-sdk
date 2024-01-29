// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBlackWhiteListResponseBody body;

    public static GetBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlackWhiteListResponse self = new GetBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public GetBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBlackWhiteListResponse setBody(GetBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
