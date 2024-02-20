// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetTrackListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrackListResponseBody body;

    public static GetTrackListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrackListResponse self = new GetTrackListResponse();
        return TeaModel.build(map, self);
    }

    public GetTrackListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrackListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrackListResponse setBody(GetTrackListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrackListResponseBody getBody() {
        return this.body;
    }

}
