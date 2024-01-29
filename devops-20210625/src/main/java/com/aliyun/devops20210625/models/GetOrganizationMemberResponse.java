// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetOrganizationMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrganizationMemberResponseBody body;

    public static GetOrganizationMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationMemberResponse self = new GetOrganizationMemberResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationMemberResponse setBody(GetOrganizationMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationMemberResponseBody getBody() {
        return this.body;
    }

}
