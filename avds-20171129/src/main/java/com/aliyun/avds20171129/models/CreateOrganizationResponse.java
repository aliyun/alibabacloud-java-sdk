// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrganizationResponseBody body;

    public static CreateOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationResponse self = new CreateOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrganizationResponse setBody(CreateOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrganizationResponseBody getBody() {
        return this.body;
    }

}
