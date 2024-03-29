// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTransModelListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimTransModelListResponseBody body;

    public static GetBimTransModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimTransModelListResponse self = new GetBimTransModelListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimTransModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimTransModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimTransModelListResponse setBody(GetBimTransModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimTransModelListResponseBody getBody() {
        return this.body;
    }

}
