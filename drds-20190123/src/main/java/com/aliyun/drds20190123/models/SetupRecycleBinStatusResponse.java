// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupRecycleBinStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetupRecycleBinStatusResponseBody body;

    public static SetupRecycleBinStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupRecycleBinStatusResponse self = new SetupRecycleBinStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetupRecycleBinStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupRecycleBinStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupRecycleBinStatusResponse setBody(SetupRecycleBinStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupRecycleBinStatusResponseBody getBody() {
        return this.body;
    }

}
