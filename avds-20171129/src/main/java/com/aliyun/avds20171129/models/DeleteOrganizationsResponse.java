// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOrganizationsResponseBody body;

    public static DeleteOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationsResponse self = new DeleteOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrganizationsResponse setBody(DeleteOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrganizationsResponseBody getBody() {
        return this.body;
    }

}
