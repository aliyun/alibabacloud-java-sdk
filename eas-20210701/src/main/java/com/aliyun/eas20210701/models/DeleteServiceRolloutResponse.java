// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteServiceRolloutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceRolloutResponseBody body;

    public static DeleteServiceRolloutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceRolloutResponse self = new DeleteServiceRolloutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceRolloutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceRolloutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceRolloutResponse setBody(DeleteServiceRolloutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceRolloutResponseBody getBody() {
        return this.body;
    }

}
