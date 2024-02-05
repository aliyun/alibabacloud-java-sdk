// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRangeResponseBody body;

    public static UpdateRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRangeResponse self = new UpdateRangeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRangeResponse setBody(UpdateRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRangeResponseBody getBody() {
        return this.body;
    }

}
