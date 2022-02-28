// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeleteSitePairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSitePairResponseBody body;

    public static DeleteSitePairResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSitePairResponse self = new DeleteSitePairResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSitePairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSitePairResponse setBody(DeleteSitePairResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSitePairResponseBody getBody() {
        return this.body;
    }

}
