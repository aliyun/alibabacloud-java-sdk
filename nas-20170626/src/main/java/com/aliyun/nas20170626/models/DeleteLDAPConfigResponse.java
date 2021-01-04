// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLDAPConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDAPConfigResponseBody body;

    public static DeleteLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDAPConfigResponse self = new DeleteLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDAPConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDAPConfigResponse setBody(DeleteLDAPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDAPConfigResponseBody getBody() {
        return this.body;
    }

}
