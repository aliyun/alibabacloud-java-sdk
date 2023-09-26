// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DeleteApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiResponseBody body;

    public static DeleteApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiResponse self = new DeleteApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiResponse setBody(DeleteApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiResponseBody getBody() {
        return this.body;
    }

}
