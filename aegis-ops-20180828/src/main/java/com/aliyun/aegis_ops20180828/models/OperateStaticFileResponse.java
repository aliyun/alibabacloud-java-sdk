// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class OperateStaticFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateStaticFileResponseBody body;

    public static OperateStaticFileResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateStaticFileResponse self = new OperateStaticFileResponse();
        return TeaModel.build(map, self);
    }

    public OperateStaticFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateStaticFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateStaticFileResponse setBody(OperateStaticFileResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateStaticFileResponseBody getBody() {
        return this.body;
    }

}
