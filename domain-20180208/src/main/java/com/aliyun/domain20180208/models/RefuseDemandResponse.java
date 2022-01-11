// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RefuseDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefuseDemandResponseBody body;

    public static RefuseDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseDemandResponse self = new RefuseDemandResponse();
        return TeaModel.build(map, self);
    }

    public RefuseDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseDemandResponse setBody(RefuseDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseDemandResponseBody getBody() {
        return this.body;
    }

}
