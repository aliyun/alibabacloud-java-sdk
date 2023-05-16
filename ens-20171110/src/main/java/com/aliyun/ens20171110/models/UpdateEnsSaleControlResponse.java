// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateEnsSaleControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnsSaleControlResponseBody body;

    public static UpdateEnsSaleControlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnsSaleControlResponse self = new UpdateEnsSaleControlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnsSaleControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnsSaleControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnsSaleControlResponse setBody(UpdateEnsSaleControlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnsSaleControlResponseBody getBody() {
        return this.body;
    }

}
