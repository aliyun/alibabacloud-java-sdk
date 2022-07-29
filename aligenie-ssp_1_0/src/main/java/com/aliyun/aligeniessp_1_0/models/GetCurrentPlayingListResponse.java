// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCurrentPlayingListResponseBody body;

    public static GetCurrentPlayingListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingListResponse self = new GetCurrentPlayingListResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCurrentPlayingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCurrentPlayingListResponse setBody(GetCurrentPlayingListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCurrentPlayingListResponseBody getBody() {
        return this.body;
    }

}
