// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgOrWebOpenDocContentTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrgOrWebOpenDocContentTaskIdResponseBody body;

    public static GetOrgOrWebOpenDocContentTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrgOrWebOpenDocContentTaskIdResponse self = new GetOrgOrWebOpenDocContentTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetOrgOrWebOpenDocContentTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrgOrWebOpenDocContentTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrgOrWebOpenDocContentTaskIdResponse setBody(GetOrgOrWebOpenDocContentTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrgOrWebOpenDocContentTaskIdResponseBody getBody() {
        return this.body;
    }

}
