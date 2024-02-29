// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SetDataSourceShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDataSourceShareResponseBody body;

    public static SetDataSourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataSourceShareResponse self = new SetDataSourceShareResponse();
        return TeaModel.build(map, self);
    }

    public SetDataSourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataSourceShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataSourceShareResponse setBody(SetDataSourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataSourceShareResponseBody getBody() {
        return this.body;
    }

}
