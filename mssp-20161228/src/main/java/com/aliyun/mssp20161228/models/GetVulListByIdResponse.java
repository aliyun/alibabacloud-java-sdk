// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulListByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulListByIdResponseBody body;

    public static GetVulListByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulListByIdResponse self = new GetVulListByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetVulListByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulListByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulListByIdResponse setBody(GetVulListByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulListByIdResponseBody getBody() {
        return this.body;
    }

}
