// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDesktopGroupDetailResponseBody body;

    public static GetDesktopGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopGroupDetailResponse self = new GetDesktopGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDesktopGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDesktopGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDesktopGroupDetailResponse setBody(GetDesktopGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDesktopGroupDetailResponseBody getBody() {
        return this.body;
    }

}
