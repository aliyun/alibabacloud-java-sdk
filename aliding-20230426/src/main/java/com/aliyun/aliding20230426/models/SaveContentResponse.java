// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SaveContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveContentResponseBody body;

    public static SaveContentResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContentResponse self = new SaveContentResponse();
        return TeaModel.build(map, self);
    }

    public SaveContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContentResponse setBody(SaveContentResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContentResponseBody getBody() {
        return this.body;
    }

}
