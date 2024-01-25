// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLogConfigResponseBody body;

    public static DeleteLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogConfigResponse self = new DeleteLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogConfigResponse setBody(DeleteLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogConfigResponseBody getBody() {
        return this.body;
    }

}
