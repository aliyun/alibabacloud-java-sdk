// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBizEntityResponseBody body;

    public static DeleteBizEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizEntityResponse self = new DeleteBizEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBizEntityResponse setBody(DeleteBizEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizEntityResponseBody getBody() {
        return this.body;
    }

}
