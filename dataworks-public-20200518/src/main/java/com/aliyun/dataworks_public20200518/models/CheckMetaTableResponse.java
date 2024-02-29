// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckMetaTableResponseBody body;

    public static CheckMetaTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaTableResponse self = new CheckMetaTableResponse();
        return TeaModel.build(map, self);
    }

    public CheckMetaTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMetaTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckMetaTableResponse setBody(CheckMetaTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMetaTableResponseBody getBody() {
        return this.body;
    }

}
