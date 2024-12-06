// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetAppVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppVersionsResponseBody body;

    public static GetAppVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionsResponse self = new GetAppVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppVersionsResponse setBody(GetAppVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppVersionsResponseBody getBody() {
        return this.body;
    }

}
