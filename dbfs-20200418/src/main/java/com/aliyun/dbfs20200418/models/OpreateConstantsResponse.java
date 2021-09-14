// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class OpreateConstantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpreateConstantsResponseBody body;

    public static OpreateConstantsResponse build(java.util.Map<String, ?> map) throws Exception {
        OpreateConstantsResponse self = new OpreateConstantsResponse();
        return TeaModel.build(map, self);
    }

    public OpreateConstantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpreateConstantsResponse setBody(OpreateConstantsResponseBody body) {
        this.body = body;
        return this;
    }
    public OpreateConstantsResponseBody getBody() {
        return this.body;
    }

}
