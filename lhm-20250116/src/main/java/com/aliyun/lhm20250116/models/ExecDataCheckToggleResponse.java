// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckToggleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDataCheckToggleResponseBody body;

    public static ExecDataCheckToggleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckToggleResponse self = new ExecDataCheckToggleResponse();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckToggleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDataCheckToggleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDataCheckToggleResponse setBody(ExecDataCheckToggleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDataCheckToggleResponseBody getBody() {
        return this.body;
    }

}
