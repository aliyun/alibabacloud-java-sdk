// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrganizationResponseBody body;

    public static GetOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationResponse self = new GetOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationResponse setBody(GetOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationResponseBody getBody() {
        return this.body;
    }

}
