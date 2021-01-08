// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDevopsOrganizationResponseBody body;

    public static CreateDevopsOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsOrganizationResponse self = new CreateDevopsOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDevopsOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDevopsOrganizationResponse setBody(CreateDevopsOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDevopsOrganizationResponseBody getBody() {
        return this.body;
    }

}
