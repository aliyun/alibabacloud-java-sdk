// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLDAPConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDAPConfigResponseBody body;

    public static CreateLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDAPConfigResponse self = new CreateLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDAPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDAPConfigResponse setBody(CreateLDAPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDAPConfigResponseBody getBody() {
        return this.body;
    }

}
