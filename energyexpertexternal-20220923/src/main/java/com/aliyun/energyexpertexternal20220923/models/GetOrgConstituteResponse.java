// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetOrgConstituteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrgConstituteResponseBody body;

    public static GetOrgConstituteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrgConstituteResponse self = new GetOrgConstituteResponse();
        return TeaModel.build(map, self);
    }

    public GetOrgConstituteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrgConstituteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrgConstituteResponse setBody(GetOrgConstituteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrgConstituteResponseBody getBody() {
        return this.body;
    }

}
