// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDevopsOrganizationResponseBody body;

    public static DeleteDevopsOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsOrganizationResponse self = new DeleteDevopsOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevopsOrganizationResponse setBody(DeleteDevopsOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevopsOrganizationResponseBody getBody() {
        return this.body;
    }

}
