// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class UpdateInsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInsResponseBody body;

    public static UpdateInsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInsResponse self = new UpdateInsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInsResponse setBody(UpdateInsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInsResponseBody getBody() {
        return this.body;
    }

}
