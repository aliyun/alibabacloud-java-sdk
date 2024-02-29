// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLDAPConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteLDAPConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLDAPConfigResponse setBody(DeleteLDAPConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDAPConfigResponseBody getBody() {
        return this.body;
    }

}
