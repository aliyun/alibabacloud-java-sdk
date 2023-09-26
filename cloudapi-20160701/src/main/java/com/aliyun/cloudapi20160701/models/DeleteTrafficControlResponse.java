// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrafficControlResponseBody body;

    public static DeleteTrafficControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlResponse self = new DeleteTrafficControlResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficControlResponse setBody(DeleteTrafficControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficControlResponseBody getBody() {
        return this.body;
    }

}
