// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteHaVipsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHaVipsResponseBody body;

    public static DeleteHaVipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHaVipsResponse self = new DeleteHaVipsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHaVipsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHaVipsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHaVipsResponse setBody(DeleteHaVipsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHaVipsResponseBody getBody() {
        return this.body;
    }

}
