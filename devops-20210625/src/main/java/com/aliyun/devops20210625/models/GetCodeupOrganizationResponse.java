// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCodeupOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCodeupOrganizationResponse setBody(GetCodeupOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCodeupOrganizationResponseBody getBody() {
        return this.body;
    }

}
