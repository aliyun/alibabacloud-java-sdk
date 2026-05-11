// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceRolloutResponseBody body;

    public static UpdateServiceRolloutResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRolloutResponse self = new UpdateServiceRolloutResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRolloutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceRolloutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceRolloutResponse setBody(UpdateServiceRolloutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceRolloutResponseBody getBody() {
        return this.body;
    }

}
