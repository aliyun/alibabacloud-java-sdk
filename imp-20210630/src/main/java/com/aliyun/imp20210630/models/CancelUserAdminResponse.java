// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CancelUserAdminResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelUserAdminResponseBody body;

    public static CancelUserAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUserAdminResponse self = new CancelUserAdminResponse();
        return TeaModel.build(map, self);
    }

    public CancelUserAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelUserAdminResponse setBody(CancelUserAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelUserAdminResponseBody getBody() {
        return this.body;
    }

}
