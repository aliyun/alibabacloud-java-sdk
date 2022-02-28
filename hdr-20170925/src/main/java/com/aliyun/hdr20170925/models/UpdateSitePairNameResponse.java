// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateSitePairNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSitePairNameResponseBody body;

    public static UpdateSitePairNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSitePairNameResponse self = new UpdateSitePairNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSitePairNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSitePairNameResponse setBody(UpdateSitePairNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSitePairNameResponseBody getBody() {
        return this.body;
    }

}
