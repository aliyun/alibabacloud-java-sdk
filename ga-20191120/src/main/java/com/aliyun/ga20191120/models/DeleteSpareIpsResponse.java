// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteSpareIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpareIpsResponseBody body;

    public static DeleteSpareIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpareIpsResponse self = new DeleteSpareIpsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpareIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpareIpsResponse setBody(DeleteSpareIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpareIpsResponseBody getBody() {
        return this.body;
    }

}
