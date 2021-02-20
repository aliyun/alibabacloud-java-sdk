// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateWebCertResponseBody body;

    public static AssociateWebCertResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateWebCertResponse self = new AssociateWebCertResponse();
        return TeaModel.build(map, self);
    }

    public AssociateWebCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateWebCertResponse setBody(AssociateWebCertResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateWebCertResponseBody getBody() {
        return this.body;
    }

}
