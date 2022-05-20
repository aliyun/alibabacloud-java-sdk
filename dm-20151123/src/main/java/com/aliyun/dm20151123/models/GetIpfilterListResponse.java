// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetIpfilterListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIpfilterListResponseBody body;

    public static GetIpfilterListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIpfilterListResponse self = new GetIpfilterListResponse();
        return TeaModel.build(map, self);
    }

    public GetIpfilterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIpfilterListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIpfilterListResponse setBody(GetIpfilterListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIpfilterListResponseBody getBody() {
        return this.body;
    }

}
