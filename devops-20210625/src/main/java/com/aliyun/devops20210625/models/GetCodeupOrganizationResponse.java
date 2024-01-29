// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCodeupOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCodeupOrganizationResponseBody body;

    public static GetCodeupOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCodeupOrganizationResponse self = new GetCodeupOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public GetCodeupOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCodeupOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCodeupOrganizationResponse setBody(GetCodeupOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeupOrganizationResponseBody getBody() {
        return this.body;
    }

}
