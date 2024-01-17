// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetProjectPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectPoliciesResponseBody body;

    public static GetProjectPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPoliciesResponse self = new GetProjectPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectPoliciesResponse setBody(GetProjectPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectPoliciesResponseBody getBody() {
        return this.body;
    }

}
