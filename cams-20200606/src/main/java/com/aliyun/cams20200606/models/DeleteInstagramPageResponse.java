// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteInstagramPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstagramPageResponseBody body;

    public static DeleteInstagramPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstagramPageResponse self = new DeleteInstagramPageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstagramPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstagramPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstagramPageResponse setBody(DeleteInstagramPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstagramPageResponseBody getBody() {
        return this.body;
    }

}
